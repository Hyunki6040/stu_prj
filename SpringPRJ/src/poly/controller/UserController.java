package poly.controller;

import java.io.File;
import java.util.Enumeration;
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

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jxl.Sheet;
import jxl.Workbook;
import jxl.*;
import poly.dto.MemberDTO;
import poly.dto.StudentDTO;
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
	
	@RequestMapping(value="excel.do", method = RequestMethod.POST)
	public String excel(HttpSession session, HttpServletRequest request, Model model) throws Exception{

		//엑셀파일 업로드
		String savePath = request.getRealPath("/")+"temp";
		
		int sizeLimit = 30 * 1024 * 1024;
		String formName = "";
		String fileName = "";
		long fileSize = 0;
		
		MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "euc-kr", new DefaultFileRenamePolicy());
		Enumeration formNames = multi.getFileNames();
		
		while(formNames.hasMoreElements()){
			formName = (String)formNames.nextElement();
			fileName = multi.getFilesystemName(formName);
			
			if(fileName != null){
				fileSize = multi.getFile(formName).length();
			}
		}
			//서버에 업로드한 엑셀파일의 Sheet1 객체를 가져옵니다.
			Workbook workbook = Workbook.getWorkbook(new File(savePath + "/" + fileName));
			Sheet sheet = workbook.getSheet(0);
			
			
			
				StudentDTO sdto = new StudentDTO();
				sdto.setStu_no(sheet.getCell(0, 1).getContents()); //학번
				sdto.setDapartment(sheet.getCell(1, 1).getContents()); //학과
				sdto.setStu_name(sheet.getCell(2, 1).getContents()); //이름
				sdto.setBirth_date(sheet.getCell(3, 1).getContents()); //생일
			
				if(sheet.getCell(0, 1).getContents() == "") {
					int num = 1 + 1;
					model.addAttribute("msg", "["+num+"]행의 학번이 없습니다.");
					workbook.close();
					return "/excel";
				}else {
					userService.insertStu(sdto);
				}
			
			
			workbook.close();
			
			File file = new File(savePath + "/" + fileName);
			file.delete();
			
			
			model.addAttribute("msg", "등록이 완료되었습니다.");		
			
		return "/excel";
	}
	
}
