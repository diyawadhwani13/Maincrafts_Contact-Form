package com.maincrafts.contactform;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    private int totalSubmissions = 0;

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        totalSubmissions++;

        System.out.println("\n========== NEW FORM SUBMISSION ==========");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Message : " + message);
        System.out.println("Submission Number : " + totalSubmissions);
        System.out.println("=========================================\n");

        return "Message received successfully!";
    }

    @GetMapping("/stats")
    public String stats() {
        return "Total Submissions: " + totalSubmissions;
    }
}