package spring5_basic_study.di;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {

	@Autowired
	private MemberDao memDao;
	@Autowired
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException("데이터 없음");
		}
		printer.print(member);
		System.out.println();
	}

//	public void setMemDao(MemberDao memDao) {
//		this.memDao = memDao;
//	}
//
//	public void setPrinter(MemberPrinter printer) {
//		this.printer = printer;
//	}
	
}
