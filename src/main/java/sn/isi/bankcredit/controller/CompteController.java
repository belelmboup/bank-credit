package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comptes")
public class CompteController {
    @GetMapping("/listcomptes")
    public String list() {
        return "comptes/listcomptes";
    }

    @GetMapping("/addcomptes")
    public String add() {
        return "comptes/addcomptes";
    }
}
