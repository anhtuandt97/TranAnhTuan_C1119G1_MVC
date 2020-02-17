package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping("/calculate")
    public String calculate(Model model, @RequestParam(name = "num1", defaultValue = "0") double num1,
                            @RequestParam(name = "num2", defaultValue = "0") double num2,
                            @RequestParam(name = "operator", defaultValue = "") String operator){
        double result = 0;
        switch (operator){
            case "Addition(+)":
                result= num1+num2;
                break;
                case "Subtraction(-)":
                    result= num1-num2;
                    break;
                    case "Multiplication(X)":
                        result = num1*num2;
                        break;
            case "Division(/)":
                result = num1/num2;
                break;
        }
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operator", operator);
        model.addAttribute("result", result);
        return "index";
    }
}
