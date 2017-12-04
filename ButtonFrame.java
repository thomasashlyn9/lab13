/**
 * @name Ashlyn Thomas
 * @since 11/30/2017
 * @version 1.0
 */
package lab13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame {
	
	/*
	 * hint: create numClick (incr every tie clicked)
	 * remainder of numclick numClick%4
	 * System.exit(0) to exit
	 * numClick=0
	 */
	private JPanel buttonPanel;

	private String title;
	
	private static final int DEFAULT_WIDTH = 300;
	
	private static final int DEFAULT_HEIGHT = 200;
	
	public ButtonFrame() {

		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setName(title);
		
		// create buttons
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(changeButton); // *********
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// add panel to frame
		add(buttonPanel);

		// create button actions
		ColorAction blackAction = new ColorAction(Color.BLACK); // ********
		ColorAction greenAction = new ColorAction(Color.GREEN);
		ColorAction orangeAction = new ColorAction(Color.ORANGE);
		ColorAction pinkAction = new ColorAction(Color.PINK);

		// associate actions with buttons

		for (int numClicks = 0; numClicks < 4; numClicks++) {
			changeButton.addActionListener(blackAction);
			numClicks++;
			changeButton.addActionListener(greenAction);
			numClicks++;
			changeButton.addActionListener(orangeAction);
			numClicks++;
			changeButton.addActionListener(pinkAction);
			numClicks++;
		}
		resetButton.addActionListener(pinkAction);
		closeButton.addActionListener(orangeAction);
	}
	
	/* An action listener that sets the panel's background color */
	private class ColorAction implements ActionListener
	{
		private Color backgroundColor;
		
		public ColorAction(Color c)
		{
			backgroundColor = c;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			buttonPanel.setBackground(backgroundColor);
		}
	}
}