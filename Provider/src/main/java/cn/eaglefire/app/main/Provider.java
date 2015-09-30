package cn.eaglefire.app.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务者
 * 用于加载服务者Spring配置到ZooKeeper注册中心
 *
 * Created by eagle on 15/9/30.
 */
public class Provider {

    /**
     * 主方法
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //
        System.out.println("Begin to load");
        // 加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/ApplicationContext.xml"});
        context.start();
        //
        System.out.println("End to load");
        // 为保证服务一直开着，利用输入流的阻塞来模拟
        System.in.read();
    }
}
