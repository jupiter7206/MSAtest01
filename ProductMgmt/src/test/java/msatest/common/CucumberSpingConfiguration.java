package msatest.common;


import msatest.ProductMgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductMgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
