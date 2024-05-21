package com.pessoa.senac.api.crud.controller;

import com.pessoa.senac.api.crud.model.Pessoa;
import com.pessoa.senac.api.crud.repository.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
@ActiveProfiles("test")
class PessoaControllerTest {

    @InjectMocks
    private PessoaController controller;


    @MockBean
    private PessoaRepository repository;

    @Test
    void deveBuscarRegistros() {
        Mockito.when(repository.findAll()).thenReturn(Arrays.asList(new Pessoa()));
        assertEquals(1, controller.obterRegistros().size());
    }

}