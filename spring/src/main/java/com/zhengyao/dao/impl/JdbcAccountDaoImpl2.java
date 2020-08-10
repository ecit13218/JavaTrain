package com.zhengyao.dao.impl;

import com.zhengyao.dao.AccountDao;
import com.zhengyao.pojo.Account;
import com.zhengyao.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcAccountDaoImpl2 implements AccountDao {
    @Override
    public Account queryAccountByCardNo(String cardNo) throws Exception {
        System.out.println("进入JdbcAccountDaoImpl2#queryAccountByCardNo");
        return null;
    }
    
    @Override
    public int updateAccountByCardNo(Account account) throws Exception {
        System.out.println("进入JdbcAccountDaoImpl2#account");
        return 0;
    }
}