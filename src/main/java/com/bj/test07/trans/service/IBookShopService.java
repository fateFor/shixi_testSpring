package com.bj.test07.trans.service;

import com.bj.test07.trans.exception.AccountException;
import com.bj.test07.trans.exception.BookStockException;

public interface IBookShopService {

    //通过账户名及书号购买书
    public void purchase(String username, int bookId) throws BookStockException, AccountException;
}
