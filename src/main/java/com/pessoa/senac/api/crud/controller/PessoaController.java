package com.pessoa.senac.api.crud.controller;

import com.pessoa.senac.api.crud.model.Pessoa;
import com.pessoa.senac.api.crud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@CrossOrigin(origins = "*")
public class PessoaController {


    @Autowired
    private PessoaRepository repository;



    /**
     * Lógica para obter os registros do banco de dados
     * */
    @GetMapping
    public List<Pessoa> obterRegistros() {
        return repository.findAll();
    }

    /**
     * Faça o processamento necessário com os dados recebidos
     * */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar(@RequestBody Pessoa pessoa) {
        repository.save(pessoa);
    }

    /**
     * Faça o processamento necessário com os dados recebidos
     * */
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void editar(@RequestBody Pessoa pessoa) {
        repository.save(pessoa);
    }

    /**
     * Lógica para excluir o registro com o ID fornecido
     * */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirRegistro(@PathVariable Long id) {
       repository.deleteById(id);
    }

    /**
     * Lógica para obter o registro pelo ID
     * */
    @GetMapping("/{id}")
    public Pessoa obterRegistroPorId(@PathVariable Long id) {
        return repository.findById(id).get();
    }

}
