package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements;

import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.IRoomVisitor;

// Element interface - represents rooms(elements) that can be visited
public interface IRoom {
    void accept(IRoomVisitor visitor);

}
