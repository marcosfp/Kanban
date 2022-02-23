package des.kanban.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	
	@GetMapping("/alta")
	public ModelAndView getAlta () {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("usuario/alta");
		
		return mav;
	}
	
	
}
