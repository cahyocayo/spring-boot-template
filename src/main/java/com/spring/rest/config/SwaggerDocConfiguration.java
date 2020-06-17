package com.spring.rest.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by cahyocayo
 */

@Configuration
@EnableSwagger2
public class SwaggerDocConfiguration {
    @Bean
    public Docket swaggerDoc() {
        //Adding Header
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spring.rest"))
                .paths(regex("/api.*"))
                .build();
    }

    private static Predicate<String> regex(final String pathRegex) {
        return new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.matches(pathRegex);
            }
        };
    }
}
