package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import composite.Vojvodina;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void mouseClicked(MouseEvent e) {
		/* Testiranje MVC i Command obrasca
		Point p1 = new Point(e.getX(), e.getY(), Color.BLACK);
		//model.add(p1);
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		addPointCmd.execute();
		frame.repaint();
		*/
		
		// Testiranje Composite obrasca
		Point srem = new Point(e.getX(), e.getY(), Color.BLUE);
		Point backa = new Point(e.getX() + 10, e.getY(), Color.BLUE);
		Point banat = new Point(e.getX() + 5, e.getY() - 8, Color.BLUE);
		
		Vojvodina vojvodina = new Vojvodina();
		vojvodina.add(srem);
		vojvodina.add(banat);
		vojvodina.add(backa);
		
		model.add(vojvodina);
		frame.repaint();
	}
	
}
