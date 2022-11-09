package aop1_xml;

public class MessageBeanImpl implements MessageBean {

	@Override
	public void sayHello() {
		System.out.println("1");
		
	}

	@Override
	public void ensayHello() {
		System.out.println("2");
		
	}

	@Override
	public void test() {
		System.out.println("3");
		
	}

}
