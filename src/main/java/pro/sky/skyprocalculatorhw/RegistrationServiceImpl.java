package pro.sky.skyprocalculatorhw;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service

public class RegistrationServiceImpl {


    public String welcome() {
        return "Добро пожаловать";
    }

    public String userInfo(String user) {
        User roman = new User("Роман", 35, "машинист");
        User darya = new User("Дарья", 32, "директор");
        String u = "";
        if (user.equals("roman")) {
            u = roman.toString();
        }
        else if (user.equals("darya")) {
            u = darya.toString();
        } else {
            u = "Пользователь не найден";
        }
        return u;
    }

}
