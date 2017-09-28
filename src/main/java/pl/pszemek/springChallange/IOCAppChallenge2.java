package pl.pszemek.springChallange;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beans-challenge.xml");
		
		City city = (City) ctx.getBean("mybean");
		city.cityName2();
		
		// git trINING
		
		//new bRANCH
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
