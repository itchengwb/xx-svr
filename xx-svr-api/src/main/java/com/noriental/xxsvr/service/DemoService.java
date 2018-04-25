package com.noriental.xxsvr.service;


import com.noriental.xxsvr.bean.GetDataRequest;
import com.noriental.xxsvr.bean.GetDataRsp;

/**
 * Created by pengjun on 15/10/23.
 */
public interface DemoService {

    String sayHello(String name);
    GetDataRsp getServiceData(GetDataRequest request);
}
