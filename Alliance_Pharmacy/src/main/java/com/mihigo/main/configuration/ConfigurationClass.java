package com.mihigo.main.configuration;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class ConfigurationClass extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().permitAll();

		http.cors(c -> {
			CorsConfigurationSource cs = r -> {
				CorsConfiguration cc = new CorsConfiguration();
				cc.setAllowedOrigins(List.of("*"));
				cc.setAllowedMethods(List.of("*"));
				cc.setAllowedHeaders(List.of("*"));
				return cc;
			};
			c.configurationSource(cs);
		});
	}
}
