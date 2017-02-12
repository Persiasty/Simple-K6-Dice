import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Frame extends JFrame implements ActionListener
{

	private static final long serialVersionUID = - 5698765985017038049L;
	private DiceDraw diceDraw;
	public JLabel label = null;
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Frame();
			}
		});
	}
	
	public Frame()
	{
		setBounds(300, 100, 480, 370);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(prepareControls());
		setTitle("Kostka");
		setLocationRelativeTo(null);
		setVisible(true);

	}

	// Przygotowywanie "kontrolek"
	public JPanel prepareControls()
	{
		JButton start1 = new JButton("Rzuc");
		start1.setActionCommand("start");
		start1.addActionListener(this);

		label = new JLabel("Rzuc kostka !");

		// Panel do rysowania
		diceDraw = new DiceDraw();

		JPanel upPanel = new JPanel();
		upPanel.add(start1);

		// Wrzucimy go na gore splitpane'a
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				upPanel, diceDraw);
		splitPane.setPreferredSize(new Dimension(440, 300));
		splitPane.setEnabled(false);
		splitPane.setDividerLocation(70);
		splitPane.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(new Color(152, 160, 130)),
				"Kostka"));

		JPanel mainPanel = new JPanel();
		mainPanel.add(splitPane);
		mainPanel.add(label);
		return mainPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("start"))
		{
			new RollThread(diceDraw, label).start();
		}

	}

}
