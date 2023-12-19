package com.waterfox.designpattern.iterator;

import java.util.Iterator;

public class Database
{
    private Donor[] donors;

    public class DonorIterator implements Iterator<Donor>
    {
        private int position = 0;

        @Override
        public boolean hasNext()
        {
            return this.position < donors.length;
        }

        @Override
        public Donor next()
        {
            return donors[this.position++];
        }

        public DonorIterator()
        {
            this.position = 0;
        }
    }

    public DonorIterator iterator()
    {
        return new DonorIterator();
    }

    public void display()
    {
        for(DonorIterator i = iterator(); i.hasNext(); )
        {
            System.out.println(i.next().toString());
        }
    }
}
