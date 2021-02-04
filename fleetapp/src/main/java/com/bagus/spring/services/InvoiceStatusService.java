package com.bagus.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bagus.spring.entities.InvoiceStatus;
import com.bagus.spring.repositories.InvoiceStatusRepository;

@Service	
public class InvoiceStatusService {


	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	
	//mengambil/menampilkan list data
	
	public List<InvoiceStatus> getInvoiceStatuss(){
		return invoiceStatusRepository.findAll();
		
	}
	
	//Save Lokasi Baru
	public void save(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}
	
	//Mengambil data by Id
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStatusRepository.findById(id);
		
	}
	
	
	//Delete By Id
	public void delete(Integer id) {
		invoiceStatusRepository.deleteById(id);
	}
}
