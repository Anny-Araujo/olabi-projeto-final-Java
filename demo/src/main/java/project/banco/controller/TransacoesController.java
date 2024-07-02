package project.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.banco.model.Transacoes;
import project.banco.service.TransacoesService;

@RestController
@RequestMapping("/transacoes")
public class TransacoesController {
    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public Transacoes realizarTransacao(@RequestBody Transacoes transacoes) {
        return transacoesService.realizarTransacao(transacoes);
    }
}
