package guru.springframework.joke.demo;

import guru.springframework.joke.demo.controllers.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeappApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);
        JokeController jokeController = (JokeController) ctx.getBean("jokeController");

        System.out.println(jokeController.showQuote());
    }

}
