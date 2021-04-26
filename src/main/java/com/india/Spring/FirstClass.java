package com.india.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:abcd.properties","application.properties","classpath:xyz.properties"})
public class FirstClass {
	
	@Value("${my.app.name}")
	private String name;
	
	@Value("${my.aap.version}")
	private String version;
	
	@Value("${a}")
	private int a;
	
	
	public String toString()
	{
		return "Application Details : [Name ;"+name+", Version :"+version+" , a :"+a+"]" ;
	}

}
