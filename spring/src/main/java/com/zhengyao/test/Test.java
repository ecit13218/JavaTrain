package com.zhengyao.test;

import com.zhengyao.service.TransferService;
import com.zhengyao.service.impl.TransferServiceImpl;

public class Test {
    public static void main(String[] args) throws Exception {
        TransferService transferService = new TransferServiceImpl();
        transferService.transfer("111111","222222",100);
    }  
}