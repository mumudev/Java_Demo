/**
 * 继承类使用的简单呈现
 * @author ycl
 *
 */
public class BasicExtends {
	
	protected String string = "继承类中的变量protected定义可以被访问和修改";
	public BasicExtends(){
		//这里是初始化
		System.out.println("这是继承时，基类的构建");
		
	}
	
	protected void testD() {
		System.out.println("这是继承时，调用的基类中被保护的方法TestD()");
	}
	public void testA(){
		System.out.println("这是继承时，基类方法的展示TestA()");
	}
	
	public void testB() {
		System.out.println("这是继承时，基类方法的展示TestB()");
	}
}