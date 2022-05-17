package com.hf.test.spring.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Franklin Choque
 * @version 1.0: RestTemplateConf.java; mayo. 16, 2022 @ 21:47
 */
//@Configuration
public class RestTemplateConf {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
