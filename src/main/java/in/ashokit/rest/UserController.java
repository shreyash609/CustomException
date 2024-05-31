package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.UserNotFoundException;

@RestController
public class UserController {

	
	@GetMapping("/get/{id}")
	public String getNameById(@PathVariable("id") Integer id) {
		
		if(id >=100) {
			return "shreyash";
		}else {
			 throw new UserNotFoundException("User not found");
		}
	}
}
