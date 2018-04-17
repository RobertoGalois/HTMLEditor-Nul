package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class SaveMenuItemListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(((JMenuItem)(e.getSource())).getParent(), "Sauvegarde du document HTML", "Sauvegarde du document", JOptionPane.INFORMATION_MESSAGE);
	}

}
