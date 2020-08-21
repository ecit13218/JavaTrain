package com.zhengyao.edu.factory;

import com.zhengyao.edu.utils.ConnectionUtils;

/**
 * @author zhengyao
 */
public class CreateBeanFactory {



    public static ConnectionUtils getInstanceStatic() {
        
        //业务逻辑创建对象
        return new ConnectionUtils();
    }


    public ConnectionUtils getInstance() {
        return new ConnectionUtils();
    }
}
