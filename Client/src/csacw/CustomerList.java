/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csacw;

import bankcustomer.Customer;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

/**
 *
 * @author Pavith Buddhima
 */
public class CustomerList extends javax.swing.JFrame {
    
    
    static List<bankcustomer.Customer> listOfCustomer = new ArrayList();
    
    /**
     * Creates new form CustomerList
     */
    public CustomerList() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        
        listOfCustomer = getAccounts();
//        displayCustomers();
        
        
        
        
        DefaultListModel<String> model = new DefaultListModel<>();
        

        
        
////        JList<String> list = new JList<>(  );
//
////        DefaultListModel listModel = new DefaultListModel();
////JList list = new JList(listModel);
//        
          System.out.println(listOfCustomer.size());

        for ( int i = 0; i < listOfCustomer.size(); i++ ){
            
          model.addElement("name:    "+listOfCustomer.get(i).getCusName()+" ------- account no:    "+listOfCustomer.get(i).getCusAccNo());
          
          
          System.out.println("hi");
            System.out.println(listOfCustomer.get(i).getCusName());
          

          
                  
        }
        cusListView.setModel(model);
////                     JList<Course> courseJList = new JList<>(courses);
//
//
//        
//        lstCusAcc = new JList(model);
//        lstCusAcc.show(true);
//                getContentPane().add(lstCusAcc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCusLst = new javax.swing.JLabel();
        pnlCusAcc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cusListView = new javax.swing.JList<>();
        lblMess1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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

        lblCusLst.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        lblCusLst.setText("Customer List");

        pnlCusAcc.setBorder(javax.swing.BorderFactory.createTitledBorder("Select A Customer Account"));

        cusListView.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        cusListView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusListViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cusListView);

        javax.swing.GroupLayout pnlCusAccLayout = new javax.swing.GroupLayout(pnlCusAcc);
        pnlCusAcc.setLayout(pnlCusAccLayout);
        pnlCusAccLayout.setHorizontalGroup(
            pnlCusAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        pnlCusAccLayout.setVerticalGroup(
            pnlCusAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCusAccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
        );

        lblMess1.setText("PRESS \"CREATE\" TO CREATE A NEW CUSTOMER ACCOUNT");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        mnuFile.setText("File");

        mnuitmCusLst.setText("Customer List");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lblCusLst, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lblMess1)
                        .addGap(8, 8, 8)
                        .addComponent(btnCreate)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCusAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCusLst, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCusAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMess1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCustomer createC = new CreateCustomer();
        createC.show(true);
        this.hide();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void mnuitmAccLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmAccLogoutActionPerformed
        Login login = new Login();
        this.hide();
        login.show();
    }//GEN-LAST:event_mnuitmAccLogoutActionPerformed

    private void mnuitmEmpLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmEmpLstActionPerformed
        EmployeeList employeeList = new EmployeeList();
        this.hide();
        employeeList.show();
    }//GEN-LAST:event_mnuitmEmpLstActionPerformed

    private void mnuitmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuitmExitActionPerformed

    private void cusListViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusListViewMouseClicked
        // TODO add your handling code here:
         int i = cusListView.getSelectedIndex();
         ManageCustomer manageCus = new ManageCustomer(listOfCustomer.get(i));
         this.hide();
         manageCus.show();
        
    }//GEN-LAST:event_cusListViewMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JList<String> cusListView;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCusLst;
    private javax.swing.JLabel lblMess1;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuMyAcc;
    private javax.swing.JMenuItem mnuitmAccLogin;
    private javax.swing.JMenuItem mnuitmAccLogout;
    private javax.swing.JMenuItem mnuitmCusLst;
    private javax.swing.JMenuItem mnuitmEmpLst;
    private javax.swing.JMenuItem mnuitmExit;
    private javax.swing.JPanel pnlCusAcc;
    // End of variables declaration//GEN-END:variables



    
    
    
    
    
        public void displayCustomers() {
        pnlCusAcc.setLayout(new GridLayout(0, 3));
        JLabel lblName = new JLabel("Name");
        lblName.setForeground(Color.black);
        lblName.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblName.setBorder(BorderFactory.createLineBorder(Color.white));
        JLabel lblAccNumber = new JLabel("Account Number");
        lblAccNumber.setForeground(Color.BLACK);
        lblAccNumber.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblAccNumber.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        JLabel lblManage = new JLabel("");
        lblManage.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        pnlCusAcc.add(lblName);
        pnlCusAcc.add(lblAccNumber);
        pnlCusAcc.add(lblManage);
        JButton[] buttons = new JButton[listOfCustomer.size()];
        JLabel[] nameLabels = new JLabel[listOfCustomer.size()];
        JLabel[] accNumberLabels = new JLabel[listOfCustomer.size()];
        for (int i = 0; i < listOfCustomer.size(); i++) {
            buttons[i] = new JButton();
            nameLabels[i] = new JLabel(listOfCustomer.get(i).getCusName());
            accNumberLabels[i] = new JLabel(listOfCustomer.get(i).getCusAccNo());
            buttons[i].setText("Manage");
            buttons[i].setFont(new Font("Roboto", Font.PLAIN, 18));
            buttons[i].setBorder(BorderFactory.createLineBorder(Color.WHITE));
            nameLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            accNumberLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            Customer tempCust = listOfCustomer.get(i);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    new ManageCustomer(tempCust).setVisible(true);
                }
            });
            nameLabels[i].setForeground(Color.BLACK);
            nameLabels[i].setFont(new Font("Roboto", Font.PLAIN, 18));
            nameLabels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            accNumberLabels[i].setForeground(Color.BLACK);
            accNumberLabels[i].setFont(new Font("Roboto", Font.PLAIN, 18));
            accNumberLabels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pnlCusAcc.add(nameLabels[i]);
            pnlCusAcc.add(accNumberLabels[i]);
            pnlCusAcc.add(buttons[i]);
        }
        add(pnlCusAcc);
        pnlCusAcc.revalidate();
        pnlCusAcc.repaint();
    }

    private static java.util.List<bankcustomer.Customer> getAccounts() {
        bankcustomer.BankCustomer_Service service = new bankcustomer.BankCustomer_Service();
        bankcustomer.BankCustomer port = service.getBankCustomerPort();
        return port.getAccounts();
    }

 








  

 




    
    
}
