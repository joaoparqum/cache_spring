package com.arquimjoao.cache.controller;

import com.arquimjoao.cache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    //recebendo o cache da camada service e removendo-o
    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName){
        cacheService.evictAllCacheValues(cacheName);
    }

}
