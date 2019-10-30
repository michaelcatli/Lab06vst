// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.util.Random;


public class Lab06vst extends Applet
{

	public void paint(Graphics g)
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		// Draw Random Lines
		for (int k = 1; k<=100; k++)
			{
				int firstX = (int) (Math.random()*391) + 10;
				int firstY = (int) (Math.random()*291) + 10;
				int secondX = (int) (Math.random()*391) + 10;
				int secondY = (int) (Math.random()*291) + 10;
				g.drawLine(firstX,firstY,secondX,secondY);
				int x =  (int) (Math.random()*256);
				int y = (int) (Math.random()*256);
				int z =  (int) (Math.random()*256);
				g.setColor(new Color(x,y,z));
			}
	// Draw Random Squares
		for (int k=1; k<=100; k++)
		{
			int diam = (int) (Math.random()*51);
			int firstX = (int) (Math.random()*(391-diam)) + 400;
			int firstY = (int) (Math.random()*(291-diam)) + 10;
			g.fillRect(firstX,firstY,diam,diam);
			int x =  (int) (Math.random()*256);
			int y = (int) (Math.random()*256);
			int z =  (int) (Math.random()*256);
			g.setColor(new Color(x,y,z));
				}
	// Draw Random Circles
		for (int k=1; k<=100; k++){
			int diam = (int) (Math.random()*201);
			int firstX = (int) (Math.random()*(391-diam)) + 10;
			int firstY = (int) (Math.random()*(291-diam)) + 300;
			g.drawOval(firstX,firstY,diam,diam);
			int x =  (int) (Math.random()*256);
			int y = (int) (Math.random()*256);
			int z =  (int) (Math.random()*256);
			g.setColor(new Color(x,y,z));
				}
	// Draw 3-D Box
		Polygon Roof = new Polygon();
		Roof.addPoint(520,350);
		Roof.addPoint(580,400);
		Roof.addPoint(580,500);
		Roof.addPoint(520,450);
		g.setColor(new Color(0,255,0));
		g.fillPolygon(Roof);
		Polygon Front = new Polygon();
		Front.addPoint(580,400);
		Front.addPoint(680,400);
		Front.addPoint(680,500);
		Front.addPoint(580,500);
		g.setColor(new Color(255,0,0));
		g.fillPolygon(Front);
		Polygon Back = new Polygon();
		Back.addPoint(520,350);
		Back.addPoint(520,540);
		Back.addPoint(520,400);
		Back.addPoint(580,400);
		g.setColor(new Color(0,125,130));
		g.fillPolygon(Back);





	}

}
