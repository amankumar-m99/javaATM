package database;

import java.util.ArrayList;

import model.Card;

public class CardsDatabase {

	private static ArrayList<Card> cards = new ArrayList<>();

	public static ArrayList<Card> getAllRecords() {
		return cards;
	}

	public static void addRecord(Card card) {
		cards.add(card);
	}

	public static Card getLastRecord() {
		if(cards.size() != 0)
			return cards.get(cards.size()-1);
		return null;
	}

	public static Card getRecordByCardNumber(long cardNumber) {
		for(Card card: cards) {
			if(card.getCardNumber() == cardNumber)
				return card;
		}
		return null;
	}
}