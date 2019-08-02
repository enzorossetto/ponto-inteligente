package com.erossetto.pontointeligente.dtos

import javax.validation.constraints.NotEmpty

data class LancamentoDto (

        @get:NotEmpty(message = "Data não pode ser vazia.")
        val data: String? = null,

        @get:NotEmpty(message = "Tipo não pode ser vazio.")
        val tipo: String? = null,

        val descrição: String? = null,
        val localização: String? = null,
        val funcionarioId: String? = null,
        var id: String? = null
)