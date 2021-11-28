package javaBasic;

public class Topic_01_System_Properties {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
       //C:\Users\ADMIN\Downloads\02.Selenium Webdriver
		//System.out.println(projectPath + "//BrowserDrivers//geckodriver-v0.30.0-macos-aarch64.tar.gz");
	  //C:\Users\ADMIN\Downloads\02.Selenium Webdriver\BrowserDrivers\geckodriver.exe
		
	}

}