package GUI.mainWindow.mainPanel.subPanels.HTMLPanel;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLEditorKit;

public class HTMLPreview extends JEditorPane
{
	public HTMLPreview()
	{
		super();
		
		
		this.setEditable(false);
		this.setEditorKit(new HTMLEditorKit());
		this.setText("<html>\n" +
				 "  <head>\n" +
			     "    <title>Title</title>\n" +
			     "    <meta charset=\"utf-8\" />\n" +
			     "  </head>\n" +
			     "  <body>\n" +
			     "    <header>\n" +
			     "      <b><i>coucou tout le monde</i></b>\n" +
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
