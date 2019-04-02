package com.company;

/**
 * 链表
 *
 * @param <E>
 */
public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 获取链表中的元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
     * 往链表任意位置添加新的元素
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed.Illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
//            Node node=new Node(e);
//            node.next=prev.next;
//            prev.next=node;
        prev.next = new Node(e, prev.next);
        size++;

    }

    /**
     * 在链表头添加新的元素e
     *
     * @param e
     */
    public void addFirst(E e) {
//        Node node=new Node(e);
//        node.next=head;
//        head=node;
        add(0, e);
    }

    /**
     * 往链表末尾添加新的元素
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 获取链表中第index个位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if(index<0||index>size){
            throw new IllegalArgumentException("index越界");
        }
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.e;

    }

    /**
     * 获取第一个位置的的元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取最后一个位置的元素
     * @return
     */
    public E getLast(){
        return get(size-1);
    }

    /**
     * 修改链表中的第index个位置的元素为e
     * @param index
     * @param e
     */
    public void set(int index,E e){
        if(index<0||index>size){
            throw new IllegalArgumentException("index越界");
        }
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.e=e;
    }

    /**
     * 判断链表中是否含有元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node cur=dummyHead.next;
        while(cur!=null){
            if(cur.e.equals(e)){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        for(Node cur=dummyHead.next;cur!=null;cur=cur.next){
            res.append(cur+"->");
        }
        res.append("null");
        return res.toString();
    }

    /**
     * 删除指定位置的节点
     * @param index
     * @return
     */
    public E remove(int index){
        if(index<0||index>size){
            throw new IllegalArgumentException("index越界");
        }
        Node prev=dummyHead;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        Node retNode=prev.next;
        prev.next=retNode.next;
        retNode.next=null;
        size--;
        return retNode.e;
    }

    /**
     * 删除第一个节点
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个节点
     * @return
     */
    public E removeLast(){
       return remove(size-1);
    }
}
