package poly.persistance.mapper;

import java.util.HashMap;
import java.util.List;

import config.Mapper;
import poly.dto.MemberDTO;
import poly.dto.StudentDTO;

@Mapper("UserMapper")
public interface UserMapper {
	public String getBarcode(int user_no) throws Exception;
	public int insertStu(StudentDTO sdto) throws Exception;
}
