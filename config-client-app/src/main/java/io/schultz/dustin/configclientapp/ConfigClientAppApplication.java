package io.schultz.dustin.configclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClientAppApplication {
	@Autowired
private configClientAppConfiguration properties;
	@Value("${some.other.property}")
	private String someOtherProperty;
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppApplication.class, args);
	}
	
public String printConfig() {
StringBuilder sb=new StringBuilder();
sb.append(properties.getProperty());
sb.append(" || ");
sb.append(someOtherProperty);
return sb.toString();
}
}

