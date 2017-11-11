/*
 * UserClass
 * @author Carlos Burke - 1400681
 */
package CODE.Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Admin extends UserClass {
    // UserClass ucs = new Admin();

    private String fname, lname, usrname, pswrd;
    private int cnt = 0, amt = 0;

    @Override
    public Object[][] DispUsers() throws FileNotFoundException {
        File inFile = new File("staffLog.txt");
        Scanner inf = new Scanner(inFile);

        Object[][] UserInfo = new Object[14][4];

        while (inf.hasNext()) {
            UserInfo[cnt][0] = inf.next();
            UserInfo[cnt][1] = inf.next();
            UserInfo[cnt][2] = inf.next();
            UserInfo[cnt][3] = inf.next();
            cnt++;
        }
        return UserInfo;
    }

    @Override
    public boolean adminValidate(String name, String password) {
        try {
            final String uName = "1413914";
            final String uPassword = "teardown";
            if (uName.equals(name) && uPassword.equals(password)) {
                return true;
            } else {
                return false;
            }
        } catch (InputMismatchException e) { 
            JOptionPane.showMessageDialog(null, "Please enter the correct type of values!");
        }
        return false;
    }
}
