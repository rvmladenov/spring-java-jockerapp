package guru.springframework.joke.demo.controllers;

import guru.springframework.joke.demo.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String showQuote() {
        return this.jokeService.getJoke();
    }

    @RequestMapping({"/", ""})
    public String showQuoteAt(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
