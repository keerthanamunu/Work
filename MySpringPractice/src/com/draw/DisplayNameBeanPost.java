package com.draw;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DisplayNameBeanPost implements BeanFactoryPostProcessor{

/*	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in after post initialization bean Name "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in before post initialization bean Name "+beanName);
		return bean;
	}*/

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanf) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean post processorrr factory");
	}

}
