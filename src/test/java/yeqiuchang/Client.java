package yeqiuchang;

import org.apache.log4j.Logger;

public class Client {
	public static final Logger logger = Logger.getLogger(Client.class);
	
	public void write(){
		
		logger.error("Error��־��¼");
		logger.debug("Debug��־��¼");
		logger.info("Info��־��¼");
	}
}
