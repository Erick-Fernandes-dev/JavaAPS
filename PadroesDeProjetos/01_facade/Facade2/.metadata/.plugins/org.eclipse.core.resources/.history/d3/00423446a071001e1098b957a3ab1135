package after.facade;

import java.util.List;

import after.services.CardService;
import after.services.PaymentService;
import after.services.RegisterService;
import after.services.ReportService;
import after.services.SecurityService;
import before.model.Card;
import before.model.Register;

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
