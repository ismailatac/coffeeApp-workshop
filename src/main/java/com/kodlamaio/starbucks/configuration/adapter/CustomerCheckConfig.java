package com.kodlamaio.starbucks.configuration.adapter;

import com.kodlamaio.starbucks.adapters.MernisServiceAdapter;
import com.kodlamaio.starbucks.business.abstracts.CustomerCheckService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerCheckConfig {
    @Bean
    public CustomerCheckService getCustomerCheckService(){
        return new MernisServiceAdapter();
    }
}
