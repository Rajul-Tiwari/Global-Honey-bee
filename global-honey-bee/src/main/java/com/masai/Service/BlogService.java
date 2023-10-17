package com.masai.Service;

import org.springframework.stereotype.Service;

import com.masai.Exception.BlogPostNotFoundException;
import com.masai.model.BlogPost;


public interface BlogService {
	public BlogPost createBlogPost(BlogPost blogPost) throws BlogPostNotFoundException;
	public String deleteblogs() throws BlogPostNotFoundException;

}
