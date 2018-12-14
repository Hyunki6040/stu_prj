package poly.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.MemberDTO;
import poly.persistance.mapper.MemberMapper;
import poly.service.IMemberService;

@Service("MemberService")
public class MemberService implements IMemberService {
	
	@Resource(name="MemberMapper")
	private MemberMapper memberMapper;
	
	public int insertMember(MemberDTO mDTO) throws Exception {
		return memberMapper.insertMember(mDTO);
	}

	public List<MemberDTO> getAllMember() throws Exception {
		return memberMapper.getAllMember();
	}

	public MemberDTO getMemberOne(String memberId) throws Exception {
		return memberMapper.getMemberOne(memberId);
	}

	public int deleteMember(String memberId) throws Exception {
		return memberMapper.deleteMember(memberId);
	}

	public int updateMember(MemberDTO mDTO) throws Exception {
		return memberMapper.updateMember(mDTO);
	}

	public MemberDTO getLogin(HashMap<String, String> param) throws Exception {
		return memberMapper.getLogin(param);
	}

	public String getIdChk(MemberDTO mDTO) throws Exception {
		return memberMapper.getIdChk(mDTO);
	}

	public List<MemberDTO> getSearchList(MemberDTO mDTO) throws Exception {
		return memberMapper.getSearchList(mDTO);
	}

}
