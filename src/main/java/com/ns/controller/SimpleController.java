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
    return "Hello Zouhair";
  }

}
