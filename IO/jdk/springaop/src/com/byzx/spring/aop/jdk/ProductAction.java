package com.byzx.spring.aop.jdk;

public class ProductAction {

	private IProductBiz proBiz;

	public IProductBiz getProBiz() {
		return proBiz;
	}

	public void setProBiz(IProductBiz proBiz) {
		this.proBiz = proBiz;
	}
	
	public void execute(Product product) {
		proBiz.addProduct(product);
		proBiz.updateProduct(product);
		proBiz.deleteProduct(product);
		proBiz.insertProduct(product);
	}
	
}































