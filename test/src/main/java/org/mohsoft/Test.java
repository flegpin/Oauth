package org.mohsoft;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Test {
	

	@GetMapping("/cookie")
	public String cookie()   {
	return "index";
	}
}
