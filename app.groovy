@RestController
public class HelloWorld {
	@RequestMapping("/")
	public String home() {
		"Hello World"
	}
}

// Run using spring-cli
// > spring run app.groovy
