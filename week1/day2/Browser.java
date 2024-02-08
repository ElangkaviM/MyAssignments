package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched succesfully");
		return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url launched successfully");
	}
	public static void main(String[] args) {
		Browser obj = new Browser();
		System.out.println(obj.launchBrowser("Chrome"));
		obj.loadUrl();
	}
}
