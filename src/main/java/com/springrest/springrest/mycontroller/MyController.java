package com.springrest.springrest.mycontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadServices;
	
	
	//get the load
	
	@GetMapping("/load")
	public List<Load> getLoads(){
		return this.loadServices.getLoads();
		}
	

	
//get load by id
	@GetMapping("load/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.loadServices.getLoad(Long.parseLong(loadId));
	}
	
	
	
//get load by shipper id
//	@GetMapping("/load")
//	public List<Load> getLoadsByShipperId(@RequestParam String shipperId ){
//		return this.loadServices.getLoadsByShipperId(shipperId);
//		
//	}
	
	
	//add load using POST request
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load){
		return this.loadServices.addLoad(load);
	}
	
	
	//update load using PUT request
	@PutMapping("/load")
	public Load updateLoad(@RequestBody Load load) {
		return this.loadServices.updateLoad(load);
	}
	
	
	//delete load by DELETE request
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.loadServices.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

}
	}
