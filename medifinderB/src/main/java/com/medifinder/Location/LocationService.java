package com.medifinder.Location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

	@Autowired
	LocationRepository locationRepository;
	
	public List<Location> getAllLocation(){
		List<Location> locations = new ArrayList<>();
		 locationRepository.findAll()
		 .forEach(locations::add);
		 return locations;
		
	}
}
