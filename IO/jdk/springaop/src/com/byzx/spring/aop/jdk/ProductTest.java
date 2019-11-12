package com.byzx.spring.aop.jdk;

import java.lang.reflect.Proxy;

public class ProductTest {

	public static void main(String[] args) {
		ProductAction action = new ProductAction();
		
		ProductBiz target = new ProductBiz(); // 获取目标类的对象
		Class c = ProductBiz.class;
		ProductProxy proxy = new ProductProxy(target); // 代理类的对象
		// 获取代理类实现目标类所实现的接口的实例
		Object obj = Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), proxy);
		// obj对应的类实现了IProductBiz接口
		IProductBiz proBiz = (IProductBiz)obj;
		
		action.setProBiz(proBiz);
		action.execute(new Product());
		
		
		
		
		
		
	}
}
