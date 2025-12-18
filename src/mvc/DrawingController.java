package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void mouseClicked(MouseEvent e) {
		Point p1 = new Point(e.getX(), e.getY(), Color.BLACK);
		//model.add(p1);
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		addPointCmd.execute();
		frame.repaint();
	}
	
}
