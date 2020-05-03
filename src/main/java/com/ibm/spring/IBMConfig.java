package com.ibm.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import java.util.ArrayList;
import java.util.List;

public class IBMConfig {

    @Bean

    public Student student()
    {
        Student st = new Student();
        st.setSname("Amit");
        st.setPhone(93456789);
        return  st;
    }

    @Bean(name="sid")

    public String studentId()
    {
        return "B99-101";
    }

    @Bean

    public String fee()
    {
        return "10000,40000,60000";
    }

    public String emails()
    {
        return "aa@ibm.com,bb@ibm.com,cc@ibm.com,dd@ibm.com";
    }

    @Bean
    public List<Long> phones()
    {
        List<Long> phones = new ArrayList<Long>();
        phones.add(1111L);
        phones.add(2222L);
        phones.add(33333L);
        return phones;
    }

    //Annotation Type InitBinder
    //Annotation that identifies methods which initialize the WebDataBinder which will be used for populating command and
    // form object arguments of annotated handler methods. ... Init-binder methods must not have a return value; they are
    // usually declared as void .


    @InitBinder

    public void initBinderAll(WebDataBinder binder)
    {
       binder.registerCustomEditor(List.class, new ListEditor());
       binder.registerCustomEditor(Fee.class, new FeeEditor());
       binder.registerCustomEditor(StudentID.class,new StudentIDEditor());

    }
}
