package com.speak.info;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextSpeach {

	protected Shell shell;
	private Text txtThis;
	private Button btnNewButton;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TextSpeach window = new TextSpeach();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	private static final String voiceName = "kevin16";

	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(696, 374);
		shell.setText("Text to Speech");
		shell.setLayout(null);

		txtThis = new Text(shell, SWT.BORDER);
		txtThis.setBounds(39, 52, 150, 72);

		Button btnSpeak = new Button(shell, SWT.NONE);

		btnSpeak.addSelectionListener(new SelectionAdapter() {
			@Override

			public void widgetSelected(SelectionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

				Voice voice;
				VoiceManager mg = VoiceManager.getInstance();
				voice = mg.getVoice("kevin16");
				voice.allocate();

				try {
					voice.speak(txtThis.getText());

				} catch (Exception e1) {

				}
			}
		});
		btnSpeak.setBounds(269, 68, 103, 30);
		btnSpeak.setText("speak");

		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(282, 117, 90, 30);
		btnNewButton.setText("New Button");

	}
}
