package com.designPattern.test;

import com.designPattern.pojo.SportClassService;
import com.designPattern.pojo.SportHigh;
import com.designPattern.pojo.SportShort;

/**
 * 桥接模式
 * Created by h on 2019/3/19.
 */
public class BridgeTest {
    public static void main(String[] args) {
        SportHigh sportHigh = new SportHigh();
        SportShort sportShort = new SportShort();
        SportClassService service = new SportClassService(100, sportShort);
        service.print();
    }
}
