package com.byzx.spring.aop.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserTest {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 反射机制 reflect
		Class clz = Class.forName("com.byzx.spring.aop.test.User");
		// 被private修饰的属性或方法只能在本类中进行访问，除了反射机制
		Field[] fields = clz.getDeclaredFields();
		/*for(Field field: fields) {
			System.out.println("属性名称:" + field.getName());
			System.out.println("属性修饰符:" + field.getModifiers());
			System.out.println("属性数据类型:" + field.getGenericType());
			System.out.println("***************************************");
		}*/
		Method[] methods = clz.getDeclaredMethods();
		for(Method method: methods) {
			if(method.getName().equals("setUsername")) {
				// 利用反射机制调用方法
				method.invoke(new User(), "abc");
			}
			System.out.println("方法名:" + method.getName());
			System.out.println("方法修饰符:" + method.getModifiers());
			System.out.println("方法返回值类型:" + method.getGenericReturnType());
			System.out.println("***************************************");
		}
		
		
	}
}
















