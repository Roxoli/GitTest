package pl.pszemek.springChallange;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		City city = (City) ctx.getBean("mybean");
		
		city.cityName();
		
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
