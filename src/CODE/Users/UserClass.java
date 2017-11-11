/*
 * UserClass
 * @author Carlos Burke - 1400681
 */
package CODE.Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserClass {

    //Attribute Declaration
    private String UserName;
    private String PassWord;
    private Boolean ans = false;
    private String FirstName, LastName;

    //Primary Constructor
    public UserClass(String UserName, String PassWord, String FirstName, String LastName) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    //Default Constructor
    public UserClass() {
        UserName = "";
        PassWord = "";
        FirstName = "";
        LastName = "";
    }

    //Getters/Setters
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public boolean adminValidate(String name, String password) {
        return false;
    }

    public Object[][] DispUsers() throws FileNotFoundException {
        return (Object[][]) new Object();
    }

    public boolean staffValidate(String name, String password) throws FileNotFoundException {
        UserClass uc = new UserClass();
        File inFile = new File("staffLog.txt");
        Scanner in = new Scanner(inFile);
        ArrayList<UserClass> input = new ArrayList<>();
        UserClass uClass;
        while (in.hasNext()) {
            uClass = new UserClass();
            uClass.setUserName(in.next());
            uClass.setPassWord(in.next());
            uClass.setFirstName(in.next());
            uClass.setLastName(in.next());
            input.add(uClass); //add to array list
        }
        for (UserClass ulc : input) {
            if (ulc.getUserName().equals(name) && ulc.getPassWord().equals(password)) {
                ans = true;
                break;
            } else {
                ans = false;
            }
        }
        return ans;
    }

}
