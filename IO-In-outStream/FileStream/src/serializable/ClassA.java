package serializable;

import java.io.Serializable;

public class ClassA implements Serializable {
	int fied1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
}
