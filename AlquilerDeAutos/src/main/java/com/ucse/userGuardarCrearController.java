package com.ucse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class userGuardarCrearController  {
	@RequestMapping("/Creado")
	public ModelAndView AltaUsusario(
		@RequestParam(value = "NombreUser", required = true) String userN,
		@RequestParam(value = "NroDocumentoUser", required = true) String userD,
		@RequestParam(value = "mailUser", required = true) String userM) {
		ModelAndView mv = new ModelAndView("usersCrear");
		return mv;
	}
}
