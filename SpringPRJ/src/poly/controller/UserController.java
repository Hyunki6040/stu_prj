package poly.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import poly.dto.MemberDTO;
import poly.service.IMemberService;
import poly.service.IUserService;
import poly.util.CmmUtil;

@Controller
public class UserController {
	
	@Resource(name="UserService")
	private IUserService userService;
	
	@RequestMapping(value="test/barcode")
	public String barcode(HttpSession session, HttpServletRequest request, Model model) throws Exception{
		int user_no = 1;//(int)session.getAttribute("user_no");
		
		String barcode = userService.getBarcode(user_no);
		
		model.addAttribute("barcode", barcode);
		return "/test/barcode";
	}
	
	
}
