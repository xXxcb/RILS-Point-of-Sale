/*
* Carlos Burke
* 1400681
 */
package CODE.Users;

import GUI.ModeSelect;
import GUI.Start;
import GUI.adminLawn;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    static Start st = new Start();
   

    public static void main(String[] args) throws InterruptedException {
        
        st.setVisible(true);
        Thread.sleep(4000);
        st.setVisible(false);
        File nf = new File("staffLog.txt");
        if (nf.exists()) {
            ModeSelect ms = new ModeSelect();
            ms.show();
        } else {
            try {
                nf.createNewFile();
                adminLawn al = new adminLawn();
                JOptionPane.showMessageDialog(al, "Welcome New Administator!");
                al.show();
                File nd = new File("./DB");
                nd.mkdir();
                File ndd = new File("./_RECEIPTS");
                ndd.mkdir();
                
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
