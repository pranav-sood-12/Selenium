package Day1;

//import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		wc.getPageTitle();
//		wc.closeBrowser();f
		wc.navigateCommands();
		wc.login("102003226","Pranavsood12*");


	}

}
