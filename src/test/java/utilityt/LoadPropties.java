package utilityt;

import java.io.IOException;
import java.util.Properties;

public class LoadPropties {

	public static String App_URl;
	public static String Browser;
	public static String Username;
	public static String Password;
	public void loadprop(){
		Properties prop = new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadPropties.App_URl = prop.getProperty("APPURl");
		LoadPropties.Browser =prop.getProperty("browser");
		LoadPropties.Username =prop.getProperty("username");
		LoadPropties.Password =prop.getProperty("Password");
		

	}

}
