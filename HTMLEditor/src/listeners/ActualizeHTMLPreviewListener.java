package listeners;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;

public class ActualizeHTMLPreviewListener implements ChangeListener
{
	protected JTextComponent	m_readed;
	protected JTextComponent	m_wrote;
	
	public ActualizeHTMLPreviewListener(JTextComponent p_readed, JTextComponent p_wrote)
	{
		this.m_readed = p_readed;
		this.m_wrote = p_wrote;
	}
	
	public void stateChanged(ChangeEvent e)
	{
		JTabbedPane ListenedPane = ((JTabbedPane)(e.getSource()));
		
		if (ListenedPane.getSelectedIndex() == 1)
			this.m_wrote.setText(this.m_readed.getText());		
	}
}
