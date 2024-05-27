package com.arquimjoao.cache.agendador;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
@Log4j2
public class CacheAgendado{

    @Scheduled(fixedDelay = 8, timeUnit = TimeUnit.HOURS)//definindo o intervalo de tempo de limpeza do cache
    @CacheEvict("empresas")//setando o cache que vai ser limpado
    public void limparCache(){
        log.info("Executado: " + LocalDateTime.now());//mostrando no terminal sua execução
    }


}
