
public class Demo {
	public static void main(String[] args) {
		int i = 1;
		ObjectDemo objectDemo = new ObjectDemo();
		System.out.println("ԭ��I��ֵΪ"+i);
		System.out.println("ԭ��ObjectDemo��I��ֵΪ"+objectDemo.getI());
		test(i,objectDemo);
		System.out.println("����I��ֵΪ"+i);
		System.out.println("�ڷ�����Ա���I�����޸ģ����Ƿ��иı䣬�ı���˵�������Ի������������ô���");
		System.out.println("����ObjectDemo��I��ֵΪ"+objectDemo.getI());
		System.out.println("�ڷ�����Զ����ڵı��������޸ģ����Ƿ��иı䣬�ı���˵�������Զ��������ô���");
		
	}
	
	public static void test(int i,ObjectDemo o) {
//		�ڷ�����Ա���I�����޸ģ����Ƿ��иı䣬�ı���˵�������Ի������������ô���
		i = 2;
//		�ڷ�����Զ����ڵı��������޸ģ����Ƿ��иı䣬�ı���˵�������Զ��������ô���
		o.setI(3);
	}
}
