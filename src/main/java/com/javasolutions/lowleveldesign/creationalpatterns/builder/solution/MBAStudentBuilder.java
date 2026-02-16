package com.javasolutions.lowleveldesign.creationalpatterns.builder.solution;

import java.util.ArrayList;
import java.util.List;

// Step 4: Concrete Builder for MBA Students
public class MBAStudentBuilder extends StudentBuilder {

    // MBA-specific methods
    @Override
    public StudentBuilder setSubjects() {
        List<String> mbaSubjectsList = new ArrayList<>();
        mbaSubjectsList.add("Micro Economics");
        mbaSubjectsList.add("Business Studies");
        mbaSubjectsList.add("Operations Management");
        mbaSubjectsList.add("Financial Management");
        this.subjects = mbaSubjectsList;
        return this;
    }
}

