package com.example.demo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.model.BookingDetails;
import com.example.demo.service.BusService;

public class BookingControllerTest {

	@InjectMocks
	BookingController bookingController;
	
	@Mock
	BusService busService;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test 
	public void getBusesTest() {
		BookingDetails bookingDetails = new BookingDetails();
		bookingController.getBuses(bookingDetails);
	}
}
