package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BusEntity;
import com.example.demo.model.BookingDetails;
import com.example.demo.service.BusService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired
	BusService busService;
	
	
	// 
	/*
	 * this method take one parameter of type BoolingDetails
	 *  and return a list of BusEntity 
	 * we use postmapping annotation it will take the request from the client and send responce back to the client
	 * */
	@PostMapping("search-buses")
	List<BusEntity> getBuses(@RequestBody BookingDetails bookingDetails) {
		return busService.searchBus(bookingDetails);
	}
	
}