package com.company;

import java.beans.SimpleBeanInfo;
import java.util.Arrays;
import java.util.Optional;

public class MySimpleList<T> implements SimpleList<T>{
    private static final int SIZE = 128;
    private Object[] nums;
    private int count = 0;
    public MySimpleList() {
        nums = new Object[SIZE];
    }

    @Override
    public void add(T item) {
        System.out.println("add item = " + item + " count = " + count);
        nums[count] = item;
        count++;
    }

    @Override
    public void insert(int index, T item) throws Exception {
          for (int i =count; i > index; i=i-1) {
              nums[i] = nums[i-1];
          }
          nums[index] = item;
          count++;
    }

    @Override
    public void remove(int index) throws Exception {
        for (int i=index; i<count; i++) {
         nums[i] = nums [i+1];
        }
        count--;
    }

    @Override
    public Optional<T> get(int index) {
        if (index < count) {
            return Optional.ofNullable((T)nums[index]);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void addAll(SimpleList<T> list) {
        System.out.println("add list " + list);
        System.out.println("size = " + list.size());
        for (int i=0; i < list.size(); i++) {
            this.add(list.get(i).get());
        }
    }

    @Override
    public int first(T item) {
        for (int i=0; i < count; i++) {
            if (nums[i].equals(item)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int last(T item) {
        for (int i=count-1; i > 0; i--) {
            if (nums[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T item) {
        for (int i=0; i < count; i++) {
            if (nums[i] == item) {
                return true;
        }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        else
        {return false;}
    }

    @Override
    public String toString() {
        String ListInString= "My Simple List: [";
        for (int i=0; i < count; i++) {
            String delimeter = (i == count - 1) ? "" : ",";
            ListInString=ListInString+" "+nums[i]+ delimeter;
        }
        ListInString += "]|size = " + count;
       return ListInString;

//        for(int i =0;i<10;i=i+1){
//
//            if(i>3) {
//
//
//            }else{}
//
//        }
    }




}
