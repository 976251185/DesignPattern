package SingletonPattern;

public class SingletonStatic {
	private static class SingletonHolder{
		private static final SingletonStatic instance = new SingletonStatic();
	}
	private SingletonStatic() {}
	public static SingletonStatic getInstance() {
		return SingletonHolder.instance;
	}
}
