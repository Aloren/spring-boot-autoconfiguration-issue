package org.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.library1.Library1;
import org.library2.Library2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.NONE,
        classes = ServiceConfiguration.class
)
@RunWith(SpringRunner.class)
public class ServiceConfigurationTest {

    @Autowired
    Library1 library1;
    @Autowired
    Library2 library2;

    @Test
    public void beans_should_be_present() throws Exception {
        assertNotNull(library1);
        assertNotNull(library2);
    }
}