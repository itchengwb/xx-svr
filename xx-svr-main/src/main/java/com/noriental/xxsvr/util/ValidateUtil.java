package com.noriental.xxsvr.util;

import com.alibaba.dubbo.rpc.RpcException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by pengjun on 15/10/28.
 */
public class ValidateUtil {

    private static Validator validator; // 它是线程安全的

    static {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static <T> void validate(T t) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        if(constraintViolations.size() > 0) {
            String validateError = "";
            for(ConstraintViolation<T> constraintViolation: constraintViolations) {
                validateError += constraintViolation.getMessage() + ";";
            }
            throw new RpcException(validateError);
        }
    }

    public static <T> void validate(T t,Class typeClass) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t,typeClass);
        if(constraintViolations.size() > 0) {
            String validateError = "";
            for(ConstraintViolation<T> constraintViolation: constraintViolations) {
                validateError += constraintViolation.getMessage() + ";";
            }
            throw new RpcException(validateError);
        }
    }

}
