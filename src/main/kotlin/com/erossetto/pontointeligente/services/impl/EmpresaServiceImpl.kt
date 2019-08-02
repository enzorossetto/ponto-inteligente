package com.erossetto.pontointeligente.services.impl

import com.erossetto.pontointeligente.documents.Empresa
import com.erossetto.pontointeligente.repositories.EmpresaRepository
import com.erossetto.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}