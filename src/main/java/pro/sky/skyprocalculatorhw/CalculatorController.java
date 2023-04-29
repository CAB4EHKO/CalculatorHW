package pro.sky.skyprocalculatorhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<p style=\"color:red;\">Не корректный запрос, задайте значение обоим переменным (num1 и num2) по образцу: \"?num1=5&num2=5\"<p>";
        }
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<p style=\"color:red;\">Не корректный запрос, задайте значение обоим переменным (num1 и num2) по образцу: \"?num1=5&num2=5\"<p>";
        }
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<p style=\"color:red;\">Не корректный запрос, задайте значение обоим переменным (num1 и num2) по образцу: \"?num1=5&num2=5\"<p>";
        }
        return calculatorService.multiply(num1, num2);
    }
 @GetMapping("/divide")
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<p style=\"color:red;\">Не корректный запрос, задайте значение обоим переменным (num1 и num2) по образцу: \"?num1=5&num2=5\"<p>";
        }
        return calculatorService.divide(num1, num2);
    }
}
