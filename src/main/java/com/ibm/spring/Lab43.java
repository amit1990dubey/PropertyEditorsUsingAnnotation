package com.ibm.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab43 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(IBMConfig.class);
        Student stu = (Student) ctx.getBean("student");
        System.out.println("Student BId: "  +stu.getSid().getBid());
        System.out.println("Student Id:" +stu.getSid().getSid());
        System.out.println("Student Name:" +stu.getSname());
        System.out.println("FEE:" +stu.getFee().getFeeBal());
        System.out.println("FEE Bal:" +stu.getFee().getFeeBal());
        System.out.println("Fee Paid:" +stu.getFee().getFeePaid());
        System.out.println("FEE Paid:" +stu.getFee().getTotalFee());
        System.out.println(" Email:" +stu.getEmails());
        System.out.println("Phones Number:" +stu.getPhones());
    }
}
