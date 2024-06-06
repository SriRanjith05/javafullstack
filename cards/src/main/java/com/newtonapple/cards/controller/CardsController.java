package com.newtonapple.cards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newtonapple.cards.dto.CardsDto;
import com.newtonapple.cards.service.ICardsService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("cards_api")
@Slf4j
public class CardsController {
	@Autowired
	private ICardsService iCardsService;
	
	@PostMapping("/create")
	public String createCard(@RequestParam String mobileNumber) {
		log.info("CardsController :: createCard");
		iCardsService.createCard(mobileNumber);
		return "Card created Successfully";
	}

}
