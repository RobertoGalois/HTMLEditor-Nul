package GUI.mainWindow.menuBar.fileMenu;

import javax.swing.JMenu;

import GUI.mainWindow.menuBar.fileMenu.fileMenuItems.NewMenuItem;
import GUI.mainWindow.menuBar.fileMenu.fileMenuItems.QuitMenuItem;
import GUI.mainWindow.menuBar.fileMenu.fileMenuItems.SaveMenuItem;

public class FileMenu extends JMenu
{
	protected NewMenuItem	m_newMenuItem;
	protected SaveMenuItem	m_saveMenuItem;
	protected QuitMenuItem	m_quitMenuItem;
	
	public	FileMenu()
	{
		super("File");

		this.m_newMenuItem = new NewMenuItem();
		this.m_saveMenuItem = new SaveMenuItem();
		this.m_quitMenuItem = new QuitMenuItem();
		
		this.add(this.m_newMenuItem);
		this.add(this.m_saveMenuItem);
		this.add(this.m_quitMenuItem);
		
		this.setMnemonic('F');
	}
	
	public NewMenuItem	getNewMenuItem()	{ return (this.m_newMenuItem);	}
	public SaveMenuItem	getSaveMenuItem()	{ return (this.m_saveMenuItem);	}
	public QuitMenuItem	getQuitMenuItem()	{ return (this.m_quitMenuItem);	}
}
