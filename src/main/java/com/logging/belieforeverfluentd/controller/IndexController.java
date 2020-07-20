package com.logging.belieforeverfluentd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger("fluentd");

    @RequestMapping("/")
    public String index() {
        LOGGER.debug("index needed to debug - {}", "HTTP");
        LOGGER.info("index took input - {}", "HTTP");
        LOGGER.warn("index needed to warn - {}", "HTTP");
        LOGGER.error("index encountered an error with value - {}", "HTTP");

        return "Hello, Spring Boot";
    }
}