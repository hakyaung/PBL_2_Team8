package CoreEngine;



/**
 * 이용자 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
public class Borrower
{
    private String name;
    private String borrowerUniqueNumber;
    private String email;
    private int loanCount;
    
    public Borrower(String name, String borrowerUniqueNumber, String email){
        this.name = name;
        this.borrowerUniqueNumber = borrowerUniqueNumber;
        this.email = email;
        this.loanCount = 0;
    }
    
    public Borrower(String name, String borrowerUniqueNumber, String email, int loanCount){
        this.name = name;
        this.borrowerUniqueNumber = borrowerUniqueNumber;
        this.email = email;
        this.loanCount = loanCount;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBorrowerUniqueNumber(){
        return borrowerUniqueNumber;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getLoanCount(){
        return loanCount;
    }
    
    public void increaseLoanCount(){
        this.loanCount++;
        System.out.println("남은 대출 권수 : " + this.loanCount);
    }
    
    public void decreaseLoanCount(){
        if(this.loanCount > 0){
            this.loanCount--;
        }
        System.out.println("남은 대출 권수 : " + this.loanCount);
    }
    
    public String displayBorrower(){
        return "이용자 이름 : " + name + "\n이용자 고유번호 : " + borrowerUniqueNumber + "\n이메일 주소 : " + email + "\n";
    }
}