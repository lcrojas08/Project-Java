package com.usuario.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BkUsuariosClienteokApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(BkUsuariosClienteokApplication.class, args);
	}
	
	@Override
	public void run (String...args) throws Exception {
		String sql = "SELECT * FROM Cliente";
		
		List<Cliente> clientes = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Cliente.class));
		
	clientes.forEach(System.out :: println);
	
	}
	@Bean
	public WebMvcConfigurer cosrConfigurer() {
		return  new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
			
		};
		
	}
}