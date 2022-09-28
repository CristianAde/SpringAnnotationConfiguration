package springAnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component("HappyFortuneService")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Happy fortune";
	}

}
