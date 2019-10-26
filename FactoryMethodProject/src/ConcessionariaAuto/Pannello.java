package ConcessionariaAuto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Pannello extends JPanel implements ActionListener{

	private Auto auto;
	
	volatile Boolean tornaAlMenu;
	
	
	public Pannello(Auto auto) {
		
		this.auto = auto;
		
		tornaAlMenu = false;
	}

	public void paint (Graphics g) {
		
		super.paint(g);
		
		Graphics2D grafica2d = (Graphics2D) g;
		
		grafica2d.drawImage(auto.immagine(), 0 , 0 , 1280, 720 - 20, null);
		
	}
	

	
	public Boolean getTornaAlMenu() {
		
		return tornaAlMenu;
	}

	public void setTornaAlMenu(Boolean tornaAlMenu) {
		this.tornaAlMenu = tornaAlMenu;
	}
	
	public void tastoPremuto(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE ) 
		{
			tornaAlMenu = true;
		}
		
	}

	public void tastoRilasciato(KeyEvent e) {
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
