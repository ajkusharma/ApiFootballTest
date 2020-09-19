package com.poc.apifootball.apifootball;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("ods")
@Data
public class OdsProps {
	private String partyEntitySearchTemplate;

	

}
