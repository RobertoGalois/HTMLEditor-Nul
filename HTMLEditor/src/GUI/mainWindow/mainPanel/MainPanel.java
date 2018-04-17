package GUI.mainWindow.mainPanel;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import GUI.mainWindow.mainPanel.subPanels.ASCIIPanel.ASCIIPanel;
import GUI.mainWindow.mainPanel.subPanels.HTMLPanel.HTMLPanel;

public class MainPanel extends JTabbedPane
{
	protected ASCIIPanel	m_ASCIIPanel;
	protected HTMLPanel		m_HTMLPanel;
	
	public MainPanel()
	{
		super();
		
		this.m_ASCIIPanel = new ASCIIPanel();
		this.m_HTMLPanel = new HTMLPanel();
		
		this.addTab("Editeur HTML", this.m_ASCIIPanel);
		this.addTab("Aperçu", this.m_HTMLPanel);
		
		this.setMnemonicAt(1, 'p');
		
	}
	
	public ASCIIPanel	getASCIIPanel()	{ return (this.m_ASCIIPanel);	}
	public HTMLPanel	getHTMLPanel()	{ return (this.m_HTMLPanel);	}
}
