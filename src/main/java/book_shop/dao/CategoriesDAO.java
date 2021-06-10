package book_shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import book_shop.entity.Category;
import book_shop.entity.MapperCategories;

@Repository
public class CategoriesDAO extends BaseDAO {
	public List<Category> getCategories() {
		List<Category> categories = new ArrayList<Category>();
		String sql = "SELECT * FROM categories";
		categories = _jdbcTemplate.query(sql, new MapperCategories());
		return categories;
	}
}
