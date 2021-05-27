package book_shop.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import book_shop.dao.SlidesDAO;

@Controller
public class HomeController {
	@Autowired
	SlidesDAO slidesDAO;
	
	@RequestMapping(value = {"/", "/home-page"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", slidesDAO.getSlides());
		return mv;
	}

	@RequestMapping(value = {"/product"})
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
