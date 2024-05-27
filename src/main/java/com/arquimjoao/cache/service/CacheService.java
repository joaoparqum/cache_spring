package com.arquimjoao.cache.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CacheService {

    @Autowired
    private CacheManager cacheManager;

    //pegando o cache e fazendo a limpeza
    public void evictAllCacheValues(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }

}
