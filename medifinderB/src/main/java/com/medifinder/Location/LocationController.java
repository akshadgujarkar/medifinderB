package com.medifinder.Location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	LocationService locationService;
	
	@Autowired
	LocationRepository locationRepository;
	
	@GetMapping("getAll")
	public List<Location> getAllLocation(){
		return locationService.getAllLocation();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addLocation(@RequestBody Location location){
		locationRepository.save(location);
		return ResponseEntity.ok("location added successfully");
	}
}
