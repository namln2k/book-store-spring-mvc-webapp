package book_shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import book_shop.entity.Account;
import book_shop.entity.MapperAccounts;

@Repository
public class AccountsDAO extends BaseDAO {
	public boolean checkAccount(String username, String password) {
		String sql = "SELECT * FROM accounts WHERE username='"+ username + "'";
		List<Account> accounts = new ArrayList<Account>();
		accounts = _jdbcTemplate.query(sql, new MapperAccounts());
		for (Account account : accounts) {
			if (account.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public Account getAccountByUsername(String username) {
		String sql = "SELECT * FROM accounts WHERE username='"+ username + "'";
		List<Account> accounts = new ArrayList<Account>();
		accounts = _jdbcTemplate.query(sql, new MapperAccounts());
		return accounts.get(0);
	}

	public AccountsDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
