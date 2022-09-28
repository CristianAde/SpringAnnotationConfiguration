package springAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	//@Autowired
	private FortuneService fortuneService;

	public TennisCoach() {
	}

	@Autowired
	public TennisCoach(@Qualifier("HappyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TenisCoach workout";
	}

	// @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

//	@Autowired
//	@Qualifier("HappyFortuneService")
//	public void otherMethodName(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
