package poly.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;

import poly.service.IMainService;

public class MainController {
	@Resource(name = "MainService")
	private IMainService mainService;
	
	@RequestMapping(value = "index")
	public String index() throws Exception{
		return "/index";
	}
	
	@RequestMapping(value = "about")
	public String about() throws Exception{
		return "/about";
	}
	
	@RequestMapping(value = "contact")
	public String contact() throws Exception{
		return "/contact";
	}
	
	@RequestMapping(value = "elements")
	public String elements() throws Exception{
		return "/elements";
	}
	
	@RequestMapping(value = "portfolio")
	public String portfolio() throws Exception{
		return "/portfolio";
	}
	
	@RequestMapping(value = "service")
	public String service() throws Exception{
		return "/service";
	}
}
