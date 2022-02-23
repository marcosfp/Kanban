package des.kanban.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("proyecto")
public class ProyectoController {

	
	@GetMapping("/index")
	public ModelAndView getIndex () {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("proyecto/perfil");
		
		return mav;
	}
	
}
