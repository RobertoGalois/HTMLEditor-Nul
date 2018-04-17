package GUI.mainWindow.mainPanel.subPanels.ASCIIPanel;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextArea;

public class HTMLEditor extends JTextArea
{
	public	HTMLEditor()
	{
		super();
		
		this.setText("<html>\n" +
					 "  <head>\n" +
				     "    <title>Title</title>\n" +
				     "    <meta charset=\"utf-8\" />\n" +
				     "  </head>\n" +
				     "  <body>\n" +
				     "    <header>\n" +
				     "      <b>coucou tout le monde</b>\n" +
				     "    </header>\n" +
				     "    <nav>\n" +
				     "    </nav>\n" +
			      	 "    <section>\n" +
			         "    </section>\n" +
			         "    <footer>\n" +
			         "    </footer>\n" +
			         "  </body>\n" +
			         "</html>");
	}
}
