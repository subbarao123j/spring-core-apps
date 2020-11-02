package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("BeforeInitialization called" + beanName);
		System.out.println("before bean" + bean);

		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("AfterInitialization called" + beanName);
		System.out.println("bean" + bean);

		return bean;
	}

}
