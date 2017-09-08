package org.jeecgframework.core.util;

public class ThreadContext 
{
	public static ThreadLocal<String> dbSource = new ThreadLocal<String>();
	
	
	public static String getDbSource()
	{
		return dbSource.get();
	}
	
	public static void setDbSource(String dbSourceParam)
	{
		dbSource.set(dbSourceParam);
	}

}
