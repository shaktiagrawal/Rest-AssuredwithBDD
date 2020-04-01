package readConfiguration;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadConfig {
	
	Logger logger = Logger.getLogger(ReadConfig.class);
	Properties baseURI = new Properties();
	Properties endPoint = new Properties();
	Properties path = new Properties();
	String configFile = "/MavenProject1/src/test/resources/config.properties";
	
	ReadConfig() 
	{
		logger.debug("Read Properties from the File");
		try {
			
			FileInputStream configBaseURI = getFileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
			if(configBaseURI!=null)
			{
				baseURI.load(configBaseURI);
			}
			logger.debug("baseURI loaded");
			
			FileInputStream configEndPoint = getFileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
			if(configEndPoint!=null)
			{
				endPoint.load(configEndPoint);
			}
			logger.debug("Endpoints loaded");
			
			FileInputStream configEmployees = getFileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
			if(configEmployees!=null)
			{
				path.load(configEmployees);
			}
			logger.debug("Employees EP loaded");
		} 
		catch(Exception e) {
			logger.error("ReadConfig Error Message : " + e.getMessage());
		}
	}

	
	
	
	//get and set function
	public static class LazyHolder
	{
		private static final ReadConfig INSTANCE = new ReadConfig();
	}
	public static ReadConfig getInstance()
	{
		return LazyHolder.INSTANCE;
	}
	public String getBaseURI(String key)
	{
		return baseURI.getProperty(key);
	}
	public String getEndpoint(String key)
	{
		return endPoint.getProperty(key);
	}
	public String getPath(String key)
	{
		return path.getProperty(key);
	}


	//getFileInputStrream
	public FileInputStream getFileInputStream(String filepath)
	{
		FileInputStream fstream = null;
		try
		{
			fstream = new FileInputStream(filepath);
		} 
		catch(Exception e)
		{
			logger.error("GetFileInputStream() exception message: " + e.getMessage());
		}
		return fstream;
	}
}
