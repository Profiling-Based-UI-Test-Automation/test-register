package testregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
 * springboot cors 설정 
 */

@Configuration
public class CORSConfig {
	@Bean 
	public WebMvcConfigurer corsConfigurer() { 
		return new WebMvcConfigurerAdapter() { 
			public void addCorsMappings(CorsRegistry registry) { 
				registry.addMapping("/**")
				.allowedOrigins("http://localhost:8090", "http://127.0.0.1:8090", "http://127.0.0.1:8090/application/", "http://127.0.0.1:8090/application", "http://192.168.33.10:8080", "http://localhost:2003", "http://127.0.0.1:2003")
                .allowedMethods("GET", "DELETE", "PUT", "POST", "OPTIONS");
			} 
		}; 
	}
}
