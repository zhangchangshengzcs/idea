package com.company;

import java.util.Arrays;

public class Array<E>{
    private E[] data;
    private int size;

    /**
     * 构造方法，传入数组的容量是capacity构造Array
     * @param capacity
     */
    public Array(int capacity){
        data=(E[]) new Object[capacity];
        size=0;
    }

    /**
     * 默认的构造方法，默认数组的容量capacity=10
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * 向所有元素后添加一个新元素
     * @param e
     */
    public void addLast(E e){
        /*if (size==data.length){
            throw new IllegalArgumentException("addLast is failed.Array is full");
        }
        data[size]=e;
        size++;*/
        add(size,e);//可以调用下面的方法
    }

    /**
     * 往第一个位置插入新元素
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 在第index个位置插入一个新元素e
     * @param index
     * @param e
     */
    public void add(int index,E e){
        if (size==data.length){
            throw new IllegalArgumentException("add is failed.Array is full");
        }
        if(index<0||index>size){
            throw new IllegalArgumentException("add is failed.index<0 or index>size");
        }
        for (int i = size-1; i >=index; i--) {
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    /**
     * 获取index索引位置的元素
     * @param index
     * @return
     */
    E get(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("index不正确");
        }
        return data[index];
    }

    /**
     * 获取最后一个元素
     * @return
     */
    public E getLast(){
        return get(size-1);
    }

    /**
     * 获取第一个元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 修改指定索引位置的元素为e
     * @param index
     * @param e
     */
    public void set(int index,E e){
        if (index<0||index>=size){
            throw new IllegalArgumentException("index不正确");
        }
        data[index]=e;
    }

    /**
     * 判断数组中是否含有指定元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        for (int i=0;i<data.length;i++){
            if (data[i].equals(e)){
                return true;
            }
        }
        return  false;
    }

    /**
     * 查找数组中e所在的索引，如果不存在则返回-1
     * @param e
     * @return
     */
    public int find(E e){
        for (int i=0;i<data.length;i++){
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 从数组中删除指定索引的元素，并返回删除的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("index不正确");
        }
        E res=data[index];
        for(int i=index+1;i<size;i++){
            data[i-1]=data[i];
        }
        size--;
        data[size]=null;
        return  res;
    }

    /**
     * 移除第一个元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 移除最后一个元素
     * @return
     */
    public  E removeLast(){
        return  remove(size-1);
    }

    /**
     * 从数组中删除元素e
     * @param e
     */
    public  void removeElement(E e){
        int index=find(e);
        if (index!=-1){
            remove(index);
        }
    }
}
