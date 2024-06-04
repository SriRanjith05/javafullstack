package com.newtonapple.cards.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newtonapple.cards.dto.CardsDto;
import com.newtonapple.cards.service.ICardsService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("cards_api")
@Slf4j
@Data
public class CardsController {
	
	private ICardsService cardsService;
	
	@PostMapping("/create")
	public String createCard(@RequestBody CardsDto cardsDto) {
		log.info("CardsController :: createCard");
		cardsService.createCard(cardsDto);
		return "Card created Successfully";
	}

}
