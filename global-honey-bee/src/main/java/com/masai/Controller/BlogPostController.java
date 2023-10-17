package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.BlogPostNotFoundException;
import com.masai.Service.BlogService;
import com.masai.model.BlogPost;

@RestController
@RequestMapping("/global")
public class BlogPostController {
	   @Autowired
		private BlogService blogService;
	   
	   @PostMapping("blogpost")
		 public ResponseEntity<BlogPost> addblog(@RequestBody BlogPost blogpost) throws BlogPostNotFoundException {
		        BlogPost createblogPost = blogService.createBlogPost(blogpost);
		        return new ResponseEntity<>(createblogPost, HttpStatus.CREATED);
		    }
	   
	   @DeleteMapping("blogpost")
		public ResponseEntity<String> deleteAllBlogs() throws BlogPostNotFoundException {
			String u=blogService.deleteblogs();
		
			
			return new ResponseEntity<String>(u, HttpStatus.OK);
			
			
		}

}
