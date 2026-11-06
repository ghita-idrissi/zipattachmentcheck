
package com.example.zipattachmentcheck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ZipAttachmentController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/")
    public String checkFile(
            @RequestParam String filename,
            @RequestParam double size,
            Model model) {

        String result;
        String color;

        if (size > 25) {
            result = "The file is too large to be sent via email. Please upload it to the cloud and share the link.";
            color = "red";
        } else if (filename.toLowerCase().contains(".exe")) {
            result = "It may contain a program. The recipient might rightly become suspicious.";
            color = "red";
        } else {
            result = "It is safe to send.";
            color = "green";
        }

        model.addAttribute("result", result);
        model.addAttribute("color", color);

        return "index";
    }
}



