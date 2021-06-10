package book_shop.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperAccounts implements RowMapper<Account>{
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		account.setUsername(rs.getString("id"));
		account.setUsername(rs.getString("username"));
		account.setPassword(rs.getString("password"));
		account.setUserType(rs.getString("user_type"));
		return account;
	}
}
