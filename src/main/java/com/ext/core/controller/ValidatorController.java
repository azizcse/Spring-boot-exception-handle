package com.ext.core.controller;


import com.ext.core.validate.ValidName;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
public class ValidatorController {
   @GetMapping("/greet")
    public String greet(@RequestParam @ValidName String name) {
        return "Hello, " + name + "!";
    }


}
