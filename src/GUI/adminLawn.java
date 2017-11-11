/*
 * @author Carlos Burke - 1400681
 */
package GUI;

import CODE.Users.UserClass;
import CODE.Users.Admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;

public class adminLawn extends JFrame implements ActionListener {

    private Object[][] tmpUserInfo;

    /**
     * Creates new form adminLawn
     */
    public adminLawn() {
        initComponents();
        setWindowProperties();
        registerListeners();
        ViewUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserInfo = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblErrorMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblUserInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Password", "FirstName", "LastName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserInfo.setGridColor(new java.awt.Color(255, 255, 255));
        tblUserInfo.getTableHeader().setReorderingAllowed(false);
        tblUserInfo.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tblUserInfo);

        btnView.setText("VIEW");

        btnUpdate.setText("UPDATE");

        btnAdd.setText("ADD");

        btnDelete.setText("DELETE");

        btnLogOut.setText("LOG OUT");

        lblErrorMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorMsg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnDelete))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnUpdate))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete))
                        .addGap(76, 76, 76)
                        .addComponent(btnLogOut))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Setting Window Properties
    private void setWindowProperties() {
        this.setSize(700, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    //Setting Button listerners
    private void registerListeners() {
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnLogOut.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnView.addActionListener(this);
    }

    //Displays Users in Admin Lawn
    public void ViewUsers() {
        try {
            UserClass user = new Admin();
            tmpUserInfo = user.DispUsers();
            String[] columnNames = {"Username", "Password", "FirstName", "LastName"};
            DefaultTableModel tableModel = new DefaultTableModel(tmpUserInfo, columnNames) {
            };
            tblUserInfo.setModel(tableModel);
        } catch (FileNotFoundException ex) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorMsg;
    private javax.swing.JTable tblUserInfo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

        //Log Out Admin
        if (e.getSource().equals(btnLogOut)) {
            ModeSelect ms = new ModeSelect();
            this.dispose();
            ms.setVisible(true);
        }

        //View Users
        if (e.getSource().equals(btnView)) {
            ViewUsers();
            lblErrorMsg.setText("");
        }

        //Update Users
        if (e.getSource().equals(btnUpdate)) {
            if (tblUserInfo.getSelectedRow() == -1) {
                lblErrorMsg.setText("Please select a row to edit");
            } else {
                staffUpdate su = new staffUpdate(tmpUserInfo, tblUserInfo.getSelectedRow());
                this.setEnabled(false);
                su.showRec();
            }
        }

        //Add users
        if (e.getSource().equals(btnAdd)) {
            staffAdd sa = new staffAdd();
            lblErrorMsg.setText("Please press the 'View' button to refresh.");
            sa.show();
        }

        //Delete Users
        if (e.getSource().equals(btnDelete)) {
            if (tblUserInfo.getSelectedRow() == -1) {
                lblErrorMsg.setText("Please select a row to edit");
            } else {
                int resp = JOptionPane.showConfirmDialog(this, "Do you want to delete this user?", "Please Confirm", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.NO_OPTION) {
                    System.out.println("Operation Cancelled");
                }
                if (resp == JOptionPane.YES_OPTION) {
                    Object[][] userTemp = new Object[14][4];
                    int count, count2 = 0;
                    for (count = 0; count < tmpUserInfo.length; count++) {
                        if (count == tblUserInfo.getSelectedRow()) {
                            count++;
                        }
                        userTemp[count2][0] = tmpUserInfo[count][0];
                        userTemp[count2][1] = tmpUserInfo[count][1];
                        userTemp[count2][2] = tmpUserInfo[count][2];
                        userTemp[count2][3] = tmpUserInfo[count][3];
                        count2++;
                    }
                    try {
                        FileWriter fp = new FileWriter("staffLog.txt");
                        for (int cnt = 0; cnt < userTemp.length; cnt++) {
                            if (userTemp[cnt][0] == null) {
                                break;
                            }
                            fp.write((String) userTemp[cnt][0] + " ");
                            fp.write((String) userTemp[cnt][1] + " ");
                            fp.write((String) userTemp[cnt][2] + " ");
                            fp.write((String) userTemp[cnt][3] + " \n");
                        }
                        fp.close();
                        lblErrorMsg.setText("Please press the 'View' button to refresh.");
                    } catch (Exception oe) { }
                }
            }
        }
    }
}
