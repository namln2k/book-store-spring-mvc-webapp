package book_shop.service.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_shop.dto.CartDTO;

@Service
public interface ICartService {
	@Autowired
	public HashMap<String, CartDTO> addToCart(String id, HashMap<String, CartDTO> cart);
	@Autowired
	public HashMap<String, CartDTO> editCart(String id, int quantity, HashMap<String, CartDTO> cart);
	@Autowired
	public HashMap<String, CartDTO> removeFromCart(String id, HashMap<String, CartDTO> cart);
	@Autowired
	public int totalQuantity(HashMap<String, CartDTO> cart);
	@Autowired
	public double totalSum(HashMap<String, CartDTO> cart);
}
