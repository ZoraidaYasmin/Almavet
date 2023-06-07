package com.example.Almavet.Controller;

import com.example.Almavet.Entity.Pet;
import com.example.Almavet.Entity.User;
import com.example.Almavet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResponseEntity.badRequest().body("Ingrese el nombre de usuario y la contraseña");
        }
        boolean authenticated = userService.findByUsernameAndPassword(username, password);
        if (authenticated) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Credenciales válidas");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }



}
