package yeqiuchang;

import org.apache.log4j.Logger;

public class Client {
	public static final Logger logger = Logger.getLogger(Client.class);
	
	public void write(){
		
		logger.error("Error日志记录");
		logger.debug("Debug日志记录");
		logger.info("Info日志记录");
	}
}
