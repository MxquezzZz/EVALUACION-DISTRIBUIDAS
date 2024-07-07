package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Citas;
import com.example.demo.repository.CitasRepository;
import com.example.demo.service.CitasService;

@Service
public class CitasServiceImpl implements CitasService{
	@Autowired
	private CitasRepository repo;
	
	@Override
	public List<Citas> readlAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Citas create(Citas citas) {
		// TODO Auto-generated method stub
		return repo.save(citas);
	}

	@Override
	public Citas update(Citas citas) {
		// TODO Auto-generated method stub
		Optional<Citas> existingCitas = repo.findById(citas.getId());
        if (existingCitas.isPresent()) {
            Citas updatedCitas = existingCitas.get();
            updatedCitas.setNombre(citas.getNombre());
            updatedCitas.setTipo_sangre(citas.getTipo_sangre());
            updatedCitas.setNombre(citas.getNombre());
            updatedCitas.setApellidos(citas.getApellidos());
            updatedCitas.setF_nacimiento(citas.getF_nacimiento());
            updatedCitas.setDni(citas.getDni());
            updatedCitas.setTelefono(citas.getTelefono());
            updatedCitas.setFecha_disponible(citas.getFecha_disponible());
            // actualiza otros campos según sea necesario
            return repo.save(updatedCitas);
        } else {
            return null;
        }
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Optional<Citas> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
