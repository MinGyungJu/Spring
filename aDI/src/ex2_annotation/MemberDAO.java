package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	//3.필드기반 의존ㄴ성주입방식(DI)
	//********************************************************* 알아서 주입좀 해줘
	@Autowired
	private MemberBean member;
	
	// 1.constructor
//	public MemberDAO() {}
//	
//	public MemberDAO(MemberBean member) {
//		super();
//		this.member = member;
//	}
	
	//2.SETTER
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
	
	public void insert() {
		member.output();
		System.out.println("저장하였습니다");
	}
	
	
}
