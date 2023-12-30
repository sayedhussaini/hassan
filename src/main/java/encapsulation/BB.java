package encapsulation;

public class BB {

	public void lounchBrowser(String Browser, String os) {

		interactWithBrowser(Browser, os);

	}

	private void interactWithBrowser(String Browser, String os) {

		if (Browser.equals("chrome")) {
			interactwithChromeServices(os);
			System.out.println("lounch Chrome");
		} else if (Browser.equals("fairsfox")) {
			interactwithFirefoxServices(os);
			System.out.println("lounch firefox");
		}

	}

	private void interactwithChromeServices(String os) {
		if (os.equals("WIN")) {
			System.out.println("WIN_________ Chrome");
		} else if (os.equals("MAC")) {
			System.out.println("MAC _________Chrome");
		} else if (os.equals("LINUX")) {
			System.out.println("LINUX_________chrome");
		}

	}

	private void interactwithFirefoxServices(String os) {
		if (os.equals("WIN")) {
			System.out.println("WIN_________ FireFox");
		} else if (os.equals("MAC")) {
			System.out.println("MAC _________FireFox");
		} else if (os.equals("LINUX")) {
			System.out.println("LINUX_________FireFox");
		}

	}
}
