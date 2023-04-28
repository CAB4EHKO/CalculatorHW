package pro.sky.skyprocalculatorhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String hello() {
        return "<b>Hello, friend!</b>";
    }

    @GetMapping(path = "/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        int result = numb1 + numb2;
        return numb1 + " + " + numb2 + " = " + result;
    }
}
