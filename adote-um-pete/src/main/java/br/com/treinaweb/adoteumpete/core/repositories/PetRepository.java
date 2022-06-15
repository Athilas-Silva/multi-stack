package br.com.treinaweb.adoteumpete.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.adoteumpete.core.exceptions.PetNotFoundException;
import br.com.treinaweb.adoteumpete.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

    default Pet findByIdOrElseThrow(Long id){
        return findById(id).orElseThrow(PetNotFoundException::new);
    }
}
