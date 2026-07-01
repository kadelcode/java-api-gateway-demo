package com.kadelcode.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "eureka.client.enabled=false")
class UserServiceApplicationTests {

    @Test
    @DisplayName("Should load Spring context")
    void contextLoads() {
    }

}
