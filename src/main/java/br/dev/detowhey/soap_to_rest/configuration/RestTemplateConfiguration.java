package br.dev.detowhey.soap_to_rest.configuration;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class RestTemplateConfiguration {

    private static final String JAXB_2 = "Jaxb2";
    private final String url;

    public RestTemplateConfiguration(@Value("${url.via-zipCode}") String url) {
        if (url.isBlank())
            throw new RuntimeException("Url cannot be null");

        this.url = url;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate restTemplate = new RestTemplate();
        XmlMapper xmlMapper = new XmlMapper();
        MappingJackson2XmlHttpMessageConverter xmlConverter = new MappingJackson2XmlHttpMessageConverter(xmlMapper);
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        converters.removeIf(converter -> converter
                instanceof MappingJackson2XmlHttpMessageConverter
                || converter.getClass().getSimpleName().contains(JAXB_2));
        converters.add(xmlConverter);
        return builder.rootUri(url).build();
    }
}
