package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculator(Model model) {
        return "index";
    }

    @PostMapping("/calculator")
    public String result(@RequestParam("rate") Long rate, @RequestParam("usd") Long usd, Model model) {
Long result=rate*usd;
model.addAttribute("result",result);
         return  "index" ;
    }
}
