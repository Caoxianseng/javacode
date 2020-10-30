package com.caowen.java1030;
public class Book {
    public String name;//书名
    public String isbn;//编号(10位)
	public float price;//价格
    public String page;//页码
    public String press;//出版社
    public String author;//作者

    public Book(String name,String author,String page,String press,String isbn,float price)throws BookException{
        setName(name);
        setAuthor(author);
        setPage(page);
        setPress(press);
        setIsbn(isbn);
        setPrice(price);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setIsbn(String isbn)throws BookException{
        if(isbn.length()!=10){
            throw new BookException("编号位数应为10位");
        }
        else{
            if(!numIsAllDigit(isbn)){
                throw new BookException("含有非法字符");
            }
            else{
                this.isbn=isbn;
            }
        }
    }
    public void setPress(String press){
        this.press=press;
    }
    public void setAuthor(String author){
        this.author=author;
    }
	 public void setPage(String page)throws BookException{
        if(!numIsAllDigit(page)){
            throw new BookException("页码必须为正整数");
        }
        else{
            this.page=page;
        }
    }
    public void setPrice(float price)throws BookException{
        if(price<0){
            throw new BookException("价格不可为负数");
        }
        else{
            this.price=price;
        }
    }
    private boolean numIsAllDigit(String str)
    {
        boolean result=true;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch<'0')||(ch>'9'))
            {
                result=false;
                break;
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getPress() {
        return press;
    }
    public String getAuthor() {
        return author;
    }
    public float getPrice() {
        return price;
    }
    public String getPage() {
        return page;
    }
}
class BookException extends Exception{
    public BookException(String message){
        super(message);
    }
}
