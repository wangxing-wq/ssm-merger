/**
 * @version 1.0
 * @author 王兴
 * @date 2022/3/15 21:25
 */
public class ThreadTest {

	public static void main(String[] args) {
		//现在有 T1、T2、T3 三个线程，你怎样保证 T2 在 T1 执行完后执行，T3 在 T2 执行完后执
		//行？
		//这个线程问题通常会在第一轮或电话面试阶段被问到，目的是检测你对”join”方法是否熟
		//悉。这个多线程问题比较简单，可以用 join 方法实现。
		Runnable target = () -> System.out.println(Thread.currentThread().getId() + "=========" + Thread.currentThread().getName());
		Thread t1 = new Thread(target,"t1" );
		Thread t2 = new Thread(target,"t2" );
		Thread t3 = new Thread(target,"t3" );
		try {
			t1.start();
			t2.join();
			t2.start();
			t3.join();
			t3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
