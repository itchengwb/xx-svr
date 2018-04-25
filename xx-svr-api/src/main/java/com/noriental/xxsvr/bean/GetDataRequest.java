package com.noriental.xxsvr.bean;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by pengjun on 15/10/27.
 */
public class GetDataRequest implements Serializable {

    private int iFlag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiFlag() {
        return iFlag;
    }

    public void setiFlag(int iFlag) {
        this.iFlag = iFlag;
    }

    @NotNull// 不允许为空
    private String name;

    @Override
    public String toString() {
        return "GetDataRequest{" +
                "iFlag=" + iFlag +
                ", name='" + name + '\'' +
                '}';
    }
}
