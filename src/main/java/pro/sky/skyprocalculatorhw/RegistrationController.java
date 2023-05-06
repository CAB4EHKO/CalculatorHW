package pro.sky.skyprocalculatorhw;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationServiceImpl registrationServiceImpl;

    public RegistrationController(RegistrationServiceImpl registrationService) {
        this.registrationServiceImpl = registrationService;
    }

    @GetMapping
    public String welcome() {
        return registrationServiceImpl.welcome();
    }

    @GetMapping("/entrance")
    public String userInfo(String user) {
        return registrationServiceImpl.userInfo(user);
    }
}
