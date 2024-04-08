package isolated.facade;

import java.util.List;

import isolated.services.CardService;
import isolated.services.PaymentService;
import isolated.services.RegisterService;
import isolated.services.ReportService;
import isolated.services.SecurityService;
import isolated.model.Card;
import isolated.model.Register;

public class CallCenterFacade {
	
	private CardService cardService;
	private RegisterService registerService;
	private ReportService reportService;
	private PaymentService paymentService;
	private SecurityService securityService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
		
	}
	
	public Card getCardByUser(Long l) {
		return cardService.getCardByUser(l);
	}
	
	public void getSumary(Card card) {
		reportService.getSumary(card);
	}
	
	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}
	
	public void cancelLastRegister(Card card) {
		List<Register> register = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, register.size() - 1);
		
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
		
	}

}
