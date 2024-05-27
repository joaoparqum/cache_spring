package com.arquimjoao.cache.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor //criar construtor vazio
@AllArgsConstructor //criar construtor cheio
public class Empresa {

    @Id
    private Long id;

    private String nome;

}
