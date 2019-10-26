package ConcessionariaAuto;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class AutoBlu extends Auto {

	public AutoBlu() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caricaImmagine() {
		try {
			car = ImageIO.read(new File("automobili" + File.separator  + "autoBlu.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Image immagineAuto() {
		//System.out.println("blu");
		caricaImmagine();
		return car;
	}
}
