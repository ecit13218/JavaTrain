package com.zhengyao.dao;

import com.zhengyao.pojo.Account;

public interface AccountDao {
    Account queryAccountByCardNo(String cardNo) throws Exception;
    int updateAccountByCardNo(Account account) throws Exception;
}