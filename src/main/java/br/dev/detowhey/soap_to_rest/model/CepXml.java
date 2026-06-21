package br.dev.detowhey.soap_to_rest.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xmlcep")
public record CepXml(
        @JacksonXmlProperty(localName = "cep") String cep,
        @JacksonXmlProperty(localName = "logradouro") String logradouro,
        @JacksonXmlProperty(localName = "complemento") String complemento,
        @JacksonXmlProperty(localName = "bairro") String bairro,
        @JacksonXmlProperty(localName = "localidade") String localidade,
        @JacksonXmlProperty(localName = "uf") String uf,
        @JacksonXmlProperty(localName = "estado") String estado,
        @JacksonXmlProperty(localName = "regiao") String regiao,
        @JacksonXmlProperty(localName = "ibge") String ibge,
        @JacksonXmlProperty(localName = "ddd") String ddd,
        @JacksonXmlProperty(localName = "siafi") String siafi
) {
}
