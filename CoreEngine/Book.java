package CoreEngine;



/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
<<<<<<< HEAD
 * @version (20251208)
=======
 * @version (2025.12.08)
>>>>>>> ac7ecfae1d2de02fe9d6a838f2ed5040967e6c09
 */
public class Book
{
    private String title;
    private String author;
    private String bookuniqueNumber;
    
    
    public Book(String title, String author, String bookuniqueNumber){
        this.title = title;
        this.author = author;
        this.bookuniqueNumber = bookuniqueNumber;
    }
    
    public String gettitle(){
        // title 리턴하기
        return title;
    }
    
    public String getauthor(){
        // author 리턴하기
        return author;
    }
    
    public String getbookUniqueNumber(){
        // bookuniqueNumber 리턴하기
        return bookuniqueNumber;
    }
    
    public String displayBook(){
        return "책 이름 : " + title + "\n저자 : " + author + "\n책 고유번호 : " + bookuniqueNumber + "\n";
    }
}