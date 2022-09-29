package springAnnotationConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotation {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach coach1 = context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach coach2 = context.getBean("tennisCoach", TennisCoach.class);
//		System.out.println(coach.getDailyWorkout());
//		System.out.println(coach.getDailyFortune());
//		System.out.println(coach.getEmail());
//		System.out.println(coach.getPhone());
		
		
		Coach coach3 = context.getBean("footballCoach", Coach.class);
		Coach coach4 = context.getBean("footballCoach", Coach.class);
		System.out.println("coach1==coach2:" + (coach1==coach2));
		System.out.println("coach3==coach4:" + (coach3==coach4));
		context.close();
	}

}
