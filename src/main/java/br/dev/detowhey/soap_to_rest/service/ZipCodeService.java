package br.dev.detowhey.soap_to_rest.service;

import br.dev.detowhey.soap_to_rest.dto.ZipCodeResponseDTO;
import br.dev.detowhey.soap_to_rest.model.CepXml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static br.dev.detowhey.soap_to_rest.converter.ZipCodeConverter.toCepResponseDTO;

@Service
public class ZipCodeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZipCodeService.class);
    private static final String XML = "xml";
    private final RestTemplate restTemplate;

    public ZipCodeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ZipCodeResponseDTO consultCep(String zipCode) {
        var pathUrl = String.format("/%s/%s/", zipCode, XML);
        LOGGER.info("Request for the priced ZIP code service {}", zipCode);
        var cepFromXml = restTemplate.getForObject(pathUrl, CepXml.class);
        return toCepResponseDTO(cepFromXml);
    }
}
