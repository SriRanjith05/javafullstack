package com.newtonapple.cards.serviceimpl;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.newtonapple.cards.dto.CardsDto;
import com.newtonapple.cards.entity.Cards;
import com.newtonapple.cards.exception.CardAlreadyExistsException;
import com.newtonapple.cards.repository.CardsRepository;
import com.newtonapple.cards.service.ICardsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CardsServiceImpl implements ICardsService{
	
	private CardsRepository cardsRepository;
	
	@Override
	public void createCard(String mobileNumber) {
		Optional<Cards> optional = cardsRepository.findByMobileNumber(mobileNumber);
		if(optional.isPresent()) {
			throw new CardAlreadyExistsException("Already Card available for Customer with given mobile number");
		}
		// if New Card is not present, executing else part to create New Card for the given number
		createNewCard(mobileNumber);
		
	}
	private void createNewCard(String mobileNumber) {
		//converting CardsDto to Cards Entity
		Cards cards = new Cards();
		long randomNumber = 10000000L + new Random().nextInt(900000); 
		cards.setCardNumber(String.valueOf(randomNumber));
		cards.setMobileNumber(mobileNumber);
		cards.setCardType(mobileNumber);
		cards.setAvailableAmount(mobileNumber);
		cards.setAmountUsed(mobileNumber);
		cards.setTotalLimit(0);
		cardsRepository.save(cards);
	}
			
	
	
	public CardsDto fetchCard(String mobileNumber) {
		return null;
	}
	
	public boolean updateCard(CardsDto cardsDto) {
		return false;
	}
	
	public boolean deleteCard(String mobileNumber) {
		return false;
	}

}
