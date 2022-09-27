package springAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//@Autowired
	FortuneService fortuneService;

	public TennisCoach() {
	}

	// @Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TenisCoach workout";
	}

	public String getFortuneService() {
		return fortuneService.getDailyFortune();
	}

	// @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//@Autowired
	public void otherMethodName(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
