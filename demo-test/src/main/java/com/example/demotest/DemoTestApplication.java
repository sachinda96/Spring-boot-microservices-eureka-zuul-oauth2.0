package com.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class DemoTestApplication extends GenericFilterBean {

	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}


	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) servletRequest;

		System.out.println("work");
		System.out.println(req.getHeader("Authorization"));
		filterChain.doFilter(servletRequest, servletResponse);
	}
}
