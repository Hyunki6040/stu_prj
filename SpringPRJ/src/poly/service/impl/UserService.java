package poly.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.MemberDTO;
import poly.dto.StudentDTO;
import poly.persistance.mapper.MemberMapper;
import poly.persistance.mapper.UserMapper;
import poly.service.IMemberService;
import poly.service.IUserService;

@Service("UserService")
public class UserService implements IUserService {
	
	@Resource(name="UserMapper")
	private UserMapper userMapper;
	
	@Override
	public String getBarcode(int user_no) throws Exception {
		return userMapper.getBarcode(user_no);
	}
	@Override
	public int insertStu(StudentDTO sdto) throws Exception {
		return userMapper.insertStu(sdto);
	}


}
