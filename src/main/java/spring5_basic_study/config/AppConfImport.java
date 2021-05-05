package spring5_basic_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring5_basic_study.di.MemberDao;
import spring5_basic_study.di.MemberPrinter;

@Configuration
@Import(AppConf2.class)
public class AppConfImport {

	@Bean
	public MemberDao memberdao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
