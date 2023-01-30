package com.br.alura.forum.model

import java.time.LocalDateTime

data class Respostas(
    val id: Long? = null,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val topico: Topico,
    val solucionado: Boolean
)
