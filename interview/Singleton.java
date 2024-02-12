package interview;

public class Singleton {
//	private Singleton() {
//		
//	}
//	static Singleton single=null;
//	public static Singleton create() {
//		if(single==null) {
//			single=new Singleton();
//			return single;
//		}
//		return single;
//	}
	
	public static void main(String[] args) {
		Singleton create = new Singleton();
		System.out.println(create);
		Singleton create2 = new Singleton();
		System.out.println(create2);
	}

}
