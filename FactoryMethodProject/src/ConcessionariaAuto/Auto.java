package ConcessionariaAuto;

import java.awt.Image;
import java.util.ArrayList;

public class Auto {
	
	Image car;

	public Image immagine() {	//factory method
		car = immagineAuto();
		return car;

	}

	public void caricaImmagine()
	{
		return;
	}
	public Image immagineAuto() {
		// TODO Auto-generated method stub
		return null;
	}

}
