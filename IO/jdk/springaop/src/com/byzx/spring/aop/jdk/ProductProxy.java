package com.byzx.spring.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 代理类
public class ProductProxy implements InvocationHandler{
	
	private IProductBiz proBiz;
	public ProductProxy(IProductBiz proBiz) {
		this.proBiz = proBiz;
	}
	public ProductProxy() {}

	// 作用: 动态的拦截目标类的方法的执行，并给拦截的方法执行前后加入额外的逻辑代码
	// 每拦截一个方法，该方法执行一次
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// proxy 代理类的对象
		// method 拦截的某个目标类中的方法对象
		// args 拦截的方法对应的参数
		System.out.println(method.getName() + "目标类的方法执行之前");
		// 在类之外利用反射机制调用方法
		Object returnValue = method.invoke(proBiz, args);
		System.out.println(method.getName() + "目标类的方法执行之后");
		System.out.println("方法的返回值:" + returnValue);
		return returnValue;
	}

}










