package com.arquimjoao.cache.service;

import com.arquimjoao.cache.cloud.Ibge;
import com.arquimjoao.cache.cloud.IbgeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IbgeService {

    @Autowired
    private Ibge ibge;

    //usando a condição para dizer ao spring que apenas os campos com MG irá estar no cache
    @Cacheable(value = "estados", condition = "#estado.equalsIgnoreCase('MG')")
    public List<IbgeResponse> findAllCidades(String estado) {
        System.out.println("vai buscar no IBGE");
        return ibge.findAllCidades(estado);
    }

}
