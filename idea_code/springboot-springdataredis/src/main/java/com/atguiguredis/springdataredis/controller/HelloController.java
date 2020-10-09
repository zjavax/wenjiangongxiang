package com.atguiguredis.springdataredis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/map")
@RestController
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/login")
    public String login(@RequestParam("name") String name){
        return name;
    }

    @PostMapping("/add")
    public Map<String, Object> postQuery(@RequestBody Map<String, Object> param) {
//        try {
//            String query = (String) param.get("query");
//            Map variables = (Map) param.get("variables");
//            String operationName = (String) param.get("operationName");
//
//            return this.executeQuery(query, operationName, variables);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Map<String, Object> error = new HashMap<>();
        error.put("status", 500);
        error.put("msg", "查询出错");
        return error;
    }

}
