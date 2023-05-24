package comercio.electronico.prueba.tecnica.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
    public static final String API_CONTACT_NAME = "Mauricio Sulca Chavez";
    public static final String API_CONTACT_URL = "https://www.linkedin.com/in/mauricio-sulca-chavez/";
    public static final String API_CONTACT_EMAIL = "mau.sulca@gmail.com";
    public static final String API_DESCRIPTION = "Prueba Tecnica";
    public static final String API_TITLE = "Api Rest De Comercio Electronico";
    public static final String API_VERSION = "1.0.0";

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(
                        RequestHandlerSelectors
                                .basePackage("comercio.electronico.prueba.tecnica.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .contact(new Contact(API_CONTACT_NAME, API_CONTACT_URL, API_CONTACT_EMAIL))
                .description(API_DESCRIPTION)
                .title(API_TITLE)
                .version(API_VERSION)
                .build();
    }
}