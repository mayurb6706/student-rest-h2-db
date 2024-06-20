package com.cwm.spring_student.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.cwm.spring_student.domain")
@EnableJpaRepositories("com.cwm.spring_student.repos")
@EnableTransactionManagement
public class DomainConfig {
}
