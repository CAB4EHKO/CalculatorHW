package pro.sky.skyprocalculatorhw;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }


    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "<p style=\"color:red;\">На ноль делить нельзя!<p>";
        }
        double result = (double) num1 / num2;
        return num1 + " : " + num2 + " = " + result;
    }
}
