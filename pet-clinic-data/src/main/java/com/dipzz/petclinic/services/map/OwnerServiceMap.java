package com.dipzz.petclinic.services.map;

import com.dipzz.petclinic.model.Owner;
import com.dipzz.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

    @Override
    public Set<Owner> findAll() {
        return super.findALl(); // this.findAll() adlh method dari AbstractMapService
    }

    @Override
    public Owner findById(Long id) {
        return super.findId(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
