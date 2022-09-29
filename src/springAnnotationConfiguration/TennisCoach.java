package springAnnotationConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
//@Scope("prototype")
@Scope("singleton")
public class TennisCoach implements Coach{

	//@Autowired
	private FortuneService fortuneService;
	@Value("${email}")
	String email;
	@Value("${phone}")
	String phone;
	
	@PostConstruct
	public void doStartupStuff() {
		System.out.println("Doing startupStuff");
	}
	
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println("Doing cleanupStuff");
	}
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	
}
