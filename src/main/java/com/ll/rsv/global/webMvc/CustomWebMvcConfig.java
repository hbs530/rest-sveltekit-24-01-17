package com.ll.rsv.global.webMvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ll.rsv.global.app.AppConfig;

@Configuration
public class CustomWebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**")
				.allowedOrigins(
						"https://cdpn.io",
						AppConfig.getSiteFrontUrl()
				)
				.allowedMethods("*")
				.allowedHeaders("*")
				.allowCredentials(true);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/gen/**")
				.addResourceLocations("file:///" + AppConfig.getGenFileDirPath() + "/");
	}
}
