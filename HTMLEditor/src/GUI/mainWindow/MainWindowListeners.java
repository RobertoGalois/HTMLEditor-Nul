package GUI.mainWindow;

import listeners.ActualizeHTMLPreviewListener;
import listeners.NewMenuItemListener;
import listeners.QuitMenuItemListener;
import listeners.SaveMenuItemListener;

public class MainWindowListeners 
{
	protected MainWindow	m_window;
	
	public MainWindowListeners(MainWindow p_window)
	{
		this.m_window = p_window;
		this.connectListeners();
	}
	
	private void connectListeners()
	{
		/* ActualizeHTMLPreviewListener */
		this.m_window.getMainPanel().addChangeListener(
			new ActualizeHTMLPreviewListener(
				this.m_window.getMainPanel().getASCIIPanel().getHTMLEditor(),
				this.m_window.getMainPanel().getHTMLPanel().getHTMLPreview()));
		
		/* NewMenuItemListener */
		this.m_window.getMainMenuBar().getFileMenu().getNewMenuItem().addActionListener(
			new NewMenuItemListener());
		
		/* SaveMenuItemListener */
		this.m_window.getMainMenuBar().getFileMenu().getSaveMenuItem().addActionListener(
				new SaveMenuItemListener());
		
		this.m_window.getMainMenuBar().getFileMenu().getQuitMenuItem().addActionListener(
				new QuitMenuItemListener());
			
	}
}
