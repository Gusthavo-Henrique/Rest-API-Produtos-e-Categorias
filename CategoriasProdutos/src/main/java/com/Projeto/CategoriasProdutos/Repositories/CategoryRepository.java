package com.Projeto.CategoriasProdutos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.CategoriasProdutos.entities.Category;

@Repository  //Serve para implementar o codigo a baixo de maneira mais facil
public interface CategoryRepository extends JpaRepository<Category, Long>{
	//Antes era "class"
	
	//private Map<Long, Category> map = new HashMap<>();
	
	//public void save(Category obj) {
		//map.put(obj.getId(), obj);
	//}

	//public Category findById(Long id) {
		//return map.get(id);
	//}
	
	//public List<Category> findAll() {
		//return new ArrayList<Category>(map.values());
	//}
}
