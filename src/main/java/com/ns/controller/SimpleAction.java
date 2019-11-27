package com.ns.controller;

import com.opensymphony.xwork2.ActionSupport;

public class SimpleAction extends ActionSupport {

  public String execute() {
    System.out.println("##############"+this.getClass());
    return "SUCCESS";
  }

}
