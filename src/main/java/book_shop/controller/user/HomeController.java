package book_shop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	@RequestMapping(value = {"/", "/home-page"})
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.getSlides());
		_mvShare.addObject("categories", _homeService.getCategories());
		_mvShare.addObject("products", _homeService.getProducts());
		_mvShare.addObject("featureProducts", _homeService.getFeatureProducts());
		_mvShare.addObject("newProducts", _homeService.getNewProducts());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping(value = {"/products"})
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/all");
		mv.addObject("products", _homeService.getProducts());
		return mv;
	}
}
