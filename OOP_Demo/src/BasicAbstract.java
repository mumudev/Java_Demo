/**
 * 抽象方法可以实现部分方法，可以容纳抽象方法
 * 但是不能直接被实例化，只能被继承后实现抽象方法才能实例化
 * 接口是一种特殊的抽象类(完全只有抽象方法的抽象类)
 * @author ycl
 *
 */
public abstract class BasicAbstract {
	public void testA() {
		System.out.println("这个方法在抽象类中实现");
	}
	 
	public abstract void testB();
	
//	public void testC();
//	上面这个方法是接口类中方法的书写，在抽象类中唯一的区别是要加个abstract
}
