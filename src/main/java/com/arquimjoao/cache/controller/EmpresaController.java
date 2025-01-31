package com.arquimjoao.cache.controller;

import com.arquimjoao.cache.model.Empresa;
import com.arquimjoao.cache.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    public ResponseEntity<List<Empresa>> findAll() {
        return ResponseEntity.ok(empresaService.findAll());
    }

}
