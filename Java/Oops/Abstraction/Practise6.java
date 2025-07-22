package Abstract_class;

//import java.awt.Button;
//import java.awt.Checkbox;

interface GUIFactory{
	void createButton();
	Checkbox createCheckBox();
}
interface Button{
	 void render();
}
interface Checkbox{
	 void render();
}
class WindowFactory implements GUIFactory{

	@Override
	public void createButton() {
	System.out.println("creating button");;
	}

	@Override
	public Checkbox createCheckBox() {
		return new WindowsCheckbox();
	}
	
}
class WindowsButton implements Button{

	@Override
	public void render() {
		System.out.println("Rendering windows button");
	}
	
}
class WindowsCheckbox implements Checkbox{

	@Override
	public void render() {
		System.out.println("Rendering windows checkbox");
	}
	
}
public class Practise6 {

	public static void main(String[] args) {
		WindowFactory wf = new WindowFactory();
		Checkbox ck =wf.createCheckBox();
		ck.render();
		
		
		WindowsButton wb = new WindowsButton();
		wb.render();
	}

}
