package com.newtonapple.cards.service;

import com.newtonapple.cards.dto.CardsDto;

public interface ICardsService {
	
	void createCard(CardsDto cardsDto);
	
	CardsDto fetchCard(String mobileNumber);
	
	boolean updateCard(CardsDto cardsDto);
	
	boolean deleteCard(String mobileNumber);


}
