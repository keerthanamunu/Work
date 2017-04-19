package com.factory;

public class AnimalFactory {

	public static Animal AnimalFactorymethod(Animal obj)
	{
		if(obj instanceof Dog)
		{
			return new Dog();
		}
		else
		{
			return new Cat();
		}
	}
}
