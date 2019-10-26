package com.julio.festa.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller

public class HomeController {
	  @GetMapping("/cadastro")
	    public String listar() {
	    	return "index";
	    }
     }

