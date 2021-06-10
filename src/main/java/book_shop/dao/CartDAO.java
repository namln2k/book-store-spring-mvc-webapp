package book_shop.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import book_shop.dto.CartDTO;
import book_shop.entity.Product;

@Repository
public class CartDAO extends BaseDAO {
	@Autowired
	ProductsDAO productDAO = new ProductsDAO();
	
	public HashMap<String, CartDTO> addToCart(String id, HashMap<String, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		CartDTO itemCart = new CartDTO();
		Product product = productDAO.getProductById(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuantity(itemCart.getQuantity() + 1);
			itemCart.setTotalSum(itemCart.getQuantity() * itemCart.getProduct().getPrice());
		}
		else {
			itemCart.setProduct(product);
			itemCart.setQuantity(1);
			itemCart.setTotalSum(product.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<String, CartDTO> editCart(String id, int quantity, HashMap<String, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		CartDTO itemCart = new CartDTO();
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuantity(quantity);
			double newTotalSum = quantity * itemCart.getProduct().getPrice(); 
			itemCart.setTotalSum(newTotalSum);
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<String, CartDTO> removeFromCart(String id, HashMap<String, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	public int totalQuantity(HashMap<String, CartDTO> cart) {
		int totalQuantity = 0;
		for (Map.Entry<String, CartDTO> itemCart : cart.entrySet()) {
			totalQuantity += itemCart.getValue().getQuantity();
		}
		return totalQuantity;
	}
	
	public double totalSum(HashMap<String, CartDTO> cart) {
		int totalSum = 0;
		for (Map.Entry<String, CartDTO> itemCart : cart.entrySet()) {
			totalSum += itemCart.getValue().getTotalSum();
		}
		return totalSum;
	}
}
