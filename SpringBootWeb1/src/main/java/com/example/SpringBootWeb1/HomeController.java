package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home method called");
        return "index";
    }
    @RequestMapping("add")
    public String add(@RequestParam("num1")int num1, @RequestParam("num2")int num2, Model model)
    {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println("in add " + result);
        model.addAttribute("result",result);
        return "result";
    }
}
