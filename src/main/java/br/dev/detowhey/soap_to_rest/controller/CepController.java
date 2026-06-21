package br.dev.detowhey.soap_to_rest.controller;

import br.dev.detowhey.soap_to_rest.model.CepXml;
import br.dev.detowhey.soap_to_rest.service.CepService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
public class CepController {

    private final CepService cepService;

    @Autowired
    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/cep/{cep}")
    public CepXml getConsultCep(
            @NotBlank(message = "Cep is required")
            @Pattern(regexp = "\\d+", message = "Cep contains numbers only")
            @PathVariable String cep
    ) {
        return cepService.consultCep(cep);
    }
}
