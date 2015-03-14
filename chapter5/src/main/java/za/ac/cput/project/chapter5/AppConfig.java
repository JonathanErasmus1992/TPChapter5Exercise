package za.ac.cput.project.chapter5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="getLString")
	public Employee getLecturer()
	{
		return new Lecturer();
	}
	@Bean(name="getSString")
	public Employee getSecretary()
	{
		return new Secretary();
	}
}
