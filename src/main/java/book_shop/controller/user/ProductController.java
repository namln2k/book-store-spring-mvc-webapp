package book_shop.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import book_shop.service.user.ProductServiceImpl;

@Controller
public class ProductController extends BaseController {
	@Autowired
	ProductServiceImpl productService;
	
	@RequestMapping(value = {"product-detail/{id}"})
	public ModelAndView Index(@PathVariable String id) {
		_mvShare = new ModelAndView("user/products/product");
		_mvShare.addObject("productDetail", productService.getProductById(id));
		_mvShare.addObject("categories", _homeService.getCategories());
		return _mvShare;
	}
}
