/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emergencyEnterprise;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import emergencyEnterprise.emergency.Model.crimereport;
import university.student;
import university.uniLogin;


/**
 *
 * @author bharg
 */
public class crimeReport extends javax.swing.JFrame {

    /**
     * Creates new form crimeReport
     */
    public crimeReport() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        cdTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnStudLogout1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane1.setForeground(new java.awt.Color(242, 242, 242));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 193, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 234, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 275, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crime Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 316, -1, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 191, 188, -1));

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        jPanel1.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 232, 188, -1));
        jPanel1.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 273, 188, -1));
        jPanel1.add(cdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 314, 188, -1));

        submitBtn.setBackground(new java.awt.Color(255, 255, 0));
        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 366, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Report Crime Here");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 97, 202, 31));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPDnobg.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPDbg.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        jTabbedPane1.addTab("Report Crime", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailsTable.setBackground(new java.awt.Color(0, 0, 51));
        detailsTable.setForeground(new java.awt.Color(255, 255, 255));
        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "Address", "Crime Details", "Officer Name", "Action Taken"
            }
        ));
        jScrollPane1.setViewportView(detailsTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 652, 294));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crime Details");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 32));

        viewBtn.setBackground(new java.awt.Color(255, 255, 0));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPDbg.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Crime Details", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudLogout1.setBackground(new java.awt.Color(255, 255, 0));
        btnStudLogout1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnStudLogout1.setText("Logout");
        btnStudLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudLogout1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnStudLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("End Current Session?");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPD-login logo.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, 180));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPDbg.jpg"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        jTabbedPane1.addTab("Action", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed
    String currName = "";
    String currentRole = "";
    public void getUserData(String user, String role){
        nameTxt.setText(user);
        currName = user;
        currentRole = role;
    }
    
//    public class CrimeReport{
//        
//        
//        public static void CreateCrimeReport(String name, int phone, String address, String cd){
//            
//             try{
//            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
//            
//            System.out.println("connection open");
//            java.sql.Statement statement = connection.createStatement();
//                        System.out.println("connection open");
//
//            String query = "INSERT INTO universitysystem.crimeReport (name,phone,address,crimeDetails) values(?,?,?,?)";
//                        System.out.println("connection insert");
//
//           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
//            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
//            preparedStmt.setString(1,name);
//            
//            System.out.println("connection insert");
//            
//            preparedStmt.setInt(2,phone);
//            preparedStmt.setString(3,address);
//            preparedStmt.setString(4,cd);
//
//
//            System.out.println("connection insert");
//
//            preparedStmt.execute();
//             System.out.println("connection run");
//             JOptionPane.showMessageDialog(null,"Details Added");
//
//             connection.close();
//        }
//        catch(Exception e){
//            System.out.println(e);
//            JOptionPane.showMessageDialog(null,"please add data in correct format!");
//        }      
//             
//        }
//    
//    } 
    
    
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String name = nameTxt.getText();
        int phone = Integer.parseInt(phoneTxt.getText());
        String address = addressTxt.getText();
        String cd = cdTxt.getText();

        
       
       
        
        if(addressTxt.getText().isEmpty()|| nameTxt.getText().isEmpty()||phoneTxt.getText().isEmpty()||cdTxt.getText().isEmpty()           ){
                 JOptionPane.showMessageDialog(null, "Plz Enter Details!");

        
        } else{

        
        // Community.CreateCommunity(house,person,community,city,hospital);
         //CrimeReport.CreateCrimeReport(name,phone,address,cd);
         crimereport report =  new crimereport(name,phone,address,cd);
               report.addCrime();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)detailsTable.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.crimedetails WHERE Name = '"+currName+"'";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String  name = studentData.getString("name");
                String phone = studentData.getString("phone");
                String address = studentData.getString("address");
                String crimeDetails = studentData.getString("crimeDetails");
                String officer = studentData.getString("officer");
                String action = studentData.getString("action");


                
                String tbData[] = {name, phone,address,crimeDetails,officer,action};
                
                tb1Model.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }   
    }//GEN-LAST:event_viewBtnActionPerformed

    private void btnStudLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudLogout1ActionPerformed
        // TODO add your handling code here:
        emergencyLogin emergencyLoginObj = new emergencyLogin();
        setVisible(false);
        emergencyLoginObj.setVisible(true);
    }//GEN-LAST:event_btnStudLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(crimeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crimeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crimeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crimeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crimeReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton btnStudLogout1;
    private javax.swing.JTextField cdTxt;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
