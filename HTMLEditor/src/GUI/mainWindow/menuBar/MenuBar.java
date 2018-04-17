package GUI.mainWindow.menuBar;

import javax.swing.JMenuBar;

import GUI.mainWindow.menuBar.fileMenu.FileMenu;

public class MenuBar extends JMenuBar
{
	protected FileMenu	m_fileMenu;
	
	public MenuBar()
	{
		super();
		
		this.m_fileMenu = new FileMenu();
		this.add(this.m_fileMenu);
	}
	
	public FileMenu		getFileMenu()	{ return (this.m_fileMenu);	}
}
