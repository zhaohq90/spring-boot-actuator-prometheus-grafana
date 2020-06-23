package com.itmuch.actuator.prometheus.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itmuch.com
 */

@RestController
public class TestController {

    Logger logger=LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String test() {
        logger.debug("this is debug log");
        logger.info("this is info log");

        return "test";
    }
}
