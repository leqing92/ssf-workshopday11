package ibf2023.day11.workshop.controller;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = {"/", "index.html"}) //replace index.html
public class NumberController { //never put variable to be use over other method inside this class as it will share among other users

    @GetMapping //the @RequestParam extract the value of the "countUrl" parameter from the request URL and bind its value to the count variable
    public String getIndex(@RequestParam(name = "countUrl", required = false, defaultValue = "3") int count, Model model){
        Random random = new SecureRandom(); // It uses secure algorithms that are designed to be resistant to various attacks. It's suitable for generating random numbers for cryptographic operations and other security-sensitive applications.
        List<String> imageUrls = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(31);
            String imgUrl = "/images/number%d.jpg".formatted(randomNumber);
            imageUrls.add(imgUrl);
        }
        model.addAttribute("imageUrls", imageUrls);
        return "number"; //return number.html
    }

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
}
