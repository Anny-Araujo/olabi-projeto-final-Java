package project.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.banco.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
