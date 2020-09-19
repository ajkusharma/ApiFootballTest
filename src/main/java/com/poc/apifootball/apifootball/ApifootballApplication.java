package com.poc.apifootball.apifootball;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApifootballApplication {
	
	//private static final Logger log = (Logger) LoggerFactory.getLogger(ApifootballApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ApifootballApplication.class, args);
	}
	
	   @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	   
	   /*List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
	 //Add the Jackson Message converter
	 MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

	 // Note: here we are making this converter to process any kind of response, 
	 // not only application/*json, which is the default behaviour
	 converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
	 messageConverters.add(converter);  
	 restTemplate.setMessageConverters(messageConverters); 

	   
	   @Bean
		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
			return args -> {
				Country country = restTemplate.getForObject(
						"https://apiv2.apifootball.com/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978" + 
						"", Country.class);
				//log.info(country.toString());
				System.out.println(country.toString());
			};
*/


}
