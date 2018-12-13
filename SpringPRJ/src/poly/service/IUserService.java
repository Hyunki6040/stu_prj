package poly.service;

import java.util.HashMap;
import java.util.List;

import poly.dto.MemberDTO;
import poly.dto.StudentDTO;

public interface IUserService {
	public String getBarcode(int user_no) throws Exception;
	public int insertStu(StudentDTO sdto) throws Exception;
}
