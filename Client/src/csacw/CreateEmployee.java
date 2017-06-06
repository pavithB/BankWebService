/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csacw;

import javax.swing.JOptionPane;

/**
 *
 * @author Pavith Buddhima
 */
public class CreateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form CreateEmployee
     */
    public CreateEmployee() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMess2 = new javax.swing.JLabel();
        lblMess1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblCreateEmpAcc = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        lblEmpName = new javax.swing.JLabel();
        txtEmpUName = new javax.swing.JTextField();
        lblEmpUName = new javax.swing.JLabel();
        lblEmpPWord = new javax.swing.JLabel();
        txtEmpPWord = new javax.swing.JPasswordField();
        lblEmpPosition = new javax.swing.JLabel();
        txtEmpPosition = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuitmCusLst = new javax.swing.JMenuItem();
        mnuitmEmpLst = new javax.swing.JMenuItem();
        mnuitmExit = new javax.swing.JMenuItem();
        mnuMyAcc = new javax.swing.JMenu();
        mnuitmAccLogout = new javax.swing.JMenuItem();
        mnuitmAccLogin = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMess2.setText("Note: enter necessary details and press create to create new employee account");

        lblMess1.setText("Enter Customer Details And Press Create");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 51));

        lblCreateEmpAcc.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        lblCreateEmpAcc.setText("Create Employee Account");

        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });

        lblEmpName.setText("Name: *");

        lblEmpUName.setText("User_Name: *");

        lblEmpPWord.setText("Password: *");

        lblEmpPosition.setText("Position: *");

        mnuFile.setText("File");

        mnuitmCusLst.setText("Customer List");
        mnuitmCusLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmCusLstActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmCusLst);

        mnuitmEmpLst.setText("Employee List");
        mnuitmEmpLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmEmpLstActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmEmpLst);

        mnuitmExit.setText("Exit");
        mnuitmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmExit);

        jMenuBar1.add(mnuFile);

        mnuMyAcc.setText("MyAccount");

        mnuitmAccLogout.setText("LogOut");
        mnuitmAccLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmAccLogoutActionPerformed(evt);
            }
        });
        mnuMyAcc.add(mnuitmAccLogout);

        mnuitmAccLogin.setText("LogIn");
        mnuMyAcc.add(mnuitmAccLogin);

        jMenuBar1.add(mnuMyAcc);

        mnuHelp.setText("Help");
        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMess2)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCreateEmpAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMess1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmpPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmpUName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpUName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmpPWord, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpPWord))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateEmpAcc)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpUName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpPWord, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpPWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMess1)
                    .addComponent(btnCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMess2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuitmAccLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmAccLogoutActionPerformed
        Login login = new Login();
        this.hide();
        login.show();
    }//GEN-LAST:event_mnuitmAccLogoutActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        boolean isEmpty = check();
        if(isEmpty){
            
            
        }else{
        String empName = txtEmpName.getText();
        String empPosition = txtEmpPosition.getText();
        String empUName = txtEmpUName.getText();
        String empPWord = String.valueOf(txtEmpPWord.getText());
        
        String sql = "Insert into employee(emp_Name,emp_Position,emp_UserName,emp_PassWord)"
        + "Values('"+empName+"','"+empPosition+"','"+empUName+"','"+empPWord+"')";
        
        addEmployee(sql);
        JOptionPane.showMessageDialog(null,"Employee Sucessfully Created");
        this.hide();
        EmployeeList employeeList = new EmployeeList();
        employeeList.show();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void mnuitmCusLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmCusLstActionPerformed
        CustomerList customerList = new CustomerList();
        this.hide();
        customerList.show();
    }//GEN-LAST:event_mnuitmCusLstActionPerformed

    private void mnuitmEmpLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmEmpLstActionPerformed
        EmployeeList employeeList = new EmployeeList();
        this.hide();
        employeeList.show();
    }//GEN-LAST:event_mnuitmEmpLstActionPerformed

    private void mnuitmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuitmExitActionPerformed

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
            java.util.logging.Logger.getLogger(CreateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEmployee().setVisible(true);
            }
        });
        
    }
    private boolean check()  {
        boolean isEmpty=false;
        
        if(txtEmpName.getText().equals("") || txtEmpPWord.getText().equals("") || 
        txtEmpPosition.getText().equals("") || txtEmpUName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the fields before proceeding");
            isEmpty = true ;
        }
      
        
        return isEmpty ;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCreateEmpAcc;
    private javax.swing.JLabel lblEmpName;
    private javax.swing.JLabel lblEmpPWord;
    private javax.swing.JLabel lblEmpPosition;
    private javax.swing.JLabel lblEmpUName;
    private javax.swing.JLabel lblMess1;
    private javax.swing.JLabel lblMess2;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuMyAcc;
    private javax.swing.JMenuItem mnuitmAccLogin;
    private javax.swing.JMenuItem mnuitmAccLogout;
    private javax.swing.JMenuItem mnuitmCusLst;
    private javax.swing.JMenuItem mnuitmEmpLst;
    private javax.swing.JMenuItem mnuitmExit;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtEmpPWord;
    private javax.swing.JTextField txtEmpPosition;
    private javax.swing.JTextField txtEmpUName;
    // End of variables declaration//GEN-END:variables

    private static void addEmployee(java.lang.String sql) {
        bankemployee.BankEmployee_Service service = new bankemployee.BankEmployee_Service();
        bankemployee.BankEmployee port = service.getBankEmployeePort();
        port.addEmployee(sql);
    }

}
