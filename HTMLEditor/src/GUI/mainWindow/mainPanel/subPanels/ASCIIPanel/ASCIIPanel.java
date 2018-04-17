package GUI.mainWindow.mainPanel.subPanels.ASCIIPanel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ASCIIPanel extends JPanel
{
	protected HTMLEditor	m_HTMLEditor;
	protected JScrollPane	m_scrollPane;
	
	public ASCIIPanel()	
	{
		super();
		
		this.m_HTMLEditor = new HTMLEditor();
		
		this.m_scrollPane = new JScrollPane(this.m_HTMLEditor);
			this.m_scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			this.m_scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		this.setLayout(new BorderLayout());
		this.add(this.m_scrollPane, BorderLayout.CENTER);
	}
	
	public HTMLEditor	getHTMLEditor()	{ return (this.m_HTMLEditor);		}
	public JScrollPane	getJScrollPane()	{ return (this.m_scrollPane);	}
}
