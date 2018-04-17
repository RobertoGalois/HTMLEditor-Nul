package GUI.mainWindow.menuBar.fileMenu.fileMenuItems;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class NewMenuItem extends JMenuItem
{
	public	NewMenuItem()
	{
		super("Nouveau");
		
		this.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
	}
}
