/**
 * 
 */
package com.riverstone.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riverstone.model.hibernatemapping.Categories;

/**
 * @author admin
 *
 */
public interface CategoriesRepository extends JpaRepository<Categories, String>{
	
	Categories findByName(String name);

}
