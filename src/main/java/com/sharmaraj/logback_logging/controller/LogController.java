package com.sharmaraj.logback_logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class LogController {

  private static final Logger log = LoggerFactory.getLogger(LogController.class);

  @GetMapping("/ping")
  public String ping() {
    log.info("You server is successfully running.");
    return "PONG";
  }

}
