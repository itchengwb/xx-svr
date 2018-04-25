package com.noriental.xxsvr.bean;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
* Copyright : adobocode.com , 2010 
* 
* @author Paul Sydney Orozco | xtrycatchx@gmail.com 
*/ 
public class Course implements Serializable {

    @NotBlank(message = "{course.course_subject.not.null}")
    private String course_subject; 
    private String course_stage; 
    private String course_grade; 
    private String course_school;
    private String course_status;
    private String course_modelname;

    public String getSubject() { 
        return course_subject; 
    }

    public void setSubject(String subject) { 
        this.course_subject = subject; 
    }

    public String getStage() { 
        return course_stage; 
    }

    public void setStage(String stage) { 
        this.course_stage = stage; 
    }

    public String getGrade() { 
        return course_grade; 
    }

    public void setGrade (String grade) { 
        this.course_grade = grade; 
    }

    public String getSchool() { 
        return course_school; 
    }

    public void setSchool(String school) { 
        this.course_school = school; 
    }
    
    public String getStatus() { 
        return course_status; 
    }

    public void setStatus(String status) { 
        this.course_status = status; 
    }
    
    public String getModelName() { 
        return course_modelname; 
    }

    public void setModelName(String modelName) { 
        this.course_modelname = modelName; 
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_subject='" + course_subject + '\'' +
                ", course_stage='" + course_stage + '\'' +
                ", course_grade='" + course_grade + '\'' +
                ", course_school='" + course_school + '\'' +
                ", course_status='" + course_status + '\'' +
                ", course_modelname='" + course_modelname + '\'' +
                '}';
    }
}