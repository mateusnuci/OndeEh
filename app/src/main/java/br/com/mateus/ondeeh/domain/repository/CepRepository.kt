package br.com.mateus.ondeeh.domain.repository

import br.com.mateus.ondeeh.domain.model.Cep

interface CepRepository {
    suspend fun getCep(cep: String): Cep
}