package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BusEntity;
import com.example.demo.model.BookingDetails;



public interface BusService {
	public List<BusEntity> searchBus(BookingDetails bookingDetails);
}

