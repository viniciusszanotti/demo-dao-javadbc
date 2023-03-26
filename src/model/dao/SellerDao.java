package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);//inserir no banco de dados o objeto inserido no parâmetro de entrada
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//consultar no banco de dados o objeto com o ID inserido
	List<Seller> findAll();
	

}
