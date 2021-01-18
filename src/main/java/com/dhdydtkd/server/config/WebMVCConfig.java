package com.dhdydtkd.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods(
			HttpMethod.GET.name(),
    		HttpMethod.HEAD.name(),
    		HttpMethod.POST.name(),
    		HttpMethod.PUT.name(),
    		HttpMethod.DELETE.name())
		.allowedOrigins("https://cms.test.com","https://cms.test.com:8080");
	}
}
