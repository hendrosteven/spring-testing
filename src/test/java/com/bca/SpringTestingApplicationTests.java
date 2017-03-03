package com.bca;

import com.bca.services.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestingApplicationTests {

    @Autowired
    private HelloService helloService;
    
    private String expected = "Hi Hendro welcome to Springboot";

    @Test    
    public void contextLoads() {
        Assert.assertEquals(expected, 
                helloService.sayHello("Hendro"));        
    }

}
