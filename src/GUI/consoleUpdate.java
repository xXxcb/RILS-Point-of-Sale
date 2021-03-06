/*
 * @author Carlos Burke - 1400681
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class consoleUpdate extends JFrame implements ActionListener {

    private Object[][] tmpInfo;
    private int rw = 0;

    /**
     * Creates new form movieUpdae
     * @param tmpConsoleInfo
     * @param rowSelect
     */
    public consoleUpdate(Object[][] tmpConsoleInfo, int rowSelect) {
        tmpInfo = tmpConsoleInfo;
        rw = rowSelect;
        initComponents();
        setWindowProperties();
        registerListeners();
    }

    private consoleUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[][] showRec() {
        txtConsoleName.setText((String) tmpInfo[rw][0]);
        txtManufacturer.setText((String) tmpInfo[rw][1]);
        txtConsoleCOlor.setText((String) tmpInfo[rw][2]);
        txtSerialNo.setText((String) tmpInfo[rw][3]);
        txtNoOfControls.setText((String) tmpInfo[rw][4]);
        txtDateAquired.setText((String) tmpInfo[rw][5]);
        txtRentalID.setText((String) tmpInfo[rw][6]);
        txtNoOfCopies.setText((String) tmpInfo[rw][7]);
        txtDailyCost.setText((String) tmpInfo[rw][8]);

        return tmpInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConsoleName = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        txtManufacturer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNoOfCopies = new javax.swing.JTextField();
        txtRentalID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConsoleCOlor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtDateAquired = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        txtDailyCost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoOfControls = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConfirm.setText("CONFIRM");

        jLabel2.setText("Serial #:");

        jLabel3.setText("Manufacturer:");

        jLabel4.setText("# of Controllers:");

        jLabel9.setText("Console Color:");

        lblTitle.setText("Console Name:");

        btnCancel.setText("CANCEL");
        btnCancel.setToolTipText("");

        jLabel6.setText("Rental ID:");

        jLabel8.setText("Daily Cost:");

        jLabel7.setText("# of Items:");

        jLabel5.setText("Date  Acquired:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirm)
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtConsoleCOlor)
                                .addGap(259, 259, 259))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNoOfControls)
                                    .addComponent(txtManufacturer)
                                    .addComponent(txtConsoleName)
                                    .addComponent(txtSerialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDateAquired)
                                        .addComponent(txtRentalID)
                                        .addComponent(txtDailyCost, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNoOfCopies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConsoleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoOfControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDateAquired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRentalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoOfCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDailyCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsoleCOlor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnConfirm))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setWindowProperties() {
        this.setSize(450, 350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void registerListeners() {
        btnCancel.addActionListener(this);
        btnConfirm.addActionListener(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtConsoleCOlor;
    private javax.swing.JTextField txtConsoleName;
    private javax.swing.JTextField txtDailyCost;
    private javax.swing.JTextField txtDateAquired;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtNoOfControls;
    private javax.swing.JTextField txtNoOfCopies;
    private javax.swing.JTextField txtRentalID;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnConfirm)) {
            tmpInfo[rw][0] = txtConsoleName.getText();
            tmpInfo[rw][1] = txtManufacturer.getText();
            tmpInfo[rw][2] = txtConsoleCOlor.getText();
            tmpInfo[rw][3] = txtSerialNo.getText();
            tmpInfo[rw][4] = txtNoOfControls.getText();
            tmpInfo[rw][5] = txtDateAquired.getText();
            tmpInfo[rw][6] = txtRentalID.getText();
            tmpInfo[rw][7] = txtNoOfCopies.getText();
            tmpInfo[rw][8] = txtDailyCost.getText();

            try {
                FileWriter fp = new FileWriter("./DB/GameConsoleRecords.txt");
                for (int count = 0; count < tmpInfo.length; count++) {
                    if (tmpInfo[count][0] == null) {
                        break;
                    }
                    fp.write((String) tmpInfo[count][0] + " ");
                    fp.write((String) tmpInfo[count][1] + " ");
                    fp.write((String) tmpInfo[count][2] + " ");
                    fp.write((String) tmpInfo[count][3] + " ");
                    fp.write((String) tmpInfo[count][4] + " ");
                    fp.write((String) tmpInfo[count][5] + " ");
                    fp.write((String) tmpInfo[count][6] + " ");
                    fp.write((String) tmpInfo[count][7] + " ");
                    fp.write((String) tmpInfo[count][8] + " \n");
                }
                fp.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Database cannot be found! Consult Admin", "DATABASE ERROR", ERROR);
            }
            staffLawn su = new staffLawn();
            su.enable();            
            this.dispose();
            JOptionPane.showMessageDialog(rootPane, "Press the VIEW button to refresh table");
        }

        if (e.getSource().equals(btnCancel)) {
            staffLawn mu = new staffLawn();
            mu.setEnabled(true);
            this.dispose();
        }
    }
}
