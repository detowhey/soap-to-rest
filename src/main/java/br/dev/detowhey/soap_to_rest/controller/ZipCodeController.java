package br.dev.detowhey.soap_to_rest.controller;

import br.dev.detowhey.soap_to_rest.dto.ZipCodeResponseDTO;
import br.dev.detowhey.soap_to_rest.service.ZipCodeService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
public class ZipCodeController {

    private final ZipCodeService zipCodeService;

    public ZipCodeController(ZipCodeService zipCodeService) {
        this.zipCodeService = zipCodeService;
    }

    @GetMapping("/zipcode/{zipCode}")
    public ZipCodeResponseDTO getConsultCep(
            @NotBlank(message = "Zip code is required")
            @Pattern(regexp = "\\d+", message = "Zip code contains numbers only")
            @PathVariable String zipCode
    ) {
        return zipCodeService.consultCep(zipCode);
    }
}
