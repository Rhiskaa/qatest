package page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cucumber.api.Scenario;



public class Settings {
	
	final private static long defaultTimeOut = 50;
	static String homePageURL;
	static String Email ;
	static String Password ;
	private static Scenario currentScenario;
	private static String currentScreencaptureFolderPath;
	private static String _imageFilePath;
	private static String browserDownloadHostPath = System.getProperty("user.home") + File.separator
			+ "docksel_downloads";
	private static String browserDownloadRemotePath = "/home/seluser/Downloads";
	private static String browserDownloadRemoteFolderUR = "file://seluser/home/seluser/Downloads/";
	private static String driverRemoteURL = "http://10.71.32.147:4334/wd/hub";	

	
	public static String getHomePageURL() throws IOException {
		Properties prop = new Properties();
		InputStream input = new FileInputStream("Config.properties");
		prop.load(input);
		return homePageURL = prop.getProperty("homePageURL");
	}
	
	public static String getUserEmail()throws IOException{
		Properties prop = new Properties();
		InputStream input = new FileInputStream("Config.properties");
		prop.load(input);
		return Email = prop.getProperty("Email");
	}
	
	public static String getPassword()throws IOException{
		Properties prop = new Properties();
		InputStream input = new FileInputStream("Config.properties");
		prop.load(input);
		return Password = Function.decryptPass(prop.getProperty("Password"));
	}
	

	public static long getDefaultTimeOut() {
		return defaultTimeOut;
	}

	public static void setCurrentScreenCaptureFolderPath(String folderPath) {
		currentScreencaptureFolderPath = folderPath;
	}

	public static String getCurrentScreenCaptureFolderPath() {
		if (!currentScreencaptureFolderPath.endsWith(File.separator)) 
			currentScreencaptureFolderPath = currentScreencaptureFolderPath + "/";
		return currentScreencaptureFolderPath;
	}

	public static void setImagePathForUpload(String imageFilePath) {
		_imageFilePath = imageFilePath;
	}

	public static String getImagePathForUpload() {
		return _imageFilePath;
	}

	public static String getBrowserDownloadHostPath() {
		return browserDownloadHostPath;
	}

	public static void setBrowserDownloadPath(String browserDownloadPath) {
		Settings.browserDownloadHostPath = browserDownloadPath;
	}

	public static String getBrowserDownloadRemotePath() {
		return browserDownloadRemotePath;
	}

	public static void setBrowserDownloadRemotePath(String browserDownloadRemotePath) {
		Settings.browserDownloadRemotePath = browserDownloadRemotePath;
	}

	public static Scenario getCurrentScenario() {
		return currentScenario;
	}

	public static void setCurrentScenario(Scenario currentScenario) {
		Settings.currentScenario = currentScenario;
	}

	public static String getBrowserDownloadRemoteFolderURL() {
		return browserDownloadRemoteFolderUR;
	}

	public static String getDriverRemoteURL() {		
		driverRemoteURL = "http://localhost:4444/wd/hub";
		return driverRemoteURL;
	}

	public static boolean shoudlDeleteOriginalScreenCaptures() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
