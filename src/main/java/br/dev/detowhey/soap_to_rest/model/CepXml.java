package br.dev.detowhey.soap_to_rest.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xmlcep")
public record CepXml(
        @JacksonXmlProperty(localName = "cep") String zipCode,
        @JacksonXmlProperty(localName = "logradouro") String street,
        @JacksonXmlProperty(localName = "complemento") String complement,
        @JacksonXmlProperty(localName = "bairro") String neighborhood,
        @JacksonXmlProperty(localName = "localidade") String city,
        @JacksonXmlProperty(localName = "uf") String uf,
        @JacksonXmlProperty(localName = "estado") String state,
        @JacksonXmlProperty(localName = "regiao") String region,
        @JacksonXmlProperty(localName = "ibge") String ibgeCode,
        @JacksonXmlProperty(localName = "ddd") String areaCode,
        @JacksonXmlProperty(localName = "siafi") String siafiCode
) {
}
