package com.quizapp.Controller;

import com.quizapp.FormDataStruture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {


    @ResponseBody
    @PostMapping("/api/submit")
    public String handleForm(@RequestBody FormDataStruture data)
    {
        System.out.println("data controller"+data.getName());
        return "ok Success";
    }

}
