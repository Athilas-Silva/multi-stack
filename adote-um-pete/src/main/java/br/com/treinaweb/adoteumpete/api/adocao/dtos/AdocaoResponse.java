package br.com.treinaweb.adoteumpete.api.adocao.dtos;

import java.math.BigDecimal;

import br.com.treinaweb.adoteumpete.api.pet.dtos.PetResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoResponse {
    
    private Long id;
    private String email;
    private BigDecimal valor;
    private PetResponse pet;
}
