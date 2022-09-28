package springAnnotationConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
//		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach coach = context.getBean("footballCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();

	}

}
