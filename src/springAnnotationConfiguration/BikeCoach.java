package springAnnotationConfiguration;

public class BikeCoach implements Coach {

	private FortuneService fortuneService;
	
	public BikeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bike coach workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
