/**
 * �̳���ʹ�õļ򵥳���
 * @author ycl
 *
 */
public class BasicExtends {
	
	protected String string = "�̳����еı���protected������Ա����ʺ��޸�";
	public BasicExtends(){
		//�����ǳ�ʼ��
		System.out.println("���Ǽ̳�ʱ������Ĺ���");
		
	}
	
	protected void testD() {
		System.out.println("���Ǽ̳�ʱ�����õĻ����б������ķ���TestD()");
	}
	public void testA(){
		System.out.println("���Ǽ̳�ʱ�����෽����չʾTestA()");
	}
	
	public void testB() {
		System.out.println("���Ǽ̳�ʱ�����෽����չʾTestB()");
	}
}