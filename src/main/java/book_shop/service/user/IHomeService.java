package book_shop.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.entity.Category;
import book_shop.entity.Product;
import book_shop.entity.Slide;

@Service
public interface IHomeService {
	@Autowired
	public List<Slide> getSlides();
	@Autowired
	public List<Category> getCategories();
	@Autowired
	public List<Product> getProducts();
	@Autowired
	public List<Product> getFeatureProducts();
	@Autowired
	public List<Product> getNewProducts();
	@Autowired
	public List<Product> getProductsByCategory(String id);
}
