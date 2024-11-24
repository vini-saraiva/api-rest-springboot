package com.example.api.controller;

import com.example.api.paciente.DadosCadastroPeciente;
import com.example.api.paciente.Paciente;
import com.example.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")



public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    public void CadastrarPaciente(@RequestBody DadosCadastroPeciente paciente){

      repository.save(new Paciente(paciente));
    }
}
