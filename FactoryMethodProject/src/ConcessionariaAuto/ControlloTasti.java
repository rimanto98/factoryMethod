package ConcessionariaAuto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControlloTasti extends KeyAdapter {
	
	Pannello pannello;
	
	public ControlloTasti(Pannello p) {
		
		pannello = p;
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		pannello.tastoPremuto(e);
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		pannello.tastoRilasciato(e);
	}
	
	

}
