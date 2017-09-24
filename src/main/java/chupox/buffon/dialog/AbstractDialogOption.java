package chupox.buffon.dialog;

import javax.swing.JComponent;

public abstract class AbstractDialogOption<T> {

	protected String name;

	public String getName() {
		return name;
	}

	public abstract JComponent getComponent();

	public abstract T getValue();
}