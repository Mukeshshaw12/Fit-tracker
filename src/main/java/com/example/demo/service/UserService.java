package com.example.demo.service;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void addAppointment(@Valid User user) {
		Set<Appointment> appointments = user.getAppointments();
		for(Appointment appointment: appointments) {
			appointment.setUser(user);
		}
		userRepository.save(user);
	}

}
