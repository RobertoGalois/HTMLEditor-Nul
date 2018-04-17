package GUI.mainWindow.menuBar.fileMenu.fileMenuItems;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class QuitMenuItem extends JMenuItem
{
	public	QuitMenuItem()
	{
		super("Quitter");
		
		this.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
	}
}
