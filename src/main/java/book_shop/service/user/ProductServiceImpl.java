package book_shop.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.dao.ProductsDAO;
import book_shop.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductsDAO productsDAO;
	
	public Product getProductById(String id) {
		return productsDAO.getProductById(id);
	}
}
