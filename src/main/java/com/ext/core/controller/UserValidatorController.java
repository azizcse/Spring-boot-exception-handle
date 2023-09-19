package com.ext.core.controller;

import com.ext.core.model.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@Validated
public class UserValidatorController {
    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable("id") @Min(1) Long id) {
        return ResponseEntity.ok("User Id :" + id);
    }
}
