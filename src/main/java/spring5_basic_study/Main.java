package spring5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
			try(AnnotationConfigApplicationContext ctx = 
					new AnnotationConfigApplicationContext(AppContext.class)){
				
				Greeter g = ctx.getBean("greeter", Greeter.class);
				Greeter g2 = ctx.getBean("greeter", Greeter.class);
				//true 가 나오면 싱글톤 같은 객체 .
				System.out.printf("(g1==g2) = %s%n", g==g2);
				
				String msg = g.greet("스프링5");
				
				System.out.println(msg);
				
			}
	}
}
