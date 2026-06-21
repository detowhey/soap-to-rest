package br.dev.detowhey.soap_to_rest.service;

import br.dev.detowhey.soap_to_rest.model.CepXml;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    private static final String XML = "xml";
    private final RestTemplate restTemplate;

    public CepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CepXml consultCep(String cep) {
        var pathUrl = String.format("/%s/%s/", cep, XML);
        return restTemplate.getForObject(pathUrl, CepXml.class);
    }
}
