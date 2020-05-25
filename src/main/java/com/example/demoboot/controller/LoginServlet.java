package com.example.demoboot.controller;


import com.example.demoboot.bean.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/tc")
public class LoginServlet {

    @RequestMapping("/login")
    public String index(Model model) {
        Person single = new Person("aa", 11);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("zhangsan", 11);
        Person p2 = new Person("lisi", 22);
        Person p3 = new Person("wangwu", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "login";
    }

    @RequestMapping("/lg")
    @ResponseBody
    public Person doPost(HttpServletRequest request, HttpServletResponse response) {
        //1.获取用户名和密码数据
        Map<String, String[]> map = request.getParameterMap();
        //2.封装User对象
        Person p = new Person("Andy",18);
        //响应数据
        p.setFlag(true);
        return  p;
    }
    @RequestMapping("/lt")
    @ResponseBody
    public Person get(HttpServletRequest request, HttpServletResponse response) {
        //1.获取用户名和密码数据
        Map<String, String[]> map = request.getParameterMap();
        //2.封装User对象
        Person user = new Person();
        Person p = new Person();
        //响应数据
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        p.setFlag(true);
        return  p;
    }

}
