package com.itmuch.actuator.prometheus.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    Logger logger=LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String test(@RequestParam(required = false) String name) {
        logger.debug("this is debug log");
        logger.info("this is info log");

        if("admin".equals(name)){
            throw new RuntimeException("err name");
        }

        return "test";
    }

}
