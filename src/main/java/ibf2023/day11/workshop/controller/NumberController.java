package ibf2023.day11.workshop.controller;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/", "index.html"})
public class NumberController { //never put variable to be use over other method inside this class as it will share among other users

    // @GetMapping
    // public String getIndex(Model model){
    //     System.out.println("test");
    //     model.addAttribute("test", "Your list of 3 random numbers ");
    //     Random random = new Random();
    //     String photo1 = Integer.toString(random.nextInt(31));
    //     int photo2 = random.nextInt(31);
    //     //String photo3 = "/images/number" + random.nextInt(31) +".jpg";
    //     String photo3 = String.format("/images/number%d.jpg", random.nextInt(31));

    //     model.addAttribute("photo1", photo1);
    //     model.addAttribute("photo2", photo2);
    //     model.addAttribute("photo3", photo3);
        
    //     return "index";
    // }

    @GetMapping
    public String getIndex(Model model){
        Random random = new SecureRandom();
        int n1 = random.nextInt(31);
        int n2 = random.nextInt(31);
        int n3 = random.nextInt(31);
        String imgUrl1 = "/images/number%d.jpg".formatted(n1);
        String imgUrl2 = "/images/number%d.jpg".formatted(n2);
        String imgUrl3 = "/images/number%d.jpg".formatted(n3);
        model.addAttribute("imgUrl1", imgUrl1);
        model.addAttribute("imgUrl2", imgUrl2);
        model.addAttribute("imgUrl3", imgUrl3);
        return "number";
    }
}
