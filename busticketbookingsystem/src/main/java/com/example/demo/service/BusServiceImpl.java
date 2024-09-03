package com.example.demo.service;



import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BusEntity;
import com.example.demo.model.BookingDetails;
import com.example.demo.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	private BusRepository busRepository;
	
	
	/*
	 * this method take one parameter of type BookDetails and the returns the list of BusEntity*/
	@Override
	public List<BusEntity> searchBus(BookingDetails bookingDetails) {
		List<BusEntity> busesData = busRepository.findAll();
		List<BusEntity> buses = new ArrayList<>();
		for(BusEntity busData: busesData) {
			if(busData.getSource().equals(bookingDetails.getSource()) && busData.getDestination().equals(bookingDetails.getDestination()) && busData.getDate().equals(bookingDetails.getDate())) {
				
				buses.add(busData);
			}
			
			
			
		}
		if(buses.size()==0) {
			return null;
		}
		return buses;
	}

}
