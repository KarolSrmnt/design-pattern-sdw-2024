package me.dio.gatito_sdw.service.impl;

import me.dio.gatito_sdw.model.Fato;
import me.dio.gatito_sdw.repository.FatoRepository;
import me.dio.gatito_sdw.service.FatoService;
import me.dio.gatito_sdw.service.MeowFactsResponse;
import me.dio.gatito_sdw.service.MeowFactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class FatoServiceImpl implements FatoService {

    private final FatoRepository repository;
    private final MeowFactsService service;

    @Autowired
    public FatoServiceImpl(FatoRepository repository, MeowFactsService service) {
        this.repository = repository;
        this.service = service;
    }

    @Override
    public Iterable<Fato> obterTodos() {
        return repository.findAll();
    }

    @Override
    public Fato buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void novoFato(Fato fato) {
        MeowFactsResponse response = service.obterNovoFato();
        String assunto = response.getData().get(0);
        fato.setAssunto(assunto);
        repository.save(fato);
    }

    @Override
    public void deletarFato(Long id) {
        repository.deleteById(id);
    }
}
