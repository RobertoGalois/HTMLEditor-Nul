package GUI.mainWindow.mainPanel.subPanels.HTMLPanel;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import GUI.mainWindow.mainPanel.subPanels.ASCIIPanel.HTMLEditor;

public class HTMLPanel extends JPanel
{
	protected HTMLPreview	m_HTMLPreview;
	protected JScrollPane	m_scrollPane;
	
	public HTMLPanel()
	{
		super();
		
		this.m_HTMLPreview = new HTMLPreview();
		
		this.m_scrollPane = new JScrollPane(this.m_HTMLPreview);
			this.m_scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			this.m_scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		this.setLayout(new BorderLayout());
		this.add(this.m_scrollPane, BorderLayout.CENTER);
		
		this.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e)
			{
				System.out.println("Je suis dessus");
			}
			
			public void focusLost(FocusEvent e)
			{
				
			}
		});
	}
	
	public HTMLPreview	getHTMLPreview()	{ return (this.m_HTMLPreview);	}
	public JScrollPane	getJScrollPane()	{ return (this.m_scrollPane);	}
}

