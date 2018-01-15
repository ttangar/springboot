/**
 *
 */
package com.tarun.bootlearn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.base.Predicate;
import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author tarun.k.tangar
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/api/fundinfo.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("SpringBootStarter API")
                .description("SpringBootStarter API reference for developers")
                .termsOfServiceUrl("http://taruntangar.it")
                .contact("tarun.tangar@gmail.com").license("Accenture License")
                .licenseUrl("tarun.tangar@gmail.com").version("1.0").build();
    }
}
