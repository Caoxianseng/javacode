package com.caowen.java1030;
public class Book {
    public String name;//����
    public String isbn;//���(10λ)
	public float price;//�۸�
    public String page;//ҳ��
    public String press;//������
    public String author;//����

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
            throw new BookException("���λ��ӦΪ10λ");
        }
        else{
            if(!numIsAllDigit(isbn)){
                throw new BookException("���зǷ��ַ�");
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
            throw new BookException("ҳ�����Ϊ������");
        }
        else{
            this.page=page;
        }
    }
    public void setPrice(float price)throws BookException{
        if(price<0){
            throw new BookException("�۸񲻿�Ϊ����");
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
