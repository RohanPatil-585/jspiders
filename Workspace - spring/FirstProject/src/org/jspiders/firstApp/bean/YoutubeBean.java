package org.jspiders.firstApp.bean;

public class YoutubeBean 
{
	public YoutubeBean() 
	{
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	public void play(String name)
	{
		System.out.println("playing...\t"+name);
	}
}