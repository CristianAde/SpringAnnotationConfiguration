package springAnnotationConfiguration;

public class BikersFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Bikers fortune service";
	}

}
