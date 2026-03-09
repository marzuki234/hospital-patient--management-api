package com.mycompany.springrestmysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {"logging.level.root=WARN"})
public class SpringRestMysqlApplicationTests {

	@Test
	public void contextLoads() {
            
	}

}

