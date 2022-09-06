package sfg.petclinic.services;

import java.util.Set;

import sfg.petclinic.model.Owner;

public interface OwnerService {
	
	public Owner findByLastName(String lastName );
	public Owner findById(Long Id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	

}
