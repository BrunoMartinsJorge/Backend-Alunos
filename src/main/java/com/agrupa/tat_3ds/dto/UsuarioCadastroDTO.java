package com.agrupa.tat_3ds.dto;

import lombok.Data;

@Data
public class UsuarioCadastroDTO {

    private String nome;
    private String sobrenome;// 1° Erro encontrado
    private String hash;
}
