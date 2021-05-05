package spring5_basic_study.di;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class selectService {

	@Autowired
	private MemberDao memberDao;
	
//	public void setMemberDao(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	/*
	 * public Map<String, Member> showMember(){ return
	 * memberDao.selectMemberByAll(); }
	 */
}
