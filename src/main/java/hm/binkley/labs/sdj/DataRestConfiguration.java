package hm.binkley.labs.sdj;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration
        .SpringDataRestConfiguration;

@Configuration
@Import(SpringDataRestConfiguration.class)
public class DataRestConfiguration {}
