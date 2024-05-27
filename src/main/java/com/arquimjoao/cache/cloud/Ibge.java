package com.arquimjoao.cache.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//pegando a api do IBGE
@FeignClient(name = "ibge-ms", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface Ibge {

    @RequestMapping(method = RequestMethod.GET, value = "/{estado}/municipios")
    List<IbgeResponse> findAllCidades(@PathVariable String estado);

}
