package book_shop.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import book_shop.service.user.LoginServiceImpl;

@Controller
public class LoginController extends BaseController {
	@Autowired
	private LoginServiceImpl loginService = new LoginServiceImpl();

	@RequestMapping(value = "/login/{username}/{password}")
	public String checkAccount(HttpServletRequest request, HttpSession session, @PathVariable String username,
			@PathVariable String password) {
		boolean accountCheck = loginService.checkAccount(username, password);
		session.setAttribute("username", username);
		session.setAttribute("wrongLogin", "false");
		if (accountCheck) {
			session.setAttribute("loggedIn", "true");
			return "redirect:" + "/home-page";
		} else {
			session.setAttribute("loggedIn", "false");
			session.setAttribute("wrongLogin", "true");
			return "redirect:" + request.getHeader("Referer");
		}
	}

	@RequestMapping(value = "/logout")
	public String logOut(HttpServletRequest request, HttpSession session) {
		session.setAttribute("username", "");
		session.setAttribute("loggedIn", "false");
		return "redirect:" + "/home-page";
	}

	@RequestMapping(value = "/login")
	public ModelAndView Index() {
		return _mvShare;
	}
}
