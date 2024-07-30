package me.dio.gatito_sdw.service;

import me.dio.gatito_sdw.model.Fato;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "meowfacts", url = "https://meowfacts.herokuapp.com")
public interface MeowFactsService {

    @RequestMapping(method = RequestMethod.GET, value = "/?lang=por-br")
    MeowFactsResponse obterNovoFato();
}
