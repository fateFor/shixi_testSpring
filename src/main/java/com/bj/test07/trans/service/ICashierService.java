package com.bj.test07.trans.service;

import com.bj.test07.trans.exception.AccountException;
import com.bj.test07.trans.exception.BookStockException;

import java.util.List;

public interface ICashierService {

    //客户的结账
    public void cash(String username, List<Integer> bookIds) throws AccountException, BookStockException;
}