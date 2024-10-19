package com.example.demo.user;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
    //GET ALL USERS
    public List<User>getAllUsers(){
    	return (List<User>) userRepository.findAll();
    }
    //CREATE
    public User createUser(User user) {
    	return userRepository.save(user);
    }
    //GET ONLY ONE USER
    public User getUserById(String id ) {
    	return userRepository.findById(id).orElse(null);
    }
    //UPDATE
    public User updateUser(String id ,User user) {
    	    user.setId(id);
    		return userRepository.save(user);
    	}
    //DELETE
    public void deleteUser(String id) {
    	userRepository.deleteById(id);
    }
}