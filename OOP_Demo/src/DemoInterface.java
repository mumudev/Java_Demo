
public class DemoInterface implements BasicInterface{

	@Override
	public void TestA() {
		System.out.println("实现接口时，TestA方法的实现");
	}

	@Override
	public void TestB() {
		TestC();
		System.out.println("实现接口时，TestB方法的实现");
	}
	
	private void TestC() {
		System.out.println("在TestC中调用方法,方法属于private");
	}
}
