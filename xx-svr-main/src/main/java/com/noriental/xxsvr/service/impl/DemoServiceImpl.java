package com.noriental.xxsvr.service.impl;


import com.noriental.validate.exception.BizLayerException;
import com.noriental.xxsvr.bean.Course;
import com.noriental.xxsvr.bean.GetDataRequest;
import com.noriental.xxsvr.bean.GetDataRsp;
import com.noriental.xxsvr.error.ExErrorCode;
import com.noriental.xxsvr.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by pengjun on 15/10/23.
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public GetDataRsp getServiceData(GetDataRequest request) {

        GetDataRsp rsp = new GetDataRsp();
        try {
            if (request.getiFlag() == 1) {
                //return GetDataRsp.newFailure(-1,"非法参数");
                //GetDataRsp rsp = new GetDataRsp();
//                rsp.setError("非法参数");
//                rsp.setCode(-1);
//                return rsp;
           //      int i = 5/0;
           //     throw new BizLayerException("parameter:flag", ErrorCode.PACAKAGE_INPUT_PARAM_ERROR);
                throw new BizLayerException("字段flag", ExErrorCode.errorCodeFor(3001));
           //     setName();
                //对web的前缀，后缀都为空
                 //对dubbo的加上服务名和具体参数名
            } else {
               // GetDataRsp rsp = new GetDataRsp();
                Course course = new Course();
                course.setSchool("aaa");
                course.setGrade(request.getName());
                course.setModelName("ccc");
                course.setStatus("0");
            //    course.setSubject("ccccc");
                rsp.setCourse(course);
//                return rsp;
            }
        }catch (RuntimeException e) {
            //rsp.setError(ExceptionDes.getBaseResponse(e));
            logger.error(request.toString(),e);
         //   e.printStackTrace(System.out);
        }
        return rsp;
    }

    private void setName() {
        int i = 5/0;
    }


//    @Override
//    public Result getServiceNewData(GetDataRequest request) {
//        if(request.getiFlag() == 1) {
//            return Result.newFailure(-1,"非法参数");
//        }else{
//            GetNewDataRsp rsp = new GetNewDataRsp();
//            Course course = new Course();
//            course.setSchool("aaa");
//            course.setGrade(request.getName());
//            course.setModelName("ccc");
//            course.setStatus("0");
//            course.setSubject("ccccc");
//            rsp.setCourse(course);
//            return Result.newSuccess(rsp);
//        }
//    }
}