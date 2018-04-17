package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class QuitMenuItemListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int		answer = 0;
		
		answer = JOptionPane.showConfirmDialog(null, "Etes-vous sûr de vouloir quitter le logiciel ?", "Quitter le logiciel", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (answer == JOptionPane.OK_OPTION)
		{
			System.exit(0);
		}
	}

}
