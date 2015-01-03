package org.bh.tools.comps.logger;

/**
 * BHLogger, made for BH Logger, is copyright Blue Husky Programming ©2015 GPLv3 <hr/>
 * 
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0
 *		- 2015-01-02 (1.0.0) - Kyli created BHLogger
 * @since 2015-01-02
 */
public class BHLogger
{
	private LogValues values;
	private BHLoggerPanel panel;
	
	public BHLogger(LogValues initValues)
	{
		values = initValues;
		panel = new BHLoggerPanel();
	}
	
	
}
