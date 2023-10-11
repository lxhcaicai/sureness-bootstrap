package com.github.surenessbootstrap.config;

import com.usthe.sureness.DefaultSurenessConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * sureness config,Use DefaultSurenessConfig
 */
@Configuration
public class SurenessConfiguration {

    @Bean
    public DefaultSurenessConfig surenessConfig() {
        return new DefaultSurenessConfig();
    }
}
