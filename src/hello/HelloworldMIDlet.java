package hello;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class HelloworldMIDlet extends MIDlet implements CommandListener{
 private Form form;
 private Display display;
 private Command exitCommand;

 public HelloworldMIDlet() {
//  form = new Form("My First J2ME App");
//  String msg = "Hello World Custom!";
//  form.append(msg);
//  display = Display.getDisplay(this);
//  display.setCurrent(form);

	 display=Display.getDisplay(this);
	 exitCommand=new Command("Exit",Command.EXIT,0);
	 
 }

 protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
  notifyDestroyed();
 }

 protected void pauseApp() {
  // TODO Auto-generated method stub

 }

 protected void startApp() throws MIDletStateChangeException {
  // TODO Auto-generated method stub
	 TextBox t=new TextBox("Hello","Hello World Edit",256,0);
	 
 t.addCommand(exitCommand);
 t.setCommandListener(this);
 
 display.setCurrent(t);
 

 }

public void commandAction(Command arg0, Displayable arg1) {
	// TODO Auto-generated method stub
	
}

}
