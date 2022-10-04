package springAnnotationConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikersApplicacion {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		BikeCoach coach = context.getBean("bikeCoach", BikeCoach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());

	}

}
