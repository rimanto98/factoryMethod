package ConcessionariaAuto;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class AutoVerde extends Auto {

	
	public AutoVerde() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void caricaImmagine() {
		try {
			car = ImageIO.read(new File("automobili" + File.separator  + "autoVerde.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Image immagineAuto() {
		//System.out.println("verde");
		caricaImmagine();
		return car;
	}

}
