package com.baeldung.test;

import com.baeldung.lss.spring.LssApp6NoBoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LssApp6NoBoot.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Lss6IntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }
}
