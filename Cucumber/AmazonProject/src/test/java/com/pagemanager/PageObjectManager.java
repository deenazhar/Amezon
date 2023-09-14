package com.pagemanager;

import com.pages.AmazonPage;

public class PageObjectManager {
	
	private AmazonPage amazonPage;

	public AmazonPage getAmazonPage() {
		return (amazonPage==null)?amazonPage=new AmazonPage():amazonPage ;
	}
	
	

}
