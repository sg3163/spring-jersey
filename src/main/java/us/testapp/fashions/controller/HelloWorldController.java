package us.testapp.fashions.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Path("/helloworld")
@Component
public class HelloWorldController {

	@GET
	@Path("/sayHi")
	public String hello() {
		return "Hello World!!!";
	}
}
