
public class DemoInterface implements BasicInterface{

	@Override
	public void TestA() {
		System.out.println("ʵ�ֽӿ�ʱ��TestA������ʵ��");
	}

	@Override
	public void TestB() {
		TestC();
		System.out.println("ʵ�ֽӿ�ʱ��TestB������ʵ��");
	}
	
	private void TestC() {
		System.out.println("��TestC�е��÷���,��������private");
	}
}