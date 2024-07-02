package project.banco.service;

import org.springframework.beans.factory.annotation.Autowired;

import project.banco.model.Transacoes;
import project.banco.repository.TransacoesRepository;

public class TransacoesService {

    @Autowired
    private TransacoesRepository transacoesRepository;

    public Transacoes realizarTransacao(Transacoes transacoes) {
        return transacoesRepository.save(transacoes);
    }
}
