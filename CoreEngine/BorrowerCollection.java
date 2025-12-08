package CoreEngine;


import java.util.*;
/**
 * 이용자DB 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
<<<<<<< HEAD
 * @version (20251208)
=======
 * @version (2025.12.08)
>>>>>>> ac7ecfae1d2de02fe9d6a838f2ed5040967e6c09
 */
public class BorrowerCollection
{
    private ArrayList<Borrower> borrowerDB;
    
    public BorrowerCollection(){
        this.borrowerDB = new ArrayList<Borrower>();
    }
    
    public void registerToBorrowerDB(Borrower borrower){
        borrowerDB.add(borrower);
    }
    
    public boolean findBorrower(String borrowerUniqueNumber){
        // borrowerUniqueNumber 로 Borrower 객체가 있는지 검사하기
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            String uniNum = it.next().getBorrowerUniqueNumber();
            if(borrowerUniqueNumber.equals(uniNum)){
                return true;
            }
        }
        return false;
    }
    
    public boolean findBorrowerByName(String name) {
        for (Borrower borrower : borrowerDB) {
            if (borrower.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public int getBorrowerSize(){
        return borrowerDB.size();
    }
    
    public Borrower getOneBorrower(String borrowerUniqueNumber){
        // borrowerUniqueNumber를 이용해서 Borrower 객체 찾아 반환하기
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            Borrower br = it.next();
            if(borrowerUniqueNumber.equals(br.getBorrowerUniqueNumber())){
                return br;
            }
        }
        return null;
    }
    
    public Borrower getOneBorrwer(int index){
        return borrowerDB.get(index);
    }
    
    public ArrayList<Borrower> getUniqueNumber(String name) {
        ArrayList<Borrower> foundBorrowers = new ArrayList<>();
        for (Borrower borrower : borrowerDB) {
            if (borrower.getName().equals(name)) {
                foundBorrowers.add(borrower);
            }
        }
        return foundBorrowers;
    }
}
