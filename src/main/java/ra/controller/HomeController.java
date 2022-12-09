package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Controller
@RequestMapping("HomeController")
public class HomeController {
    @PostMapping("validate")
    public ModelAndView checkValidate(String email) {
    String result= null;
     ModelAndView mav= new ModelAndView("regexEmail");
        String str ="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
     if (email.matches(str)){
            result="Email hợp lệ";
     } else {
         result= "Email không hợp lệ, nhập hãy nhập lại";
     }
     mav.addObject("result",result);
     return mav;
    }
}