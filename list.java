package sample.setManipulation;

public class list {
    private class node{
        private Object obj;
        private node next;

        node(Object object, node nextNode)
        {
            this.obj = object;
            this.next = nextNode;
        }

        public Object getVal() {
            return obj;
        }

        public node getNext() {
            return next;
        }

        public void setNext(node next) {
            this.next = next;
        }

        public void setVal(Object obj) {
            this.obj = obj;
        }
    }
    private node start;
    private int size;

    list()
    {
        start = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(Object obj)
    {
        node v  = new node(obj, start);
        start = v;
        size++;
        return;
    }

    public Object remove(Object obj)
    {
        node v = start;
        if (size == 0)
        {
            return null;
        }
        if (v.getVal().equals(obj))
        {
            Object ans = v.getVal();
            start = v.getNext();
            size--;
            return ans;
        }
        while (v.getNext() != null)
        {
            if (v.getNext().getVal().equals(obj))
            {
                Object ans =  v.getNext().getVal();
                v.setNext(v.getNext().getNext());
                size++;
                return ans;
            }
            v = v.getNext();
        }
        return null;
    }
    public boolean contains(Object obj)
    {
        node v = start;

        while (v != null)
        {
            if (v.getVal().equals(obj)) {
                return true;
            }
            v = v.getNext();
        }
    return false;
    }

    public Object get(int index)
    {
        if (size <= index)
        {
            return null;
        }
        else
        {
            node v = start;
            for (int i = 0; i < index; i++)
            {
                v = v.getNext();
            }
            return v.getVal();
        }
    }

}

