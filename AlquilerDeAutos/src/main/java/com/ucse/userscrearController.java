package com.ucse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class userscrearController {
	@RequestMapping("/Crear")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView("usersCrear");
		return mv;
	}
}
