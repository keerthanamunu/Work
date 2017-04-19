package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Travelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Car c = new Car();
		Vehicle v = VehicleFactory.factorymethod(c);
		c.start();
		c.stop();*/
		
		System.out.println("before creating conatiner");
		ApplicationContext context1= new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("after container");
		Vehicle v = (Vehicle) context1.getBean("car");
		System.out.println("after vehicle12");
		v.start();
		v.stop();
		
		
			/*	Vehicle v2 = (Vehicle) context1.getBean("car");
				System.out.println("after vehicle1");
				v2.start();
				v2.stop();
		*/
		
		
		/*Vehicle v1 = (Vehicle) context1.getBean("bike");
		
		v1.start();
		v1.stop();
	*/
		
		
	}

}
