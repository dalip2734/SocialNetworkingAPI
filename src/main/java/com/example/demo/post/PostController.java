package com.example.demo.post;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	@Autowired
	private PostService postService;
	
	@PostMapping
	public Post createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}
	 @GetMapping
	    public List<Post> getAllPosts() {
	        return postService.getAllPosts();
	    }
	    @GetMapping("/{id}")
	    public Post getPostById(@PathVariable String id) {
	        return postService.getPostById(id);
	    }
	    @PutMapping("/{id}")
	    public Post updatePost(@PathVariable String id, @RequestBody Post post) {
	        return postService.updatePost(id, post);
	    }
	    @DeleteMapping("/{id}")
	    public void deletePost(@PathVariable String id) {
	        postService.deletePost(id);
	    }
}
