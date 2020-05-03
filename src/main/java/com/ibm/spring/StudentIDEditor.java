package com.ibm.spring;

import java.beans.PropertyEditorSupport;

public class StudentIDEditor extends PropertyEditorSupport {

    public void setAsText(String txt)
    {
        String p1 = txt.substring(0,3);
        String p2= txt.substring(4);

        StudentID sid = new StudentID(p1, Integer.parseInt(p2));
        this.setValue(sid);
    }
}
