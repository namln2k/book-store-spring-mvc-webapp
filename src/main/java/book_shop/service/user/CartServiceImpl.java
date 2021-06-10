package book_shop.service.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.dao.CartDAO;
import book_shop.dto.CartDTO;

@Service
public class CartServiceImpl implements ICartService {
	@Autowired
	private CartDAO cartDAO = new CartDAO();

	public HashMap<String, CartDTO> addToCart(String id, HashMap<String, CartDTO> cart) {
		return cartDAO.addToCart(id, cart);
	}
	public HashMap<String, CartDTO> editCart(String id, int quantity, HashMap<String, CartDTO> cart) {
		return cartDAO.editCart(id, quantity, cart);
	}
	public HashMap<String, CartDTO> removeFromCart(String id, HashMap<String, CartDTO> cart) {
		return cartDAO.removeFromCart(id, cart);
	}
	public int totalQuantity(HashMap<String, CartDTO> cart) {
		return cartDAO.totalQuantity(cart);
	}
	public double totalSum(HashMap<String, CartDTO> cart) {
		return cartDAO.totalSum(cart);
	}
}
