package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/list")
    public String listpage(Model model){
        model.addAttribute("todos",todoRepository.findAll());
        return "list";

    }

    @GetMapping("/add")
    public String formpage(Model model){
        model.addAttribute("todo",new Todo());
        return "Todform";
    }

    @PostMapping("/process")
    public String process(@Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "Todform";
        }
        todoRepository.save(todo);
        return "redirect:/list";
    }

}
