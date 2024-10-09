package com.springrest.springrest.mycontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
//	@GetMapping("/load")
//    public List<Load> getShipperLoad(){
//			return this.loadServices.getShipperLoad(shipperId);
//		}
	

	@GetMapping("load/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.loadServices.getLoad(Long.parseLong(loadId));
	}
	
	@GetMapping("/load")
	public List<Load> getLoadsByShipperId(@RequestParam String shipperId ){
		return this.loadServices.getLoadsByShipperId(shipperId);
		
	}
	
	
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load){
		return this.loadServices.addLoad(load);
	}
	
	@PutMapping("/load")
	public Load updateLoad(@RequestBody Load load) {
		return this.loadServices.updateLoad(load);
	}

}
