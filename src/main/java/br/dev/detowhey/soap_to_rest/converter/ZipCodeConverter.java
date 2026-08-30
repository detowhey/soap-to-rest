package br.dev.detowhey.soap_to_rest.converter;

import br.dev.detowhey.soap_to_rest.dto.ZipCodeResponseDTO;
import br.dev.detowhey.soap_to_rest.model.CepXml;

public class ZipCodeConverter {

    private ZipCodeConverter() {
    }

    public static ZipCodeResponseDTO toCepResponseDTO(CepXml cepXml){
        return ZipCodeResponseDTO.builder()
                .withZipCode(cepXml.zipCode())
                .withStreet(cepXml.street())
                .withNeighborhood(cepXml.neighborhood())
                .withCity(cepXml.city())
                .withUf(cepXml.uf())
                .withState(cepXml.state())
                .withRegion(cepXml.region())
                .build();
    }
}
