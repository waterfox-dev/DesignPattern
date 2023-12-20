package com.waterfox.designpattern.visitor;

public class XMLVisitor implements Visitor
{
    @Override
    public void visitDot(Dot d)
    {
        System.out.println("Exporting the dot to xml...");
    }

    @Override
    public void visitRound(Round r)
    {
        System.out.println("Exporting the round to xml...");
    }
}
