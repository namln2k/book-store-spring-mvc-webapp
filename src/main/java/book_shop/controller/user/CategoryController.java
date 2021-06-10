package book_shop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController extends BaseController {
	@RequestMapping(value = {"/products/{id}"})
	public ModelAndView Product(@PathVariable String id) {
		_mvShare = new ModelAndView("user/products/category");
		_mvShare.addObject("productsByCategory", _homeService.getProductsByCategory(id));
		return _mvShare;
	}
}
