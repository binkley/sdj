package hm.binkley.labs.sdj;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration
        .SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class Application {
    public static void main(final String... args) {
        run(Application.class, args);
    }
}
