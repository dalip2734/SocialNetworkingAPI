package com.example.demo.location;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.user.User;


@RestController
@RequestMapping("/locations")
public class LocationController {
	@Autowired
	private LocationService locationService;
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationService.createLocation(location);
	}
	 @GetMapping
	    public List<Location> getAllLocations() {
	        return locationService.getAllLocations();
	    }
	    @GetMapping("/{id}")
	    public Location getLocationById(@PathVariable String id) {
	        return locationService.getLocationById(id);
	    }
	    @PutMapping("/{id}")
	    public Location updateLocation(@PathVariable String id, @RequestBody Location location) {
	        return locationService.updateLocation(id, location);
	    }
	    @DeleteMapping("/{id}")
	    public void deleteLocation(@PathVariable String id) {
	        locationService.deleteLocation(id);
	    }
}
