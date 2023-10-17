package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.BlogPostNotFoundException;
import com.masai.Repository.BlogRepositoy;
import com.masai.model.BlogPost;
@Service
public class BlogPostServiceImpl implements BlogService{
	@Autowired
	private BlogRepositoy blogRepo;

	@Override
	public BlogPost createBlogPost(BlogPost blogPost) throws BlogPostNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println(blogPost.toString());
		return blogRepo.save(blogPost);
	}

	@Override
	public String deleteblogs() throws BlogPostNotFoundException {
		
		blogRepo.deleteAll();
	return	"Sucessfully Deleted";
	}

}
