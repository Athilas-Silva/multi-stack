package br.com.treinaweb.adoteumpete.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.adoteumpete.core.models.Adocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long>{
    
}