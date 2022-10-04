package springAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class SwimmCoach implements Coach {

	private FortuneService fortuneService;
	//injecting data from Sport.properties
	@Value("${email}")
	private String email;
	@Value("${phone}")
	private String phone;
	
	public SwimmCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swimm coach workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	

}
