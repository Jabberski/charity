package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/donate")
public class DonationController {
    @GetMapping("/")
    public String donate(Model model){
        return "/form/form";
    }
}
