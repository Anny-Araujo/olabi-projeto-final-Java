package project.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import project.banco.model.Conta;
import project.banco.repository.ContaRepository;

public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta criarConta(Conta conta) {
        return contaRepository.save(conta);
    }
}
