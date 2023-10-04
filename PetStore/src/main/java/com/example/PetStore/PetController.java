package com.example.PetStore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@GetMapping("/pets")
	public String listPet() {
		
		Pet p = new Pet(1, "Buddy", "Labrador");
		return p.toString();
	}
}
