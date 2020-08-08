package com.undefined.nossocodigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nossoCodigo")
public class tagController {

    @Autowired
    private tagRepository tagRepository;
    private exibeCodigos exibeCodigos = new exibeCodigos();

    @GetMapping("/codigos1")
    public @ResponseBody String getAllTag(){
        return exibeCodigos.mostraCodigos(tagRepository.findAll());
    }

    @PostMapping("/codigos1")
    public @ResponseBody String addNovoCodigo(@RequestParam String nome, @RequestParam String conteudo, @RequestParam String descricao){

        tag t = new tag();
        t.setNome(nome);
        t.setConteudo(conteudo);
        t.setDescricao(descricao);
        tagRepository.save(t);

        return exibeCodigos.mostraCodigos(tagRepository.findAll());
    }
    
}