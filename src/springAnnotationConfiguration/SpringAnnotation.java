package springAnnotationConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tenisCoach = context.getBean("myTennisCoach", TennisCoach.class);
		System.out.println(tenisCoach.getDailyWorkout());
		context.close();

	}

}
