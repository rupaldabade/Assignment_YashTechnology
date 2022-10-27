package springsecond;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Spring Second Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		PrintMessage e=context.getBean("ob",PrintMessage.class);
		System.out.println(e);
	}

}
