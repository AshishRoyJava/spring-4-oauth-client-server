package ml.bootcode.spring.auth.server;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

	@GetMapping("/principal")
	public Principal getUser(Principal principal) {
		return principal;
	}

	@GetMapping
	public String sayHello() {
		return "Helo World!";
	}
}
