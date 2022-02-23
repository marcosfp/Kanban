package des.kanban.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	
	@GetMapping("/index")
	public ModelAndView getIndex () {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView getLogin () {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		return mav;
	}
	
	
}
