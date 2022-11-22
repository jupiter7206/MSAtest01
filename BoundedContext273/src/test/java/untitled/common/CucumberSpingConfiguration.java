package untitled.common;


import untitled.BoundedContext273Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext273Application.class })
public class CucumberSpingConfiguration {
    
}
