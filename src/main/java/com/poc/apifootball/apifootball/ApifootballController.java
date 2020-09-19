package com.poc.apifootball.apifootball;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/client")
public class ApifootballController {
	
private static final ObjectMapper objectMapper= new ObjectMapper();
private static final RestTemplate restTemplate= new RestTemplate();
	
@Autowired
private OdsProps odsprops;

@GetMapping(value="/{id}")
public String getId(@PathVariable() Long id) throws IOException{
	
	String url= String.format("https://apiv2.apifootball.com/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", id);
	ResponseEntity<String>  response =restTemplate.getForEntity(url, String.class);
	Country country=objectMapper.readValue(response.getBody(),Country.class);
	objectMapper.writeValueAsString(country);
	System.out.println(country.toString());
	return "success";
	
}

/*
 * final String footballResourceUrl= "https://apiv2.apifootball.com/?get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";

 * @RequestMapping(value = "/getProductList1" + "") public HttpEntity<Country>
 * connectToRestService()
 * 
 * { HttpHeaders headers = new HttpHeaders();
 * headers.setContentType(MediaType.APPLICATION_JSON); UriComponentsBuilder
 * builder = UriComponentsBuilder.fromHttpUrl(footballResourceUrl);
 * HttpEntity<Country> entity = new HttpEntity<>(headers);
 * ResponseEntity<Country> response =
 * restTemplate.exchange(builder.build().encode().toUri(),HttpMethod.GET,entity,
 * Country.class); response.
 * 
 * }
 */












/*
 * @RequestMapping(value="/getProductList",method = RequestMethod.GET, produces
 * = MediaType.APPLICATION_JSON_VALUE) public void getProductList11(){
 * 
 * 
 * 
 * HttpHeaders headers = new HttpHeaders();
 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON)); HttpEntity
 * <String> entity = new HttpEntity<String>(headers);
 * 
 * RestTemplate restTemplate = new RestTemplate(); ResponseEntity<Country>
 * response = restTemplate.getForEntity(footballResourceUrl, Country.class);
 * response.getBody(); //return new ResponseEntity }
 */





}
