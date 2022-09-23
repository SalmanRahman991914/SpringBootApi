package com.SpringApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringApi.Services.CourceService;

import com.SpringApi.entities.Cource;

@RestController
public class MyController {
	@Autowired
	private CourceService courseService;
	
@GetMapping("/home")
	public String home() {
	System.out.println("hello controller");	
		return "this is home controller";
		
	}
//gettig the data
@GetMapping("/cource")
public List<Cource> getCources(){
	
	return this.courseService.GetCources();
}
//adding the data
@PostMapping("/cource")
public Cource addCource(@RequestBody Cource cource) {
	return this.courseService.addCource(cource);
	
}
//updating the data
@PutMapping("/cource")
public Cource updateCource(@RequestBody Cource cource) {
	return this.courseService.updtCource(cource);
}

}


