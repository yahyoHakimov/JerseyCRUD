package uz.project.jerseycrud;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "uz.project.jerseycrud")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("uz.project.resources");
    }
}
