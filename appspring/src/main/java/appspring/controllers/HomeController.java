package appspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; //Define a url que quando for requisitada chamara o metodo
import org.springframework.ui.Model; //passa dados do controlador para a visualização (jsp)

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Olá Mnundo!");
        return "/home/index"; //caminho a partir do webapp por isso :"/home/index" 
    }
}