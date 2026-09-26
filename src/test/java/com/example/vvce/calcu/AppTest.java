package com.example.vvce.calcu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;




public class AppTest {
	App app=new App();
	void testAdd() {
		assertEquals(25,app.add(20,5));
	}
	void testSubtract() {
		assertEquals(15,app.add(20,5));
	}
	void testmultiply() {
		assertEquals(10,app.multiply(2,5));
		
	}
	
	

 
         
   
}
