package by.nevar.springapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.nevar.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
