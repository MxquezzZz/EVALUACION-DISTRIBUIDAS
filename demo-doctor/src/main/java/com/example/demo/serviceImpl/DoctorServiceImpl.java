package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DoctorEntity;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService  {
	
	@Autowired
    private DoctorRepository doctorRepository;
	
	@Override
	public List<DoctorEntity> readAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Optional<DoctorEntity> findById(int id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(id);
	}

	@Override
	public DoctorEntity create(DoctorEntity doctor) {
		// TODO Auto-generated method stub
        return doctorRepository.save(doctor);

	}

	@Override
	public DoctorEntity update(int id, DoctorEntity doctor) {
		Optional<DoctorEntity> existingDoctor = doctorRepository.findById(id);
        if (existingDoctor.isPresent()) {
        	DoctorEntity updatedDoctor = existingDoctor.get();
            updatedDoctor.setNombre(doctor.getNombre());
            updatedDoctor.setApellidos(doctor.getApellidos());
            return doctorRepository.save(updatedDoctor);
        } else {
            return null;
        }
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 doctorRepository.deleteById(id);
	}

}
