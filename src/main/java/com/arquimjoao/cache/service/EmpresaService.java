package com.arquimjoao.cache.service;

import com.arquimjoao.cache.model.Empresa;
import com.arquimjoao.cache.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Cacheable("empresas")//mostrando ao spring que esse método é cacheável
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

}
