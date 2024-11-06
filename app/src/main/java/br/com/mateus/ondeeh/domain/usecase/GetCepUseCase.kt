package br.com.mateus.ondeeh.domain.usecase

import br.com.mateus.ondeeh.domain.model.Cep
import br.com.mateus.ondeeh.domain.repository.CepRepository

class GetCepUseCase(private val repository: CepRepository) {
    suspend operator fun invoke(cep: String): Cep {
        return repository.getCep(cep)
    }
}