package org.lstm.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private final static Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String logTest() {
        LOGGER.debug("This is debug log.");
        LOGGER.info("This is info log.");
        LOGGER.warn("This is warn log.");
        LOGGER.error("This is error log.");
        return "This is log test.";
    }

}