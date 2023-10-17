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
import com.masai.Exception.CategorNotFoundException;
import com.masai.Service.CategoryService;
import com.masai.model.BlogPost;
import com.masai.model.Category;

@RestController
@RequestMapping("/cat")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	 @PostMapping("category")
	 public ResponseEntity<Category> addCategory(@RequestBody Category category) throws CategorNotFoundException {
		 Category createactegory = categoryService.createCategory(category);
	        return new ResponseEntity<>(createactegory, HttpStatus.CREATED);
	    }
   
   @DeleteMapping("category")
	public ResponseEntity<String> deleteAllCategory() throws CategorNotFoundException {
		String u=categoryService.deleteCategory();
	
		
		return new ResponseEntity<String>(u, HttpStatus.OK);
		
		
	}

}
