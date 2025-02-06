package day09.static_.method;

public class Count {

public int a;
public static int b;

//일반메서드 - 일반변수, 정적변수 모두 사용가능
public int metheod01() {
	a = 10;
	return ++b;
}
 
//정적메서드 - static 멤버들만 접근 가능함.
// 단, 객체생성을 통해서는 일반 변수도 사용이 가능함.
public static int method02() {
//	b = 10;
	Count c = new Count();
	c.a = 1;
	
	return ++b;
}

}
