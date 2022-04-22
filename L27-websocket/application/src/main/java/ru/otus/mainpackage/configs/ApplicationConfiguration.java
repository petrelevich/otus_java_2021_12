package ru.otus.mainpackage.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    AppConfigForBean messageConfig(@Value("${application.param-name}") String param) {
        if (param == null)  {

        }
        return new AppConfigForBean(param);
    }
}
