package social.messages;

import dao.SocialMessageDAO;
import entities.social.SocialMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nchampagne on 2/28/15.
 */
@RestController
public class SocialMessageController {

    @Autowired
    final SocialMessageDAO socialMessageDAO;

    public SocialMessageController(SocialMessageDAO socialMessageDAO) {
        this.socialMessageDAO = socialMessageDAO;
    }

    @RequestMapping(value = "/messages", method = {RequestMethod.GET})
    public String entryPoint(@RequestParam(value="name", required = false, defaultValue = "World") String messageId, Model model) {
        String response = "hello";

        socialMessageDAO.getSocialMessageById("");

        return response;
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public String addMessage(@RequestParam(value="message", required = false, defaultValue = "Test") String message, Model model) {

        socialMessageDAO.createSocialMessage(new SocialMessage(message));

        model.addAttribute("name", message);

        return "hello";
    }

    @RequestMapping(value = "/get_all_messages", method = {RequestMethod.GET})
    public String getAllMessages(Model model) {
        String response = "MESSAGES: <br>";

        List<SocialMessage> results = socialMessageDAO.getAllSocialMessage();

        for(SocialMessage msg : results) {
            response += "<br>" + msg.getMessage();
        }

        model.addAttribute("name", response);

        return "hello";
    }
}
