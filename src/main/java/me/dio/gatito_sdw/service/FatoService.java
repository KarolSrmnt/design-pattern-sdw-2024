package me.dio.gatito_sdw.service;

import me.dio.gatito_sdw.model.Fato;

public interface FatoService {

    Iterable<Fato> obterTodos();

    Fato buscarPorId(Long id);

    void novoFato(Fato fato);

    void deletarFato(Long id);
}
