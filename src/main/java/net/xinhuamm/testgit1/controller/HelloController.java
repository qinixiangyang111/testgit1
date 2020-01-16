package net.xinhuamm.testgit1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String  getHello(){
        System.out.println("Hello World");
        return  "HelloWorld!!";
    }

    @RequestMapping(value = "/pp",method = RequestMethod.POST)
    public String  getPost(){
        System.out.println("Hello World");
        return  "HelloWorld!!";
    }

    @RequestMapping(value = "/cc",method = RequestMethod.POST)
    public String  getcc(){
        System.out.println("Hello World");
        return  "cc!!";
    }


}
