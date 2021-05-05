package spring5_basic_study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_basic_study.di.ChangePasswordService;
import spring5_basic_study.di.MemberDao;
import spring5_basic_study.di.MemberInfoPrinter;
import spring5_basic_study.di.MemberListPrinter;
import spring5_basic_study.di.MemberPrinter;
import spring5_basic_study.di.MemberRegisterService;
import spring5_basic_study.di.VersionPrinter;

@Configuration
public class Appconf2 {
	@Autowired
	private MemberDao memberDao;

	@Autowired
	private MemberPrinter memberPrinter;
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(/* memberDao */);
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		return pwdSvc;
	}

	@Bean
	public MemberListPrinter memberListPrinter() {
		return new MemberListPrinter(/* memberDao, memberPrinter */);
	}
	
	@Bean
	public MemberInfoPrinter memberInfoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
