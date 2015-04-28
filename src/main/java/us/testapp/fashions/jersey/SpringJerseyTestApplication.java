package us.testapp.fashions.jersey;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class SpringJerseyTestApplication extends ResourceConfig {

	public SpringJerseyTestApplication() {
		packages("us.testapp.fashions").register(JacksonFeature.class);
	}
}
