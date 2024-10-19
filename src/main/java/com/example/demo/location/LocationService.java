package com.example.demo.location;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
    //GET ALL LOCATIONS
    public List<Location> getAllLocations(){
    	return (List<Location>) locationRepository.findAll();
    }
    //CREATE
    public Location createLocation(Location location) {
    	return locationRepository.save(location);
    }
    //GET ONLY ONE LOCATION
    public Location getLocationById(String id ) {
    	return locationRepository.findById(id).orElse(null);
    }
    //UPDATE
    public Location updateLocation(String id ,Location location) {
    	    location.setId(id);
    		return locationRepository.save(location);
    	}
    //DELETE
    public void deleteLocation(String id) {
    	locationRepository.deleteById(id);
    }
}