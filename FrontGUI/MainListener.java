package FrontGUI;


import CoreEngine.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * MyListener 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (2025.12.04)
 */
public class MainListener implements ActionListener
{
    LibraryApplication la;
    JTextArea logTA;
    WestPanel wpanel;
    EastPanel epanel;
    
    public MainListener(JTextArea logTA, LibraryApplication la){
        this.logTA = logTA;
        this.la = la;
    }
    
    public MainListener(JTextArea logTA, WestPanel wpanel, LibraryApplication la){
        this.logTA = logTA;
        this.wpanel = wpanel;
        this.la = la;
    }
    
    public MainListener(JTextArea logTA, EastPanel epanel, LibraryApplication la){
        this.logTA = logTA;
        this.epanel = epanel;
        this.la = la;
    }
    
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton)e.getSource();
        
        if(button.getText().equals("대출 가능한 책 Display")){
            String str = la.displayBooksForLoan();
            logTA.append(str + "\n");
        }else if(button.getText().equals("대출 중인 책 Display")){
            String str = la.displayBooksOnLoan();
            logTA.append(str + "\n");
        }else if(button.getText().equals("이용자 등록하기")){
            String name = wpanel.borrowerNameTF.getText();
            String uniqueNumber = wpanel.borrowerUniqueNumberTF.getText();
            String email = wpanel.borrowerEmailTF.getText();
            String str = la.registerBorrower(name, uniqueNumber, email);
            logTA.append(str + "\n");
            wpanel.borrowerNameTF.setText("");
            wpanel.borrowerEmailTF.setText("");
            wpanel.borrowerUniqueNumberTF.setText("");
        }else if(button.getText().equals("책 등록하기")){
            String title = wpanel.bookTitleTF.getText();
            String author = wpanel.bookAuthorTF.getText();
            String unique = wpanel.bookUniqueNumberTF.getText();
            String str = la.registerOneBook(title, author, unique);
            logTA.append(str + "\n");
            wpanel.bookTitleTF.setText("");
            wpanel.bookAuthorTF.setText("");
            wpanel.bookUniqueNumberTF.setText("");
        }else if(button.getText().equals("실행하기")){
            if(epanel.radioState == 1){
                String bookUniqueNumber = epanel.loanBookTF.getText();
                String borrowerUniqueNumber = epanel.loanBorrowerTF.getText();
                String str = la.loanOneBook(bookUniqueNumber, borrowerUniqueNumber);
                logTA.append(str + "\n");
                epanel.loanBookTF.setText("");
                epanel.loanBorrowerTF.setText("");
            }else if(epanel.radioState == 2){
                String bookUniqueNumber = epanel.returnBookTF.getText();
                String str = la.returnOneBook(bookUniqueNumber);
                logTA.append(str + "\n");
                epanel.returnBookTF.setText("");
            }
        }else if(button.getText().equals("데이터 불러오기")){
            String str = la.startupFileRead();
            logTA.append(str + "\n");
        }else if(button.getText().equals("데이터 저장하기")){
            String str = la.saveFileWrite();
            logTA.append(str + "\n");
        }else if(button.getText().equals("고유번호 찾기")){
            String name = epanel.getUniqueNumberTF.getText();
            String str = la.getUniqueNumber(name);
            logTA.append(str + "\n");
        }
    }
}