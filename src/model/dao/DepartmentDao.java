package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);//inserir no banco de dados o objeto inserido no parâmetro de entrada
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//consultar no banco de dados o objeto com o ID inserido
	List<Department> findAll();
	
	
}
