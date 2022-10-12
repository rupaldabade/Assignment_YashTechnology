import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Second Spring using reference ");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		A a=(A) context.getBean("refa");
		System.out.println(a.getX());
		System.out.println(a.getB().getY());
	}

}
