package spring5_basic_study.di;

import java.nio.channels.SeekableByteChannel;

public class Assembler {
		
		private MemberDao memberDao;
		private MemberRegisterService regSvc;
		private ChangePasswordService pwdSvc;
		private SelectListService ListSvc;
	
		
		public Assembler() {
			memberDao = new MemberDao();
			regSvc = new MemberRegisterService(memberDao);
			pwdSvc = new ChangePasswordService();
			pwdSvc.setMemberDao(memberDao);
			ListSvc = new SelectListService(memberDao);
		}

		public SelectListService getListSvc() {
			return ListSvc;
		}

		public MemberDao getMemberDao() {
			return memberDao;
		}

		public MemberRegisterService getRegSvc() {
			return regSvc;
		}

		public ChangePasswordService getPwdSvc() {
			return pwdSvc;
		}			
	
}
