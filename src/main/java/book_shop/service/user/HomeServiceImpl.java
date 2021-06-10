package book_shop.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.dao.CategoriesDAO;
import book_shop.dao.ProductsDAO;
import book_shop.dao.SlidesDAO;
import book_shop.entity.Category;
import book_shop.entity.Product;
import book_shop.entity.Slide;

@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDAO slidesDAO;
	@Autowired
	private CategoriesDAO categoriesDAO;
	@Autowired
	private ProductsDAO productsDAO;

	public List<Slide> getSlides() {
		return slidesDAO.getSlides();
	}
	public List<Category> getCategories() {
		return categoriesDAO.getCategories();
	}
	public List<Product> getProducts() {
		return productsDAO.getProducts();
	}
	public List<Product> getFeatureProducts() {
		return productsDAO.getFeatureProducts();
	}
	public List<Product> getNewProducts() {
		return productsDAO.getNewProducts();
	}
	public List<Product> getProductsByCategory(String id) {
		return productsDAO.getProductsByCategory(id);
	}
}
