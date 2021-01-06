package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequiredArgsConstructor
@RequestMapping("/donate")
public class DonationController {

    private final DonationService donationService;
    private final CategoryService categoryService;
    private final InstitutionService institutionService;

    @GetMapping("")
    public String donate(Model model){
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("institutions", institutionService.findAll());
        model.addAttribute("donation", new Donation());
        return "/donation/form";
    }

    @PostMapping("")
    public void saveDonation(HttpServletResponse resp, Donation donation) throws IOException {

        resp.sendRedirect("/donate/confirm");
    }
}
