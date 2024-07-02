package project.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.banco.model.Transacoes;

public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {

}
