package springAnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component("SadFortuneService")
public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Sad daily fortune";
	}

}
