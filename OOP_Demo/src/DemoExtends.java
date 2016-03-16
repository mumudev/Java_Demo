/**
 * 这是继承的代码的实现
 * @author ycl
 *
 */
public class DemoExtends extends BasicExtends {
	public DemoExtends() {
		super();
		System.out.println("这是继承后，DemoExtends的构建");
	}
	
	public void TestC() {
		System.out.println("这是继承后，TestC的实现");
	}
	
	public void TestB() {
		System.out.println("这是继承后，TestB被覆盖后的实现");
	}
	
}
