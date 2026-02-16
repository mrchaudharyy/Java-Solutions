package com.javasolutions.lowleveldesign.creationalpatterns.builder.solution;

import java.util.ArrayList;
import java.util.List;

// Step 3: Concrete Builder for Engineering Students
public class EngineeringStudentBuilder extends StudentBuilder {

    // Engineering-specific methods
    @Override
    public StudentBuilder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("Operating Systems");
        enggSubjectsList.add("Computer Architecture");
        enggSubjectsList.add("Data Structures");
        enggSubjectsList.add("DBMS");
        this.subjects = enggSubjectsList;
        return this;
    }
}

