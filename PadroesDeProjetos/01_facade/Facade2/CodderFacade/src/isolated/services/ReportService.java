package isolated.services;

import java.util.List;

import isolated.model.Card;
import isolated.model.Register;

public class ReportService {
	
	
	private RegisterService registerService;
	
	
	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
	public void getSumary(Card card) {
		
		List<Register> register = registerService.getRegistersByCard(card);
		
		for (Register reg : register) {
			System.out.println(String.format("%s\t%.2f\t%s", 
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()
					));
		}
		
	}

}
