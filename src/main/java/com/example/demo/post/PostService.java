package com.example.demo.post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
    //GET ALL POSTS
    public List<Post>getAllPosts(){
    	return (List<Post>) postRepository.findAll();
    }
    //CREATE
    public Post createPost(Post post) {
    	return postRepository.save(post);
    }
    //GET ONLY ONE POST
    public Post getPostById(String id ) {
    	return postRepository.findById(id).orElse(null);
    }
    //UPDATE
    public Post updatePost(String id ,Post post) {
    	    post.setId(id);
    		return postRepository.save(post);
    	}
    //DELETE
    public void deletePost(String id) {
    	postRepository.deleteById(id);
    }
}
