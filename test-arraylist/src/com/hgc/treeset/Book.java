package com.hgc.treeset;

/**
 * @author: zcs
 * @create: 2019/3/11 11:54
 **/
public class Book implements Comparable<Book>{
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Book() {
        super();
    }

    @Override
    public int compareTo(Book o) {
        if (this.equals(o)){
            return 0;
        }else{
            if (this.getId()>o.getId()){
                return -1;//从大到小
            }
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (price != book.price) return false;
        return name != null ? name.equals(book.name) : book.name == null;
    }
}
