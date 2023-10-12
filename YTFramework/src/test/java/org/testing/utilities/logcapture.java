package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logcapture 
{
	public static void takelog(String classname, String logmsg)
	{
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(logmsg);
	}
}
