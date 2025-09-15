package com.test.demo;

import java.util.Timer;
import java.util.TimerTask;

public class OrderStatusMonitor {

    private final String orderId;
    private final Timer timer;

    public OrderStatusMonitor(String orderId) {
        this.orderId = orderId;
        this.timer = new Timer(); // 每个实例创建一个 Timer

        System.out.println("【启动监控】订单 " + orderId + " 的状态轮询任务");

        // 每隔 2 秒检查一次支付状态（模拟）
        this.timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("轮询中... 订单 ID: " + orderId + " - 当前状态: 等待支付");
                // 实际中可能调用支付网关查询接口
            }
        }, 0, 2000);
    }

    public String getOrderId() {
        return orderId;
    }

}
