/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emergencyEnterprise;

import bankEnterprise.bankServices;
import bankEnterprise.bankServicesPolice;
import emergencyEnterprise.emergency.Model.crimeaction;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bharg
 */
public class crimeAction extends javax.swing.JFrame {

    /**
     * Creates new form crimeAction
     */
    public crimeAction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        actionTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        crimeTable = new javax.swing.JTable();
        cdTxt = new javax.swing.JTextField();
        officerTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnStudLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(actionTxt);
        actionTxt.setBounds(687, 363, 189, 23);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 200, 70, 17);

        viewBtn.setBackground(new java.awt.Color(255, 255, 0));
        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewBtn.setText("View Record");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewBtn);
        viewBtn.setBounds(389, 402, 107, 23);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 242, 61, 17);

        submitBtn.setBackground(new java.awt.Color(255, 255, 0));
        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn);
        submitBtn.setBounds(687, 402, 74, 23);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crime Details:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 280, 110, 17);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Crime Action ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 70, 197, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Officer Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 320, 100, 17);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Action Taken:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 360, 100, 17);

        nameTxt.setEnabled(false);
        jPanel1.add(nameTxt);
        nameTxt.setBounds(687, 158, 189, 23);

        phoneTxt.setEnabled(false);
        jPanel1.add(phoneTxt);
        phoneTxt.setBounds(687, 199, 189, 23);

        addressTxt.setEnabled(false);
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        jPanel1.add(addressTxt);
        addressTxt.setBounds(687, 240, 189, 23);

        crimeTable.setBackground(new java.awt.Color(0, 0, 51));
        crimeTable.setForeground(new java.awt.Color(153, 0, 0));
        crimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "Address", "Crime Details"
            }
        ));
        crimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crimeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(crimeTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(44, 158, 452, 226);

        cdTxt.setEnabled(false);
        cdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cdTxt);
        cdTxt.setBounds(687, 281, 189, 23);

        officerTxt.setEnabled(false);
        officerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officerTxtActionPerformed(evt);
            }
        });
        jPanel1.add(officerTxt);
        officerTxt.setBounds(687, 322, 189, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(607, 160, 44, 17);

        btnStudLogout.setBackground(new java.awt.Color(153, 0, 0));
        btnStudLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnStudLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnStudLogout.setText("Logout");
        btnStudLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudLogout);
        btnStudLogout.setBounds(800, 20, 75, 23);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 80, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPDbg.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 900, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 896, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tb1Model = (DefaultTableModel)crimeTable.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.crimereport";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String  name = studentData.getString("name");
                String phone = studentData.getString("phone");
                String address = studentData.getString("address");
                String crimeDetails = studentData.getString("crimeDetails");

                
                String tbData[] = {name, phone,address,crimeDetails};
                
                tb1Model.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }       
    }//GEN-LAST:event_viewBtnActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void cdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdTxtActionPerformed

    private void crimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crimeTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)crimeTable.getModel();
        
        String tb1name = tb1Model.getValueAt(crimeTable.getSelectedRow(),0).toString();
       
        String tb1phone = tb1Model.getValueAt(crimeTable.getSelectedRow(),1).toString();
        String tb1address = tb1Model.getValueAt(crimeTable.getSelectedRow(),2).toString();
        String tb1cd = tb1Model.getValueAt(crimeTable.getSelectedRow(),3).toString();

        

       
        
       
        nameTxt.setText(tb1name);
        phoneTxt.setText(tb1phone);
        addressTxt.setText(tb1address);
        cdTxt.setText(tb1cd);

        
    }//GEN-LAST:event_crimeTableMouseClicked

    
    
    
    
    
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    // Collect data from input fields
    String name = nameTxt.getText();
    String phone = phoneTxt.getText(); // Keep as String
    String address = addressTxt.getText();
    String cd = cdTxt.getText();
    String officer = officerTxt.getText();
    String action = actionTxt.getText();

    // Check if mandatory fields are empty
    if (name.isEmpty() || phone.isEmpty() || address.isEmpty() || cd.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter all details!");
        return;
    }

    try {
        // Establish connection to the database
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");

        // Insert into the crimedetails table
        String insertQuery = "INSERT INTO crimedetails (name, phone, address, crimeDetails, officer, action) VALUES (?, ?, ?, ?, ?, ?)";
        java.sql.PreparedStatement preparedStmt = connection.prepareStatement(insertQuery);
        preparedStmt.setString(1, name);
        preparedStmt.setString(2, phone); // Phone remains as String
        preparedStmt.setString(3, address);
        preparedStmt.setString(4, cd);
        preparedStmt.setString(5, officer);
        preparedStmt.setString(6, action);

        preparedStmt.execute();
        JOptionPane.showMessageDialog(null, "Details successfully added!");

        // Clear input fields after submission
        nameTxt.setText("");
        phoneTxt.setText("");
        addressTxt.setText("");
        cdTxt.setText("");
        officerTxt.setText("");
        actionTxt.setText("");

        connection.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_submitBtnActionPerformed

    private void officerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officerTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_officerTxtActionPerformed

    private void btnStudLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudLogoutActionPerformed
        // TODO add your handling code here:
        emergencyLogin emergencyLoginObj = new emergencyLogin();
        setVisible(false);
        emergencyLoginObj.setVisible(true);
    }//GEN-LAST:event_btnStudLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         bankServicesPolice cr = new bankServicesPolice();
        cr.getUserData(currPoliceName);
        setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 String currPoliceName = "";
    public void setName(String policeName){
        officerTxt.setText(policeName);
//        lblUsername.setText("Welcome " + studentName);
        currPoliceName = policeName;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crimeAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crimeAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crimeAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crimeAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crimeAction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actionTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton btnStudLogout;
    private javax.swing.JTextField cdTxt;
    private javax.swing.JTable crimeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField officerTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
