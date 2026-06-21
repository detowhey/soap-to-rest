package br.dev.detowhey.soap_to_rest;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SoapToRestApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void application_context_is_not_null() {
		assertThat(applicationContext).isNotNull();
    }
}
