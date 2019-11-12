package com.byzx.spring.aop.jdk;

// 目标类
public class ProductBiz implements IProductBiz{

	@Override
	public int addProduct(Product product) {
		System.out.println("****ProductBiz******addProduct*****");
		return 34;
	}

	@Override
	public String updateProduct(Product product) {
		System.out.println("****ProductBiz******updateProduct*****");
		return "xyz";
	}

	@Override
	public int deleteProduct(Product product) {
		System.out.println("****ProductBiz******deleteProduct*****");
		return 29;
	}

	@Override
	public int insertProduct(Product product) {
		System.out.println("****ProductBiz******insertProduct*****");
		return 56;
	}

}
















