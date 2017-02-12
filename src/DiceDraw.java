import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/*
 Oblicznie poszczegolnych oczek na kostce 

 [1 2 3]
 [4 5 6]
 [7 8 9]

 g2.fillOval(PosX + 50 - 15, PosY + 50 - 15, 30, 30); //1
 g2.fillOval(PosX + 100 - 15, PosY + 50 - 15, 30, 30); //2
 g2.fillOval(PosX + 150 - 15, PosY + 50 - 15, 30, 30); //3
 g2.fillOval(PosX + 50 - 15, PosY + 100 - 15, 30, 30); //4
 g2.fillOval(PosX + 100 - 15, PosY + 100 - 15, 30, 30); //5
 g2.fillOval(PosX + 150 - 15, PosY + 100 - 15, 30, 30); //6
 g2.fillOval(PosX + 50 - 15, PosY + 150 - 15, 30, 30); //7
 g2.fillOval(PosX + 100 - 15, PosY + 150 - 15, 30, 30); //8
 g2.fillOval(PosX + 150 - 15, PosY + 150 - 15, 30, 30); //9
 */

public class DiceDraw extends JPanel
{

	private static final long serialVersionUID = - 3378100969410813842L;
	private int giLiczba = 1;

	public DiceDraw()
	{
		super();
		setBackground(new Color(245, 245, 245));
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		int PosX, PosY;
		PosX = getWidth() / 2 - 100;
		PosY = getHeight() / 2 - 100;
		g2.drawRect(PosX, PosY, 200, 200);
		switch (giLiczba)
		{
			case 1:
			{
				g2.fillOval(PosX + 100 - 15, PosY + 100 - 15, 30, 30);
				break;
			}
			case 2:
			{
				g2.fillOval(PosX + 50 - 15, PosY + 100 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 100 - 15, 30, 30);
				break;
			}
			case 3:
			{
				g2.fillOval(PosX + 50 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 100 - 15, PosY + 100 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 150 - 15, 30, 30);
				break;
			}
			case 4:
			{
				g2.fillOval(PosX + 50 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 50 - 15, PosY + 150 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 150 - 15, 30, 30);
				break;
			}
			case 5:
			{
				g2.fillOval(PosX + 50 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 100 - 15, PosY + 100 - 15, 30, 30);
				g2.fillOval(PosX + 50 - 15, PosY + 150 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 150 - 15, 30, 30);
				break;
			}
			case 6:
			{
				g2.fillOval(PosX + 50 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 100 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 50 - 15, 30, 30);
				g2.fillOval(PosX + 50 - 15, PosY + 150 - 15, 30, 30);
				g2.fillOval(PosX + 100 - 15, PosY + 150 - 15, 30, 30);
				g2.fillOval(PosX + 150 - 15, PosY + 150 - 15, 30, 30);
				break;
			}
		}
	}

	public int set_liczba(int tempLicz)
	{
		if(tempLicz > 0 && tempLicz < 7)
		{
			giLiczba = tempLicz;
			repaint();
		}
		return giLiczba;
	}
}
