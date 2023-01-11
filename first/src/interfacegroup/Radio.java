package interfacegroup;

public class Radio extends ModuleImpl{

	Radio(){System.out.println("Rabio기능을 시작합니다.");}
	
	public void powerOn() {super.powerOn();}
	public void powerOff() {super.powerOff();}
	public void volumnUp() {super.volumnUp();}
	public void volumnDown() {super.volumnDown();}
}
