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
    LibraryApplication la = new LibraryApplication("도서관 관리 시스템");
    JTextArea logTA;
    WestPanel wpanel;
    CenterPanel cpanel;
    
    public MainListener(JTextArea logTA){
        this.logTA = logTA;
    }
    
    public MainListener(JTextArea logTA, WestPanel wpanel){
        this.logTA = logTA;
        this.wpanel = wpanel;
    }
    
    public MainListener(JTextArea logTA, CenterPanel cpanel){
        this.logTA = logTA;
        this.cpanel = cpanel;
    }
    
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton)e.getSource();
        
        if(button.getText().equals("대출 가능한 책 Display")){
            String str = la.displayBookForLoan();
            logTA.append(str + "\n");
        }else if(button.getText().equals("대출 중인 책 Display")){
            String str = la.displayBookOnLoan();
            logTA.append(str + "\n");
        }else if(button.getText().equals("이용자 등록하기")){
            String name = wpanel.borrowerNameTF.getText();
            String str = la.registerOneBorrower(name);
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
            if(cpanel.radioState == 1){
                String bookUniqueNumber = cpanel.loanBookTF.getText();
                String borrowerName = cpanel.loanBorrowerTF.getText();
                String str = la.loanOneBook(bookUniqueNumber, borrowerName);
                logTA.append(str + "\n");
                cpanel.loanBookTF.setText("");
                cpanel.loanBorrowerTF.setText("");
            }else if(cpanel.radioState == 2){
                String bookUniqueNumber = cpanel.returnBookTF.getText();
                String str = la.returnOneBook(bookUniqueNumber);
                logTA.append(str + "\n");
                cpanel.returnBookTF.setText("");
            }
        }
    }
}