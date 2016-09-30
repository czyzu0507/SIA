package controllers;

import data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spitter.Spitter;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/spitter")
public class SpitterController {


    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController (SpitterRepository spitterRepository) {

        this.spitterRepository = spitterRepository;
    }

    @ExceptionHandler(IOException.class)
    public String exceptionHandler () {
        return "errors/errorPage";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm (Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister (@RequestPart(value = "profilePicture") MultipartFile profilePicture,
                                   @Valid Spitter spitter,
                                   Errors errors,
                                   RedirectAttributes model) throws IOException {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        profilePicture.transferTo(new File(profilePicture.getOriginalFilename()));
        spitterRepository.save(spitter);
        model.addAttribute("userName", spitter.getUserName());
        model.addFlashAttribute("spitter",spitter);
        return "redirect:/spitter/{userName}";
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String showUserProfile (@PathVariable(value = "userName") String userName, Model model) {
        //model.addAttribute(spitterRepository.findByUserName(userName));
        if (!model.containsAttribute("spitter")){
            model.addAttribute(spitterRepository.findByUserName(userName));
        }
        return "profile";
    }
}
