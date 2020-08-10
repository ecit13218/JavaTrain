package com.zhengyao.test;

import com.zhengyao.factory.BeansFactory;
import com.zhengyao.service.TransferService;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        TransferService transferService = (TransferService) BeansFactory.getClass("transferService");
        transferService.transfer("111111","222222",100);
    }
    
}