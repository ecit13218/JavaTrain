package com.zhengyao.edu.service;

/**
 * @author zhengyao
 */
public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}
