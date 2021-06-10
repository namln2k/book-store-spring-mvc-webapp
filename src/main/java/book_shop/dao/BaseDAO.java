package book_shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public BaseDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
}