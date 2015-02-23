package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nchampagne on 2/23/15.
 */
@RestController
public class LoggedHomeController {

    @RequestMapping(value = "helloLogged", method = {RequestMethod.GET})
    public String helloWorldLogged(@RequestParam(value="name", required = false, defaultValue = "Nick") String name, Model model) {
        String response = "helloLogged";

        model.addAttribute("name", name);

        return response;
    }
}