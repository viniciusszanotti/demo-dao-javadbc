package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
		//expor um método que retorna o tipo da interface, mas internamente instanciar uma implementação 
	}

}
