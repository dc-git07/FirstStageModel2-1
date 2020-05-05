package com.lagou.edu.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author 代春欢
 */

public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}
