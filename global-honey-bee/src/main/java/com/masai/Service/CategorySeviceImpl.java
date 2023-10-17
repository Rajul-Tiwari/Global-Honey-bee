package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CategorNotFoundException;
import com.masai.Repository.CategoryRepository;
import com.masai.model.Category;
@Service
public class CategorySeviceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository  CategoryRepository;

	@Override
	public Category createCategory(Category category) throws CategorNotFoundException {
		// TODO Auto-generated method stub
		return CategoryRepository.save(category);
	}

	@Override
	public String deleteCategory() throws CategorNotFoundException {
		// TODO Auto-generated method stub
		
				CategoryRepository.deleteAll();;
				return "Sucessfully Deleted";
	}

}
