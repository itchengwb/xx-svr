package com.noriental.xxsvr.error;


import com.noriental.validate.error.BasicErrorCode;
import com.noriental.validate.error.ErrorCode;

/**
 * Created by pengjun on 15/11/4.
 */
public enum ExErrorCode implements ErrorCode {

    NEWPACAKGE_ID_INVALIDATE(3000,"new礼包ID不合法"),
    NEWPACAKAGE_INPUT_PARAM_TRIM(3001, "new输入参数不能为空"),
    NEWPACAKAGE_INPUT_PARAM_MAX(3002, "输入参数长度过长");


    private static  boolean bError = false;

    private final int value;
    private final String comment;

    private ExErrorCode(int value, String comment) {
        this.value = value;
        this.comment = comment;
    }



    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getComment() {
        return this.comment;

    }

    public static ErrorCode[] Codes() {
        return values();
    }

    private static void addErrors() {
        BasicErrorCode.addNewErrorCodes(Codes());
    }

    public static ErrorCode errorCodeFor(int value) {
        if(!bError)
            addErrors();
        return BasicErrorCode.errorCodeFor(value);
    }

}
