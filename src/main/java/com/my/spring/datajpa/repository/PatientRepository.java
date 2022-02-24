package com.my.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.spring.datajpa.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

	List<Patient> findByActive(boolean active);
	List<Patient> findByPatientnameContaining(String patientname);
}
