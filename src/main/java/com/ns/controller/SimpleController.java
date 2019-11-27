package com.ns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ns3")
@RestController
public class SimpleController {

  public SimpleController() {
    System.out.println(">>>>>>>>>>>>>>>>>>SimpleController()");
  }

  @GetMapping("/sayHello")
  public String sayHello() {
    return "<html>\n"
        + "<head>\n"
        + "    <title>Title</title>\n"
        + "</head>\n"
        + "<body>\n"
        + "    <h1>NS3 with Spring mvc !</h1>\n"
        + "</body>\n"
        + "</html>\n";
  }

}
