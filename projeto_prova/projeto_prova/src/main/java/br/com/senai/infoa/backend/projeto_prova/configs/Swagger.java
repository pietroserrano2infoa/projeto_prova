package br.com.senai.infoa.backend.projeto_prova.configs;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
info = @Info(
title = "API prova",
version = "1.0",
description = "API da prova"
)
)

public class Swagger {
    
}
