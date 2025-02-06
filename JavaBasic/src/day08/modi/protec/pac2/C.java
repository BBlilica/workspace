package day08.modi.protec.pac2;

import day08.modi.protec.pac1.A;

public class C extends A {
	
public C() {
	
	A a = new A();
	a.bool = true; // 같은 패키지만 접근가능
	a.method();
	
	//super를 통한 접근은 가능함
	super.bool = true;
	super.method();
	
	
 }

}
