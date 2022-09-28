package springAnnotationConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
//		Coach coach = context.getBean("footballCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getPhone());
		context.close();

	}

}
