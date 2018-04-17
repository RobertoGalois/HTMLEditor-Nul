package listeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class NewMenuItemListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(((JMenuItem)(e.getSource())).getRootPane(), "Nouveau document HTML", "Nouveau document", JOptionPane.INFORMATION_MESSAGE);
	}	
}
