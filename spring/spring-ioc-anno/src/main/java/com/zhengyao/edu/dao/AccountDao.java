package com.zhengyao.edu.dao;

import com.zhengyao.edu.pojo.Account;

/**
 * @author zhengyao
 */
public interface AccountDao {

    Account queryAccountByCardNo(String cardNo) throws Exception;

    int updateAccountByCardNo(Account account) throws Exception;
}
