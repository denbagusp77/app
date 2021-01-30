package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.State;
import com.bagus.spring.repositories.StateRepository;

@Service	
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	//Return list of states
	public List<State> getStates(){
			return stateRepository.findAll();
	}
	
	//Update State
		public void save(State state) {
			stateRepository.save(state);
		}
		
	//Get by id 
		public Optional<State> finById(int id) {
			return stateRepository.findById(id);
			
		}

		//Delete by id 
		public void delete(Integer id) {
			stateRepository.deleteById(id);
			
		}

}
