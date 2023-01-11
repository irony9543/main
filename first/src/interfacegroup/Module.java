package interfacegroup;

public interface Module {

	int MIN_VOLUMN=0;
	int MAX_VOLUMN=50;
	int MIN_LIGHT=0;
	int MAX_LIGHT=100;
	
	void powerOn();
	void powerOff();
	void powerRestart();
	void keyPress();
	void keyClick();
	void volumnUp();
	void volumnDown();
	void lightUp();
	void lightDown();	
	
}
