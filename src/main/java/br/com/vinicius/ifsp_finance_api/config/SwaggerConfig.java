package br.com.vinicius.ifsp_finance_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("IFSP Finance API")
                        .description("API Rest da aplicação Finance, contendo as funcionalidades de CRUD de finanças.")
                        .contact(new Contact()
                                .name("Time Backend")
                                .email("viniciusdamsil@gmail.com")));
    }
}
