package com.pessoa.senac.api.crud.repository;

import com.pessoa.senac.api.crud.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
