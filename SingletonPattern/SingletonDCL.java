package SingletonPattern;

public class SingletonDCL {
	private volatile static SingletonDCL singleton;
	private SingletonDCL() {}
	public static SingletonDCL getInstance() {
		if (singleton == null) {
			synchronized (SingletonDCL.class) {
				if (singleton == null) {
					singleton = new SingletonDCL();
				}
			}
		}
		return singleton;
	}
}
