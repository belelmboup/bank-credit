package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utilisateurs")
public class UserController {
    @GetMapping("/listutilisateurs")
    public String list() {
        return "utilisateurs/listutilisateurs";
    }

    @GetMapping("/addutilisateurs")
    public String add() {
        return "utilisateurs/addutilisateurs";
    }
}
