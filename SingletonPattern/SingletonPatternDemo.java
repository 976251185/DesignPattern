package SingletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		SingletonLazy s1 = SingletonLazy.getInstance();
		SingletonLazy s2 = SingletonLazy.getInstance();
		System.out.println(s1==s2);
		SingletonLazy2 s3 = SingletonLazy2.getInstance();
		SingletonLazy2 s4 = SingletonLazy2.getInstance();
		System.out.println(s3==s4);
		SingletonDCL sD = SingletonDCL.getInstance();
		SingletonDCL sD1 = SingletonDCL.getInstance();
		System.out.println(sD==sD1);
		SingletonStatic sS = SingletonStatic.getInstance();
		SingletonStatic sS1 = SingletonStatic.getInstance();
		System.out.println(sS == sS1);
	}
}
