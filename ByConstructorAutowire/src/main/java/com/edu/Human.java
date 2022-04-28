package com.edu;

public class Human 
{
  private Heart heart;
  
  public Human(Heart heart) {
	super();
	this.heart = heart;
}

public void functionHuman()
{
	if(heart!=null)
	{
		heart.pump();
	}
	else
	{
		System.out.println("------not alive----");
	}
}
  
}
