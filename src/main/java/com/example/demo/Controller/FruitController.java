package com.example.demo.Controller;

import com.example.demo.Service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FruitController {
    @Autowired
    FruitService fruitService;
    @RequestMapping(value="/fruits", method= RequestMethod.GET)
    ModelAndView getFruits(){
        System.out.println("Hello");
        return fruitService.getFruits();
    }
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World! My app works!";     }
}
