package com.test.demo;

public class OrderService {

    private int orderCounter = 1;

    /**
     * 用户下单操作，每单创建一个监控器
     */
    public void createNewOrder() {
        String orderId = "ORD-" + String.format("%06d", orderCounter++);
        System.out.println("创建订单" + orderId);
        new OrderStatusMonitor(orderId);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * 批量创建多个订单
     */
    public void batchCreateOrders(int count) {
        System.out.println("开始批量创建 " + count + " 个订单...");
        for (int i = 0; i < count; i++) {
            createNewOrder();
        }
        System.out.println("批量创建完成。");
    }
}
