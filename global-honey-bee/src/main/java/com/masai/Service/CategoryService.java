package com.masai.Service;

import org.springframework.stereotype.Service;

import com.masai.Exception.BlogPostNotFoundException;
import com.masai.Exception.CategorNotFoundException;
import com.masai.model.BlogPost;
import com.masai.model.Category;


public interface CategoryService {
	public Category createCategory(Category category) throws CategorNotFoundException;
	public String deleteCategory() throws CategorNotFoundException;
}
