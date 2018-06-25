package com.example.marcuseisele.updatecacheonsuccess.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableCaching
public class UpdateCacheOnSuccessConfig {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
