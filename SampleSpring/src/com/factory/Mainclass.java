package com.factory;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c = new Cat();
		Animal a =AnimalFactory.AnimalFactorymethod(c);
		a.haslegs();
		a.makeSound();
		
		Dog d = new Dog();
		Animal a1= AnimalFactory.AnimalFactorymethod(d);
		d.makeSound();
	}

}
