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
public class HomeController {

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String entryPoint(@RequestParam(value="name", required = false, defaultValue = "World") String name, Model model) {
        String response = "hello";

        model.addAttribute("name", name);

        return response;
    }

    @RequestMapping(value = "/hello")
    public String helloWorld(@RequestParam(value="name", required = false, defaultValue = "Nick") String name, Model model) {
        String response = "hello";

        model.addAttribute("name", name);

        return response;
    }
}
