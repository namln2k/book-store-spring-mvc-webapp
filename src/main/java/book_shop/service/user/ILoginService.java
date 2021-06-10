package book_shop.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.entity.Account;

@Service
public interface ILoginService {
	@Autowired
	public boolean checkAccount(String username, String password);
	@Autowired
	public Account getAccountByUsername(String username);
}
