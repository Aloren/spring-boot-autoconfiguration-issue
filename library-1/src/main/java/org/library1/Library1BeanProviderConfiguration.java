package org.library1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Library1BeanProviderConfiguration {

    @Bean
    public Library1 library1() {
        return new Library1();
    }
}
