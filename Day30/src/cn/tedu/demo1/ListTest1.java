package cn.tedu.demo1;


/**
 * 
 * һ��List���
 * |--Collection�ӿ�
 * 		|--List�ӿڣ����� ���ظ�
 * 			|--ArrayList ��ΪList�ӿڵ���Ҫʵ���ࡣ�̲߳���ȫ��Ч�ʸߣ��Ͳ�Ҳ��Object������
 * 			|--LinkedList ����Ƶ���Ĳ���ɾ���Ĳ���ʹ��������Ч�ʱ�ArrayList���ߣ��Ͳ�ʹ�õ���˫������
 * 			|--Vector ��ΪList�ӿڵĹ���ʵ���࣬�̰߳�ȫ��Ч�ʵͣ��Ͳ�Ҳ��Object[]
 *�������ߵ�Դ�����
 *	1.ArrayList
 *		jdk7:
 *			ArrayList list = new ArrayList()//�Ͳ㴴���˳���Ϊ10��Object[]����elementDate
 *			list.add(1);//elementDate[0] = new Integer(1);
 *			list.add(11);����˴����ʱ elementDate���������Ĭ������£�����Ϊԭ����1.5����ͬʱ��Ҫ��ԭ��
 *						   �����鸴�Ƶ��������У��������ݺ�������ٴθ�ֵ��elementDate���飩
 *			���飺new ArrayList(int capacity)
 *		jdk8:
 *			ArrayList list = new ArrayList()//�Ͳ㴴���˳���Ϊ10��Object[] elementDate,��ʼ��Ϊһ��������{}����û��ָ������Ϊ10��
 *			list.add(1)//��һ�ε��ã��Ͳ㴴���˳���Ϊ1��Object[]����������ӵ�elementDate[0]��������jdk1.7����һ��
 *		С�᣺
 *			jdk7�������ڵ���ģʽ����ʽ
 *			jdk8�������ڵ���ģʽ����ʽ���ӳ�������Ĵ�������ʡ���ڴ�ռ�
 *			
 *	2.Vector 
 *		jdk7��jdk8��ͨ��Vector()��������ʱ���Ͳ㴴���˳���Ϊ10������
 *		����:Ĭ������Ϊԭ�������2��
 *	3.LinkedList
 *		LinkedList list = new LinkedList()
 *			��������Node���͵�����first��last��Ĭ��null
 *		list.add(obj);
 *			��obj��װ��Node�У�����Node����
 *			Node��Ķ��壺��������LinkedList˫�������˵����
 *    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
 *�����⣺ArrayList��LinkedList��Vector������������ɶ��
 *	ͬ�������඼��ʵ����List�ӿڣ��洢���ݵ��ص���ͬ��������ظ�
 */

public class ListTest1 {
	
}
