package com.sapient.product1;

import org.slf4j.*;

public class Application {

	static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("this is debug message");
		logger.error("this is error message");
	}
}
