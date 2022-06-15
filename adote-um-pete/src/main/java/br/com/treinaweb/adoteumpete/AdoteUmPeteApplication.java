package br.com.treinaweb.adoteumpete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treinaweb.adoteumpete.core.models.Pet;
import br.com.treinaweb.adoteumpete.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPeteApplication implements CommandLineRunner{

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPeteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Banner");
		pet.setHistoria("Fiél companheiro");
		pet.setFoto("https://upload.wikimedia.org/wikipedia/commons/e/e9/CH_Buck_and_Sons_Evita_Peron.jpg");
		
		petRepository.save(pet);
	}
}