/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package university;

import Pharmacy.Employee;
import Pharmacy.Medicines;
import bankEnterprise.bankAction;
import bankEnterprise.bankServices;
import emergencyEnterprise.crimeReport;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bharg
 */
public class student extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public student() {
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

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        profTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStudUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        AgeTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        pnameTxt = new javax.swing.JTextField();
        findBtbn = new javax.swing.JButton();
        subjectTxt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnStudLogout = new javax.swing.JButton();
        jLabelActiontitle = new javax.swing.JLabel();
        jLabellogoactionstudent = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReportCrime1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnBuyMed1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 348, -1, -1));

        profTable.setBackground(new java.awt.Color(102, 0, 0));
        profTable.setForeground(new java.awt.Color(255, 255, 255));
        profTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Age"
            }
        ));
        profTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(profTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 248, 468, 177));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 313, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Professor Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 278, -1, -1));

        txtStudUsername.setEnabled(false);
        txtStudUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtStudUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 144, 143, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 147, -1, -1));

        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 386, -1, -1));

        AgeTxt.setEnabled(false);
        jPanel1.add(AgeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 345, 151, -1));

        emailTxt.setEnabled(false);
        jPanel1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 310, 151, -1));

        pnameTxt.setEnabled(false);
        jPanel1.add(pnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 275, 151, -1));

        findBtbn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        findBtbn.setText("Find Professor");
        findBtbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtbnActionPerformed(evt);
            }
        });
        jPanel1.add(findBtbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 207, -1, -1));

        subjectTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Web Design", "AED", "DMDD", "PSA" }));
        jPanel1.add(subjectTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 144, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subject:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 147, -1, -1));
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 236, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course Registration");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Northeastern-University-300x222.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 290, 310));

        jTabbedPane1.addTab("Course Registration", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        resultsTable.setBackground(new java.awt.Color(153, 0, 0));
        resultsTable.setForeground(new java.awt.Color(255, 255, 255));
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Subject", "Marks", "Remarks"
            }
        ));
        jScrollPane2.setViewportView(resultsTable);

        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("View Grades");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBtn)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grades", jPanel2);

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnStudLogout.setText("Logout");
        btnStudLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudLogoutActionPerformed(evt);
            }
        });
        jPanel5.add(btnStudLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 234, -1, -1));

        jLabelActiontitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelActiontitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActiontitle.setText("Want to end the current session?");
        jPanel5.add(jLabelActiontitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 193, -1, -1));

        jLabellogoactionstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Northeastern-University-300x222.png"))); // NOI18N
        jPanel5.add(jLabellogoactionstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 76, -1, 99));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Report a crime to NUPD?");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 373, -1, -1));

        btnReportCrime1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReportCrime1.setText("Report Crime");
        btnReportCrime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportCrime1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnReportCrime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 407, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buy Meds?");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 373, -1, -1));

        btnBuyMed1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBuyMed1.setText("Buy Medicine");
        btnBuyMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyMed1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuyMed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 407, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Apply Loan from bank?");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 373, -1, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Apply Loan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 407, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toppng.com-vignette-png-19201080-overlay-photo-1920x1080.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jTabbedPane1.addTab("Action", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public class CourseReg{
        
        
        public static void CreateCourseReg(String username, String Subject, String pName, String email, int age){
            
             try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

            String query = "INSERT INTO universitysystem.courseregistration (username, Subject, ProfessorName, Email, Age) values(?,?,?,?,?)";
                        System.out.println("connection insert");
            //statement.executeUpdate("insert into universitysystem.login" + "(role, username, password)" + "values ('BankEmployee','"+username+"', '"+password+"')");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,username);
            preparedStmt.setString(2,Subject);
            preparedStmt.setString(3,pName);
            preparedStmt.setString(4,email);
            preparedStmt.setInt(5,age);

            
            System.out.println("connection insert");
            
           

            preparedStmt.execute();
             System.out.println("connection run");
             JOptionPane.showMessageDialog(null,"Details Added");

             connection.close();
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"please add data in correct format!");
        }      
             
        }
    
    } 
    
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
String username = txtStudUsername.getText();
    String subject = (String) subjectTxt.getSelectedItem();
    String pname = pnameTxt.getText();
    String email = emailTxt.getText();
    int age;

    // Validate input
    try {
        age = Integer.parseInt(AgeTxt.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid Age. Please enter a valid number.");
        return;
    }

    if (username.isEmpty() || pname.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter all details!");
        return;
    }

    try {
        // Establish connection to the database
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");

        // Check if already registered
        String checkQuery = "SELECT * FROM courseregistration WHERE username = ? AND Subject = ?";
        java.sql.PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
        checkStmt.setString(1, username);
        checkStmt.setString(2, subject);

        java.sql.ResultSet resultSet = checkStmt.executeQuery();
        if (resultSet.next()) {
            // Student is already registered
            JOptionPane.showMessageDialog(null, "You are already registered for this course!");
        } else {
            // Insert new registration
            String insertQuery = "INSERT INTO courseregistration (username, Subject, ProfessorName, Email, Age) VALUES (?, ?, ?, ?, ?)";
            java.sql.PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
            insertStmt.setString(1, username);
            insertStmt.setString(2, subject);
            insertStmt.setString(3, pname);
            insertStmt.setString(4, email);
            insertStmt.setInt(5, age);

            insertStmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered for the Course!");
        }

        connection.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
    }

    // Clear fields after submission
    subjectTxt.setSelectedItem("");
    pnameTxt.setText("");
    AgeTxt.setText("");
    emailTxt.setText("");
    }//GEN-LAST:event_submitBtnActionPerformed
String profUserame = "";
    private void profTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profTableMouseClicked
        // TODO add your handling code here:
        
DefaultTableModel profModel = (DefaultTableModel)profTable.getModel();
    String profNameTxt = profTable.getValueAt(profTable.getSelectedRow(), 0).toString();
    pnameTxt.setText(profNameTxt);
    emailTxt.setText(profTable.getValueAt(profTable.getSelectedRow(), 1).toString());
    AgeTxt.setText(profTable.getValueAt(profTable.getSelectedRow(), 2).toString());

        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.professors WHERE Name = '"+profNameTxt+"'";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            while(profData.next()){
                profUserame = profData.getString("username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_profTableMouseClicked

    private void findBtbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtbnActionPerformed
        // TODO add your handling code here:
        
DefaultTableModel profModel = (DefaultTableModel)profTable.getModel();
    profModel.setRowCount(0); // Clear existing rows

    String course = subjectTxt.getSelectedItem().toString();
    try {
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
        java.sql.Statement statement = connection.createStatement();

        // Query to fetch professors teaching the selected course
        String profQuery = "SELECT name, email, age FROM professors WHERE subjectTeach = ?";
        java.sql.PreparedStatement profStmt = connection.prepareStatement(profQuery);
        profStmt.setString(1, course);

        java.sql.ResultSet profData = profStmt.executeQuery();
        while (profData.next()) {
            Object tbData[] = {profData.getString("name"), profData.getString("email"), profData.getInt("age")};
            profModel.addRow(tbData);
        }

        connection.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error fetching professors: " + e.getMessage());
    }
    }//GEN-LAST:event_findBtbnActionPerformed

    private void txtStudUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudUsernameActionPerformed

    private void btnStudLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudLogoutActionPerformed
        // TODO add your handling code here:
        uniLogin uniLoginObj = new uniLogin();
        setVisible(false);
        uniLoginObj.setVisible(true);
    }//GEN-LAST:event_btnStudLogoutActionPerformed

    private void btnReportCrime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportCrime1ActionPerformed
        // TODO add your handling code here:
        crimeReport cr = new crimeReport();
        cr.getUserData(currStudentName, "student");
        setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_btnReportCrime1ActionPerformed

    private void btnBuyMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyMed1ActionPerformed
        // TODO add your handling code here:
        Employee emp = new Employee();
        emp.setUsername(currStudUsername);
        emp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBuyMed1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bankServices bank = new bankServices();
        bank.setUsername(currStudUsername, "student");
        bankAction ba = new bankAction();
        ba.setRole("student");
        bank.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
DefaultTableModel tb1Model = (DefaultTableModel) resultsTable.getModel();
    tb1Model.setRowCount(0); // Clear the table to avoid duplicates

    try {
        // Establish connection to database
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");

        // Query to fetch the grades for the current student
        String studentQuery = "SELECT DISTINCT studentname, subject, marks, remarks FROM coursegrade WHERE studentname = ?";
        java.sql.PreparedStatement stmt = connection.prepareStatement(studentQuery);
        stmt.setString(1, currStudentName);

        java.sql.ResultSet studentData = stmt.executeQuery();

        while (studentData.next()) {
            String name = studentData.getString("studentname");
            String subject = studentData.getString("subject");
            String marks = studentData.getString("marks");
            String remarks = studentData.getString("remarks");

            String tbData[] = {name, subject, marks, remarks};
            tb1Model.addRow(tbData); // Add the row to the table model
        }

        connection.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error fetching grades: " + e.getMessage());
    }
    }//GEN-LAST:event_viewBtnActionPerformed
    String currStudentName = "";
    String currStudUsername = "";
     public void populateStudentInfo(String username) {
    try {
        // Establish connection to the database
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");

        // Query to fetch student details
        String query = "SELECT * FROM students WHERE username = ?";
        java.sql.PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, username);

        java.sql.ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            // Populate fields with student data
            txtStudUsername.setText(rs.getString("username"));
            subjectTxt.setSelectedItem(rs.getString("subjectTaken")); // Optional, if a default subject exists
        }

        connection.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error fetching student data: " + e.getMessage());
    }
}

public void setName(String studentName, String username){
    txtStudUsername.setText(username); // Display username in the field
    currStudentName = studentName;
    currStudUsername = username;

    populateStudentInfo(username); // Populate additional student data
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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JButton btnBuyMed1;
    private javax.swing.JButton btnReportCrime1;
    private javax.swing.JButton btnStudLogout;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton findBtbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActiontitle;
    private javax.swing.JLabel jLabellogoactionstudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField pnameTxt;
    private javax.swing.JTable profTable;
    private javax.swing.JTable resultsTable;
    private javax.swing.JComboBox<String> subjectTxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtStudUsername;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}