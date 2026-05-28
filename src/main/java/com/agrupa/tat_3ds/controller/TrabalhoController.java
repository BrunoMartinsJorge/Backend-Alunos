package com.agrupa.tat_3ds.controller;

import com.agrupa.tat_3ds.form.RegistroForm;
import com.agrupa.tat_3ds.service.TrabalhoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    private final TrabalhoService trabalhoService;

    public TrabalhoController(TrabalhoService trabalhoService) {
        this.trabalhoService = trabalhoService;
    }

    @PostMapping(path = "/cadastrar-trabalho-grupos")
    public ResponseEntity<Void> cadastrarTrabalhoGrupos(@RequestBody RegistroForm registroForm) {
        this.trabalhoService.cadastrarTrabalhoGrupos(registroForm);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(path = "/editar-grupo/{idGrupo}/{nomeGrupo}")
    public ResponseEntity<Void> editarGrupo(@PathVariable Integer idGrupo, @RequestBody String nomeGrupo){
        this.trabalhoService.editarGrupo(idGrupo, nomeGrupo); // Fix: Erro ao editar nome do grupo
        return ResponseEntity.accepted().build();
    }
}
