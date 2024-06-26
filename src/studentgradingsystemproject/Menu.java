/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentgradingsystemproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static studentgradingsystemproject.StudentGradingSystemProject.attendance;
import static studentgradingsystemproject.StudentGradingSystemProject.courses;
import static studentgradingsystemproject.StudentGradingSystemProject.departments;
import static studentgradingsystemproject.StudentGradingSystemProject.grades;
import static studentgradingsystemproject.StudentGradingSystemProject.students;

/**
 *
 * @author Cipher
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu - Student Grading System");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cipher\\Downloads\\8997930391656052621-128.png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Student Mgmt");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT GRADING SYSTEM");

        jLabel5.setFont(new java.awt.Font("NSimSun", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Created by Cipher @ 2024");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/iconfinder_Tune_132605_1.png"))); // NOI18N
        jMenu1.setText("System");
        jMenu1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/iconfinder_Exit_132751_1.png"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/iconfinder_Male_132787_1.png"))); // NOI18N
        jMenu2.setText("Student");
        jMenu2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/iconfinder_People_132775.png"))); // NOI18N
        jMenuItem4.setText("StudentMgmt");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Icons8-Windows-8-Science-Courses.24_1.png"))); // NOI18N
        jMenu4.setText("Course");
        jMenu4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Icons8-Windows-8-Science-Courses.24.png"))); // NOI18N
        jMenuItem5.setText("CourseMgmt");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Microsoft-Fluentui-Emoji-Flat-Department-Store-Flat.24.png"))); // NOI18N
        jMenu5.setText("Department");
        jMenu5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Microsoft-Fluentui-Emoji-Flat-Department-Store-Flat.24.png"))); // NOI18N
        jMenuItem6.setText("DepartmentMgmt");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Oxygen-Icons.org-Oxygen-Actions-mail-mark-task.24.png"))); // NOI18N
        jMenu6.setText("Grades");
        jMenu6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Oxygen-Icons.org-Oxygen-Actions-mail-mark-task.24.png"))); // NOI18N
        jMenuItem7.setText("GradesMgmt");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Wwalczyszyn-Android-Style-Calendar.24.png"))); // NOI18N
        jMenu7.setText("Attendance");
        jMenu7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentgradingsystemproject/Wwalczyszyn-Android-Style-Calendar.24.png"))); // NOI18N
        jMenuItem8.setText("AttendanceMgmt");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        new StudentMGMT().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new StudentMGMT().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new StudentMGMT().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new CourseMgmt().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new DeptMgmt().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new GradesMgmt().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new AttendanceMgmt().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    
        public static void backup_student() throws IOException
    {
     File outfile  = new File("students.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(students);
     outObjectStream.close();
     
    }
    
    public static void retrieve_student() throws IOException, ClassNotFoundException
    {
     File infile  = new File("students.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     students = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    
    public static void restore_courses() throws IOException, ClassNotFoundException{
        File inFile = new File("courses.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        courses = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_courses() throws IOException {
        File outFile = new File("courses.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(courses);
        outObjectStream.close();
    }
    
    public static void restore_departments() throws IOException, ClassNotFoundException{
        File inFile = new File("departments.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        departments = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_departments() throws IOException {
        File outFile = new File("departments.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(departments);
        outObjectStream.close();
    }
    
    
    public static void restore_grades() throws IOException, ClassNotFoundException{
        File inFile = new File("Grades.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        grades = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    
    public static void backup_grades() throws IOException {
        File outFile = new File("Grades.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(grades);
        outObjectStream.close();
    }
    
    public static void restore_attendances() throws IOException, ClassNotFoundException{
        File inFile = new File("Attendances.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        attendance = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_attendances() throws IOException {
        File outFile = new File("Attendances.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(attendance);
        outObjectStream.close();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
