import java.util.Random;

import javax.swing.JLabel;

//Co by to nie zlagowac glownego watku, rollowanie bedzie w osobnym
public class RollThread extends Thread
{

	private DiceDraw window;
	private JLabel szLabel = null;

	public RollThread(DiceDraw panel, JLabel Label)
	{
		window = panel;
		szLabel = Label;
		start();
	}

	public void run()
	{
		szLabel.setText("Poczekaj az sie zatrzyma...");
		for (int i = 1; i <= 20; i++ )
		{
			Random Kosc = new Random();
			window.set_liczba(Kosc.nextInt(6) + 1);
			try
			{
				sleep(i * 10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		szLabel.setText("Wyrzuciles : " + window.set_liczba(0));
	}
}
