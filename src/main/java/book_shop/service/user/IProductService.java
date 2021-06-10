package book_shop.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.entity.Product;

@Service
public interface IProductService {
	@Autowired
	public Product getProductById(String id);
}
