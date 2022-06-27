package com.spirngboot.restapi.controllers;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spirngboot.restapi.entities.Doctor;
import com.spirngboot.restapi.services.DoctorService;

@RestController
public class DoctorController {

	DoctorService service = new DoctorService();

	@GetMapping("/doctor/list")
	public List<Doctor> list() {
		System.out.println("Getting called");
		return service.list();
	}

	@PostMapping("/doctor/create")
	public Boolean create(@RequestBody Doctor doctor) {
		return service.save(doctor);
	}

}
