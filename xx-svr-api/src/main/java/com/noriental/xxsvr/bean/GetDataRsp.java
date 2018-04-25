package com.noriental.xxsvr.bean;

import com.noriental.validate.bean.CommonDes;

import javax.validation.Valid;

/**
 * Created by pengjun on 15/10/27.
 */
public class GetDataRsp extends CommonDes {

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Valid
    private Course course;


    @Override
    public String toString() {
        return "GetDataRsp{" +
                "course=" + course +
                '}';
    }
}
