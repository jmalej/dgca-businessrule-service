package eu.europa.ec.dgc.businessrule.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
@RequiredArgsConstructor
public class OpenApiConfig {

    private final BuildProperties buildProperties;

    /**
     * Configure the OpenApi bean with title and version.
     *
     * @return the OpenApi bean.
     */
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("EU Digital COVID Certificate Business Rule Service")
                .description("The API defines how to exchange business rule information for "
                    + "the EU digital COVID certificates.")
                .version(buildProperties.getVersion())
                .license(new License()
                    .name("Apache 2.0")
                    .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}