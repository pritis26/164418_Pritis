package io.schultz.dustin.configclientapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="some")
public class configClientAppConfiguration {
private String property;

public String getProperty() {
	return property;
}

public void setProperty(String property) {
	this.property = property;
}

}
