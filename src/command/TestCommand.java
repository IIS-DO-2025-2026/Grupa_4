package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel();
		Point p1 = new Point(10,10,Color.BLACK);
		
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		
		addPointCmd.execute();
		System.out.println(model.getShapes());
		
		addPointCmd.unexecute();
		System.out.println(model.getShapes());
		
		addPointCmd.execute();
		
		// Testiramo brisanje
		RemovePointCmd removePointCmd = new RemovePointCmd(model, p1);
		
		removePointCmd.execute();
		System.out.println("Nakon brisanja, veličina liste je: " + model.getShapes().size());
		
		removePointCmd.unexecute();
		System.out.println("Nakon poništavanja brisanja lista je: " + model.getShapes());

		
		// Testiramo izmenu
		Point p2 = new Point(20,20,Color.black);
		
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		
		updatePointCmd.execute();
		System.out.println("Nakon izmene lista je: " + model.getShapes());
		
		updatePointCmd.unexecute();
		System.out.println("Nakon poništavanja izmene liste: " + model.getShapes());
		
	}

}
