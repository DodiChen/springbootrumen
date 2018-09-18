package com.dodi.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@RequestMapping(value="/hello")
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value="/say/{id}", method= RequestMethod.GET)
    @GetMapping(value = "/say")
    @ResponseBody
    //public String say(@PathVariable("id") Integer id, @RequestParam(value = "id2", required = false, defaultValue = "0") Integer id2){
    public String say(@RequestParam(value = "id2", required = false, defaultValue = "0") Integer id2){

        //return "Hello Spring Boot";
        //return cupSize + age;
        //return content;
        //return girlProperties.getCupSize();
        //return "index";
        return  "id2:   " + id2;
    }

}
