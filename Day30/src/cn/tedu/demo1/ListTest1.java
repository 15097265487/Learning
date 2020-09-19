package cn.tedu.demo1;


/**
 * 
 * 一、List框架
 * |--Collection接口
 * 		|--List接口：有序 可重复
 * 			|--ArrayList 作为List接口的主要实现类。线程不安全，效率高，低层也是Object的数组
 * 			|--LinkedList 对于频繁的插入删除的操作使用这个类的效率比ArrayList更高，低层使用的是双向链表。
 * 			|--Vector 作为List接口的古老实现类，线程安全，效率低，低层也是Object[]
 *二、三者的源码分析
 *	1.ArrayList
 *		jdk7:
 *			ArrayList list = new ArrayList()//低层创建了长度为10的Object[]数组elementDate
 *			list.add(1);//elementDate[0] = new Integer(1);
 *			list.add(11);如果此次添加时 elementDate数组的容量默认情况下，扩容为原来的1.5倍，同时需要将原来
 *						   的数组复制到新数组中（即将扩容后的数组再次赋值给elementDate数组）
 *			建议：new ArrayList(int capacity)
 *		jdk8:
 *			ArrayList list = new ArrayList()//低层创建了长度为10的Object[] elementDate,初始化为一个空数组{}，并没有指定长度为10，
 *			list.add(1)//第一次调用，低层创建了长度为1的Object[]并将数据添加到elementDate[0]，后续和jdk1.7处理一样
 *		小结：
 *			jdk7中类似于单例模式饿汉式
 *			jdk8中类似于单例模式懒汉式，延迟了数组的创建，节省了内存空间
 *			
 *	2.Vector 
 *		jdk7与jdk8中通过Vector()创建对象时，低层创建了长度为10的数组
 *		扩容:默认扩容为原来数组的2倍
 *	3.LinkedList
 *		LinkedList list = new LinkedList()
 *			声明两个Node类型的属性first、last，默认null
 *		list.add(obj);
 *			把obj封装到Node中，创建Node对象，
 *			Node类的定义：（体现了LinkedList双向链表的说法）
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
 *面试题：ArrayList、LinkedList、Vector三个的区别是啥？
 *	同：三个类都是实现了List接口，存储数据的特点相同，有序可重复
 */

public class ListTest1 {
	
}
