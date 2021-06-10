package book_shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import book_shop.entity.MapperProducts;
import book_shop.entity.Product;

@Repository
public class ProductsDAO extends BaseDAO {
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		String sql = "SELECT * FROM products ORDER BY RAND()";
		products = _jdbcTemplate.query(sql, new MapperProducts());
		return products;
	}
	public List<Product> getFeatureProducts() {
		List<Product> featureProducts = new ArrayList<Product>();
		String sql = "SELECT * FROM products WHERE highlight=1 ORDER BY RAND() LIMIT 9";
		featureProducts = _jdbcTemplate.query(sql, new MapperProducts());
		return featureProducts;
	}
	public List<Product> getNewProducts() {
		List<Product> newProducts = new ArrayList<Product>();
		String sql = "SELECT * FROM products WHERE is_new_product=1 ORDER BY RAND() LIMIT 9";
		newProducts = _jdbcTemplate.query(sql, new MapperProducts());
		return newProducts;
	}
	public List<Product> getProductsByCategory(String id) {
		List<Product> productsByCategory = new ArrayList<Product>();
		String sql = "SELECT * FROM products WHERE id_category=" + id;
		productsByCategory = _jdbcTemplate.query(sql, new MapperProducts());
		return productsByCategory;
	}
	public Product getProductById(String id) {
		List<Product> productById = new ArrayList<Product>();
		String sql = "SELECT * FROM products WHERE id=" + id;
		productById = _jdbcTemplate.query(sql, new MapperProducts());
		return productById.get(0);
	}
}
