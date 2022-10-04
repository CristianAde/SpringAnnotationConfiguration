package springAnnotationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("springAnnotationConfiguration")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for fortuneservice
	//method name is beanid
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for swimmcoach and inject dependency
	//method name is beanid
	@Bean
	public Coach mySwimmCoach() {
		return new SwimmCoach(sadFortuneService());
	}
	
	
	
}
