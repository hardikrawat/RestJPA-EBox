package com.spirngboot.restapi.services;

import java.util.*;

import com.spirngboot.restapi.entities.Doctor;

public class DoctorService {

	private static List<Doctor> list = new ArrayList<>();

	static {
		list.add(
				new Doctor(Integer.valueOf(1), "Doctor-1", "Q-1", Double.valueOf(5.6), "MBBS", Double.valueOf(800.00)));
		list.add(
				new Doctor(Integer.valueOf(2), "Doctor-2", "Q-2", Double.valueOf(6.6), "MBBS", Double.valueOf(900.00)));
	}

	public List<Doctor> list() {
		return list;
	}

	public Boolean save(Doctor doctor) {
		return Boolean.valueOf(list.add(doctor));
	}

}
