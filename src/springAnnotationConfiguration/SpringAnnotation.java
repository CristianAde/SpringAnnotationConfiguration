package springAnnotationConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach tenisCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(tenisCoach.getDailyWorkout());
		System.out.println(tenisCoach.getFortuneService());
		context.close();

	}

}
