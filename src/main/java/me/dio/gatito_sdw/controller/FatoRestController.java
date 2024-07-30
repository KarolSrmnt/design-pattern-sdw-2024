package me.dio.gatito_sdw.controller;

import me.dio.gatito_sdw.model.Fato;
import me.dio.gatito_sdw.service.FatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("fatos")
public class FatoRestController {

    @Autowired
    private FatoService fatoService;

    @GetMapping
    public ResponseEntity<Iterable<Fato>> obterTodos() {
        return ResponseEntity.ok(fatoService.obterTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fato> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(fatoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Fato> novoFato(@RequestBody Fato fato) {
        fatoService.novoFato(fato);
        return ResponseEntity.ok(fato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Fato> deletarFato(@PathVariable Long id) {
        fatoService.deletarFato(id);
        return ResponseEntity.ok().build();
    }


}
