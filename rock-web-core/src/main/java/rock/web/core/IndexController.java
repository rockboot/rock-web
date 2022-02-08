package rock.web.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/rock-web")
public class IndexController {

    @GetMapping
    public String index() {
        return "Hello RockBoot !";
    }
}
