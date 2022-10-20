package com.cx.coding.shopping_mall5.Controller;

import com.cx.coding.shopping_mall5.request.LoginRequest;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String login(LoginRequest loginRequest) {
        return "success";
    }
}
