package book_shop.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import book_shop.dto.CartDTO;
import book_shop.service.user.CartServiceImpl;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();
	
	@RequestMapping(value="/cart")
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.getSlides());
		_mvShare.addObject("categories", _homeService.getCategories());
		_mvShare.addObject("products", _homeService.getProducts());
		_mvShare.setViewName("user/cart/cart");
		return _mvShare;
	}
	
	@RequestMapping(value="/add-to-cart/{id}")
	public String addToCart(HttpServletRequest request, HttpSession session, @PathVariable String id) {
		HashMap<String, CartDTO> cart = (HashMap<String, CartDTO>)session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<String, CartDTO>();
		}
		cartService.addToCart(id, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantity", cartService.totalQuantity(cart));
		session.setAttribute("totalSum", cartService.totalSum(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value="/edit-cart-item/{id}/{quantity}")
	public String editCartItem(HttpServletRequest request, HttpSession session, @PathVariable String id,  @PathVariable int quantity) {
		HashMap<String, CartDTO> cart = (HashMap<String, CartDTO>)session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<String, CartDTO>();
		}
		cart = cartService.editCart(id, quantity, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantity", cartService.totalQuantity(cart));
		session.setAttribute("totalSum", cartService.totalSum(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value="/delete-cart-item/{id}")
	public String removeCartItem(HttpServletRequest request, HttpSession session, @PathVariable String id) {
		HashMap<String, CartDTO> cart = (HashMap<String, CartDTO>)session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<String, CartDTO>();
		}
		cart = cartService.removeFromCart(id, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantity", cartService.totalQuantity(cart));
		session.setAttribute("totalSum", cartService.totalSum(cart));
		return "redirect:" + request.getHeader("Referer");
	}
}
