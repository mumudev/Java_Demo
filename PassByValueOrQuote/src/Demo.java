
public class Demo {
	public static void main(String[] args) {
		int i = 1;
		ObjectDemo objectDemo = new ObjectDemo();
		System.out.println("原来I的值为"+i);
		System.out.println("原来ObjectDemo中I的值为"+objectDemo.getI());
		test(i,objectDemo);
		System.out.println("现在I的值为"+i);
		System.out.println("在方法里对变量I进行修改，看是否有改变，改变则说明方法对基础变量是引用传递");
		System.out.println("现在ObjectDemo中I的值为"+objectDemo.getI());
		System.out.println("在方法里对对象内的变量进行修改，看是否有改变，改变则说明方法对对象是引用传递");
		
	}
	
	public static void test(int i,ObjectDemo o) {
//		在方法里对变量I进行修改，看是否有改变，改变则说明方法对基础变量是引用传递
		i = 2;
//		在方法里对对象内的变量进行修改，看是否有改变，改变则说明方法对对象是引用传递
		o.setI(3);
	}
}
