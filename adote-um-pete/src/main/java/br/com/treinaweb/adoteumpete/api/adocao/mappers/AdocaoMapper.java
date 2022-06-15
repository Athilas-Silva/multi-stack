package br.com.treinaweb.adoteumpete.api.adocao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.treinaweb.adoteumpete.api.adocao.dtos.AdocaoRequest;
import br.com.treinaweb.adoteumpete.api.adocao.dtos.AdocaoResponse;
import br.com.treinaweb.adoteumpete.api.pet.mappers.PetMapper;
import br.com.treinaweb.adoteumpete.core.models.Adocao;
import br.com.treinaweb.adoteumpete.core.repositories.PetRepository;

@Component
public class AdocaoMapper {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;
    
    public Adocao toModel(AdocaoRequest adocaoRequest){
        // var adocao = new Adocao();
        // adocao.setEmail(adocaoRequest.getEmail());
        // adocao.setValor(adocaoRequest.getValor());
        // adocao.setPet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()));
        
        // return adocao;

        return Adocao.builder()
        .email(adocaoRequest.getEmail())
        .valor(adocaoRequest.getValor())
        .pet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()))
        .build();
    }

    public AdocaoResponse toResponse(Adocao adocao){
        // var adocaoResponse = new AdocaoResponse();
        // adocaoResponse.setId(adocao.getId());
        // adocaoResponse.setEmail(adocao.getEmail());
        // adocaoResponse.setValor(adocao.getValor());
        // adocaoResponse.setPet(petMapper.toResponse(adocao.getPet()));

        // return adocaoResponse;

        return AdocaoResponse.builder()
        .id(adocao.getId())
        .email(adocao.getEmail())
        .valor(adocao.getValor())
        .pet(petMapper.toResponse(adocao.getPet()))
        .build();
    }
}