/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package university;

import emergencyEnterprise.crimeReport;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;

/**
 *
 * @author bharg
 */
public class professor extends javax.swing.JFrame {

    /**
     * Creates new form professor
     */
    public professor() {
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
        btnViewStudData = new javax.swing.JButton();
        jLabeltitleProfessor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        remarksTxt = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JTextField();
        sNameTxt = new javax.swing.JTextField();
        gradeTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GradeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnProfLogout = new javax.swing.JButton();
        lblProfName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReportCrime1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewStudData.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewStudData.setText("View");
        btnViewStudData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewStudData, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 369, 90, -1));

        jLabeltitleProfessor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabeltitleProfessor.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltitleProfessor.setText("Grading");
        jPanel1.add(jLabeltitleProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        subjectTable.setBackground(new java.awt.Color(153, 0, 0));
        subjectTable.setForeground(new java.awt.Color(255, 255, 255));
        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Subject"
            }
        ));
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 177, 408, 160));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 226, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Remarks:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 317, -1, -1));
        jPanel1.add(remarksTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 314, 215, -1));

        subjectTxt.setEnabled(false);
        subjectTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTxtActionPerformed(evt);
            }
        });
        jPanel1.add(subjectTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 223, 215, -1));

        sNameTxt.setEnabled(false);
        jPanel1.add(sNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 177, 215, -1));

        gradeTxt.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        gradeTxt.setText("Grade");
        gradeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeTxtActionPerformed(evt);
            }
        });
        jPanel1.add(gradeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 369, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grade:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 267, -1, -1));
        jPanel1.add(GradeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 264, 215, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 180, -1, -1));

        btnProfLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnProfLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnProfLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnProfLogout.setText("Log Out");
        btnProfLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 21, -1, -1));
        jPanel1.add(lblProfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 116, 337, 43));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Report a crime to NUPD?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 410, -1, -1));

        btnReportCrime1.setBackground(new java.awt.Color(0, 0, 0));
        btnReportCrime1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReportCrime1.setForeground(new java.awt.Color(255, 255, 255));
        btnReportCrime1.setText("Report Crime");
        btnReportCrime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportCrime1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportCrime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 439, -1, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toppng.com-vignette-png-19201080-overlay-photo-1920x1080.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 829, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String currSubjectTeach = "";
    String currProfUsername = "";

    public void setProfData(String profName, String currentSubjectTeach) {
        lblProfName.setText("Welcome Professor " + profName);
        currSubjectTeach = currentSubjectTeach;
        currProfUsername = profName;
        System.out.println("Current Subject: " + currSubjectTeach);
        System.out.println("Current Professor: " + currProfUsername);
    }

    private void btnViewStudDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudDataActionPerformed
        DefaultTableModel studSubModel = (DefaultTableModel) subjectTable.getModel();
        studSubModel.setRowCount(0); // Clear the table before populating

        try {
            // Establish database connection
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");
            System.out.println("Database connection established.");

            String studentQuery = "SELECT s.name AS StudentName, c.Subject AS Subject "
                    + "FROM universitysystem.courseregistration c "
                    + "JOIN universitysystem.students s ON c.username = s.username "
                    + "JOIN universitysystem.professors p ON c.ProfessorName = p.name "
                    + "WHERE c.Subject = ? AND p.username = ?";

            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(studentQuery);
            preparedStatement.setString(1, currSubjectTeach);
            preparedStatement.setString(2, currProfUsername);

            System.out.println("Query prepared with Subject: " + currSubjectTeach + " and Professor: " + currProfUsername);

            // Execute the query
            java.sql.ResultSet studentData = preparedStatement.executeQuery();

            // Debugging: Check if data is fetched
            boolean dataFound = false;
            while (studentData.next()) {
                dataFound = true;
                String studentName = studentData.getString("StudentName"); // Use alias
                String subject = studentData.getString("Subject");        // Use alias

                // Debugging
                System.out.println("Fetched Row - Student Name: " + studentName + ", Subject: " + subject);

                // Add data to the table
                studSubModel.addRow(new Object[]{studentName, subject});
            }

            if (!dataFound) {
                System.out.println("No data found for the given subject and professor.");
                JOptionPane.showMessageDialog(null, "No students registered for this course.");
            }

            connection.close(); // Close the connection
            System.out.println("Database connection closed.");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnViewStudDataActionPerformed

    public class CourseGrade {

        public static void CreateCourseGrade(String sName, String Subject, String Grade, String Remarks) {

            try {
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");

                System.out.println("connection open");
                java.sql.Statement statement = connection.createStatement();
                System.out.println("connection open");

                String query = "INSERT INTO universitysystem.coursegrade (studentName, subject, marks, remarks) values(?,?,?,?)";
                System.out.println("connection insert");
                //statement.executeUpdate("insert into universitysystem.login" + "(role, username, password)" + "values ('BankEmployee','"+username+"', '"+password+"')");

                // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
                java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, sName);
                preparedStmt.setString(2, Subject);
                preparedStmt.setString(3, Grade);
                preparedStmt.setString(4, Remarks);

                System.out.println("connection insert");

                preparedStmt.execute();
                System.out.println("connection run");
                JOptionPane.showMessageDialog(null, "Details Added");

                connection.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "please add data in correct format!");
            }

        }

    }


    private void gradeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeTxtActionPerformed
    String studentName = sNameTxt.getText();
    String subject = subjectTxt.getText();
    String grade = GradeTxt.getText();
    String remarks = remarksTxt.getText();

    // Validate input fields
    if (studentName.isEmpty() || subject.isEmpty() || grade.isEmpty() || remarks.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        return;
    }

    try {
        // Establish database connection
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user1234");

        // Check if a grade already exists for the student and subject
        String checkQuery = "SELECT * FROM coursegrade WHERE studentname = ? AND subject = ?";
        java.sql.PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
        checkStmt.setString(1, studentName);
        checkStmt.setString(2, subject);

        java.sql.ResultSet resultSet = checkStmt.executeQuery();

        if (resultSet.next()) {
            // Update existing grade
            String updateQuery = "UPDATE coursegrade SET marks = ?, remarks = ? WHERE studentname = ? AND subject = ?";
            java.sql.PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
            updateStmt.setString(1, grade);
            updateStmt.setString(2, remarks);
            updateStmt.setString(3, studentName);
            updateStmt.setString(4, subject);

            updateStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Grade and Remarks updated successfully!");
        } else {
            // Insert new grade
            String insertQuery = "INSERT INTO coursegrade (studentname, subject, marks, remarks) VALUES (?, ?, ?, ?)";
            java.sql.PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
            insertStmt.setString(1, studentName);
            insertStmt.setString(2, subject);
            insertStmt.setString(3, grade);
            insertStmt.setString(4, remarks);

            insertStmt.execute();
            JOptionPane.showMessageDialog(null, "Grade and Remarks added successfully!");
        }

        connection.close();

        // Clear fields after submission
        sNameTxt.setText("");
        subjectTxt.setText("");
        GradeTxt.setText("");
        remarksTxt.setText("");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_gradeTxtActionPerformed

    private void subjectTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTxtActionPerformed

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel profModel = (DefaultTableModel) subjectTable.getModel();
        int selectedRowIndex = subjectTable.getSelectedRow();

        if (selectedRowIndex != -1) {
            String studentName = profModel.getValueAt(selectedRowIndex, 0).toString();
            String subject = profModel.getValueAt(selectedRowIndex, 1).toString();

            // Populate the fields
            sNameTxt.setText(studentName);
            subjectTxt.setText(subject);
        }
    }//GEN-LAST:event_subjectTableMouseClicked

    private void btnProfLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfLogoutActionPerformed
        // TODO add your handling code here:
        currSubjectTeach = "";
        currProfUsername = "";
        uniLogin uniLoginObj = new uniLogin();
        setVisible(false);
        uniLoginObj.setVisible(true);
    }//GEN-LAST:event_btnProfLogoutActionPerformed

    private void btnReportCrime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportCrime1ActionPerformed
        // TODO add your handling code here:
        crimeReport cr = new crimeReport();
        cr.getUserData(currProfUsername, "professor");
        setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_btnReportCrime1ActionPerformed

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
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GradeTxt;
    private javax.swing.JButton btnProfLogout;
    private javax.swing.JButton btnReportCrime1;
    private javax.swing.JButton btnViewStudData;
    private javax.swing.JButton gradeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeltitleProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProfName;
    private javax.swing.JTextField remarksTxt;
    private javax.swing.JTextField sNameTxt;
    private javax.swing.JTable subjectTable;
    private javax.swing.JTextField subjectTxt;
    // End of variables declaration//GEN-END:variables
}
