package com.senthink.test;

public class Test implements Runnable {
    private int num = 0; // 出票数
    private int count = 10; // 剩余票数

    @Override
    public void run() {

        while (true) {

            // 没有余票时，跳出循环
            if (count <= 0) {
                break;
            }
            num++;
            count--;

            try {
                Thread.sleep(500);// 模拟网络延时
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("显示出票信息：" + Thread.currentThread().getName()
                    + "抢到第" + num + "张票，剩余" + count + "张票");

        }
    }
}
