package ConcessionariaAuto;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class MainFrame extends JFrame implements Runnable{

	Menu menu;
	
	Pannello pannello;
	
	Boolean stoVedendoAuto;
	
	
	public MainFrame() {
		
		
		stoVedendoAuto = false;
			
		menu = new Menu (1280,720);
		
		menu.setLocation(0, 0);
		menu.setSize(this.getSize());
		menu.setVisible(true);
		this.add(menu);
		Thread t = new Thread(this);
		t.start();
	}


	@Override
	public void run() {
			while (true)
			{	
				if (menu.getAvvio())
				{
					
					menu.setAvvio(false);
					stoVedendoAuto = true;
					pannello = new Pannello(menu.auto);
					pannello.setLocation(0, 0);
					pannello.setSize(this.getSize());
					pannello.setVisible(true);
					this.setContentPane(pannello);
					this.invalidate();
					this.validate();
					removeKeyListener(menu);
					addKeyListener(new ControlloTasti(pannello));
					pannello.setFocusable(true);
					requestFocusInWindow();
				}
				
				else if (stoVedendoAuto)
				{
					if(pannello.getTornaAlMenu())
					{
						stoVedendoAuto = false;
						pannello.setTornaAlMenu(false);
						menu.setVisible(true);
						this.setContentPane(menu);
						this.invalidate();
						this.validate();

						addKeyListener(menu);
						menu.setFocusable(true);
						requestFocusInWindow();
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
	}
	
}
