package wellfernandes.com.github.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app-service")
public class AppConfiguration {

	private String app;
	private String defaultValue;

	public AppConfiguration(String app, String defaultValue) {
		this.app = app;
		this.defaultValue = defaultValue;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
}
