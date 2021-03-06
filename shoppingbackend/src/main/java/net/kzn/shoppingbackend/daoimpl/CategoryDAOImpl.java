package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;
@Repository("categoryDao")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories =new ArrayList<>();
	
	
	static {
		Category category = new Category();
		
		//addig fist category
		category.setId(1);
		category.setName("television");
		category.setDescription("This is");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
category = new Category();
		
		//addig 2nd category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
category = new Category();
		
		//addig 3rd category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		//enchanced for loop
		
		for(Category category : categories) {
			if(category.getId()==id) {
				return category;
			}
		}
		return null;
	}

}
