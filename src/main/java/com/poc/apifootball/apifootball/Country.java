package com.poc.apifootball.apifootball;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

  @JsonProperty("country_id")	
  private long country_id;
  @JsonProperty("country_name")	
  private String country_name;
  
  
  @Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + "]";
	}

  
}

