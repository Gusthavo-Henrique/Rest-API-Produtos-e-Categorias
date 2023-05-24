package com.Projeto.CategoriasProdutos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.CategoriasProdutos.entities.Product;

@Repository //Serve para implementar o codigo a baixo de maneira mais facil
public interface ProductRepository extends JpaRepository<Product, Long>{
	 //Antes era "class"
	
	//private Map<Long, Product> map = new HashMap<>();
	
	//public void save(Product obj) {
	//	map.put(obj.getId(), obj);
	//}

	//public Product findById(Long id) {
	//	return map.get(id);
	//}
	
	//public List<Product> findAll() {
	//	return new ArrayList<Product>(map.values());
	//}
}
