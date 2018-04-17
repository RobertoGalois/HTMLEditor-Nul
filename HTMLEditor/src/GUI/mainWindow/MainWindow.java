package GUI.mainWindow;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import GUI.mainWindow.mainPanel.MainPanel;
import GUI.mainWindow.menuBar.MenuBar;

public class MainWindow extends JFrame
{
	protected MainPanel				m_mainPanel;
	protected MenuBar				m_menuBar;
	protected MainWindowListeners	m_mainWindowListeners;
	
	public MainWindow()
	{
		super();
		
		this.m_mainPanel = new MainPanel();
		this.m_menuBar = new MenuBar();
		this.m_mainWindowListeners = new MainWindowListeners(this);
		
		this.setSize(800, 600);
		this.setJMenuBar(this.m_menuBar);
		this.getContentPane().add(this.m_mainPanel, BorderLayout.CENTER);
		this.setTitle("Editeur HTML");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public MainPanel	getMainPanel()		{ return (this.m_mainPanel);	}
	public MenuBar		getMainMenuBar()	{ return (this.m_menuBar);		}
}
