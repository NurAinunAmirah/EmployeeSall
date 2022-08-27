package com.first.EmployeeSall.EmployeeController;

import com.first.EmployeeSall.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @GetMapping("/index")
    public String GetForm(Model model){
        model.addAttribute("Employee", new Employee());
        return "index";
    }

    @PostMapping("/result")
    public String PostForm(@ModelAttribute Employee employee, BindingResult result, Model model){
        model.addAttribute("Employee", employee);
        return "result";
    }

}
