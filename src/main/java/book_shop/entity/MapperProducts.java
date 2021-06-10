package book_shop.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Product>{
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setId_category(rs.getInt("id_category"));
		product.setAuthor(rs.getString("author"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getFloat("price"));
		product.setSale(rs.getInt("sale"));
		product.setTitle(rs.getString("title"));
		product.setHighlight(rs.getInt("highlight"));
		product.setIs_new_product(rs.getInt("is_new_product"));
		product.setDetail(rs.getString("detail"));
		product.setCreated_at(rs.getDate("created_at"));
		product.setUpdated_at(rs.getDate("updated_at"));
		return product;
	}
}
