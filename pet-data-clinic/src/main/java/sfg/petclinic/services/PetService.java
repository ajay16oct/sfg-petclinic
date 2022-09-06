package sfg.petclinic.services;

import java.util.Set;

import sfg.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long Id);
	
	Set<Pet> findAll();
	
	Pet save(Pet pet);
}
