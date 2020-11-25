import java.io.Serializable;

public class ClassA implements Serializable {
	// p.1046 예제 직렬화가 가능한 클래스
	
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
}
