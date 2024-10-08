package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Pessoa;
import com.example.demo.Repository.PessoaRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PessoaController {
    
    @Autowired
    private PessoaRepository pr;


    @GetMapping("/pessoa/criar")
    public String criar() {
        return "pessoa/criacao";
    }

    @PostMapping("/pessoa/salvar")
    public String salvar(Pessoa pessoa) {
        pr.save(pessoa);

        return "redirect:/pessoa/criar";
    }
    
    
}
