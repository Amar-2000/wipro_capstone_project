package com.example.demo.service;

import java.util.Date;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.entity.BusEntity;
import com.example.demo.model.BookingDetails;
import com.example.demo.repository.BusRepository;

public class BusServiceImplTest {

	@InjectMocks
	BusServiceImpl busServiceImpl;
	
	@Mock
	private BusRepository busRepository;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void searchBusTest() {
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setSource("mock_source");
		bookingDetails.setDestination("mock_destination");
		bookingDetails.setDate(LocalDate.now());
		bookingDetails.setDate(LocalDate.of(2024, 1, 1));
	
		List<BusEntity> busesData = new ArrayList<>();
		when(busRepository.findAll()).thenReturn(busesData);
		BusEntity busEntity = new BusEntity();
		busesData.add(busEntity);
		busEntity.setSource("mock_source");
		busEntity.setDestination("mock_destination");
		busEntity.setDate(LocalDate.now());
		busEntity.setDate(LocalDate.of(2024, 1, 1));
		
		busServiceImpl.searchBus(bookingDetails);
	}
}
