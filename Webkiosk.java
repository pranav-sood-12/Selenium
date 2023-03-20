package first_lab;



public class first_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingWithChrome wc = new WorkingWithChrome();
		for(int id=102003010;id<102003040;id++)
		{
			String ids = String.valueOf(id);
			wc.invokeBrowser();
			wc.getPageTitle();
			
			wc.navigateCommands();
			
			wc.login(ids,"12345");
			
			
			wc.closeBrowser();
		}
	}

}
