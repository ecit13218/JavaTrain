package com.zhengyao.service.impl;

import com.zhengyao.dao.AccountDao;
import com.zhengyao.dao.impl.JdbcAccountDaoImpl;
import com.zhengyao.dao.impl.JdbcAccountDaoImpl2;
import com.zhengyao.pojo.Account;
import com.zhengyao.service.TransferService;

public class TransferServiceImpl implements TransferService {

    private AccountDao accountDao;
    
    @Override
    public void transfer(String fromCardNo, String toCardNo, int money) throws Exception {
            Account from = accountDao.queryAccountByCardNo(fromCardNo);
            Account to = accountDao.queryAccountByCardNo(toCardNo);
            from.setMoney(from.getMoney()-money);
            to.setMoney(to.getMoney()+money);
            accountDao.updateAccountByCardNo(to);
            accountDao.updateAccountByCardNo(from);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
