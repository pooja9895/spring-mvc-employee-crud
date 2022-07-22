package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class EmployeeConfig {
	
	@Bean
	public EntityManager getEntityManager() {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
		return factory.createEntityManager();
		}
	
	@Bean
	public EntityTransaction getTransaction() {
		return getEntityManager().getTransaction();
	}
}
