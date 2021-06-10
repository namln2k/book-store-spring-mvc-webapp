package book_shop.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.dao.AccountsDAO;
import book_shop.entity.Account;

@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private AccountsDAO accountsDAO = new AccountsDAO();
	
	public boolean checkAccount(String username, String password) {
		return accountsDAO.checkAccount(username, password);
	}
	public Account getAccountByUsername(String username) {
		return accountsDAO.getAccountByUsername(username);
	}
}
