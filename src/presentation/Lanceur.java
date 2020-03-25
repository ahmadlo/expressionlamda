package presentation;

import metier.Benjamin;
import metier.Cedric;
import metier.Fatimata;
import service.ITriathlon;
import service.ServiceSport;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceSport sport = new ServiceSport();
		Benjamin b = new Benjamin();
		
		//sport.participerTriathlon(b);
		// exemple 1
		sport.participerTriathlon(()-> {
				// TODO Auto-generated method stub
				System.out.println("on court ");
			
			
			
		});
		
		// exemple 2
		
		ITriathlon iTriathlon = () ->{System.out.println("je cours aussi");};
		
		sport.participerTriathlon(iTriathlon);
		
		Fatimata f = new Fatimata();
		
		//sport.participerTriathlon(f);
		
		/*Cedric c = new Cedric();
		sport.participerTriathlon(c);*/

	}

}
