/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryreception.view;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import laundrycommon.ServerConnector;
import laundrycommon.controller.CustomerController;
import laundrycommon.controller.MembershipController;
import laundrycommon.model.Customer;
import laundrycommon.model.Member;
import laundrycommon.model.MembershipType;
import laundryserver.idgenarate.IDGenarate;
import org.omg.CORBA.portable.RemarshalException;

/**
 *
 * @author insaf
 */
public class AddMemberDialog extends javax.swing.JDialog {

    ServerConnector serverConnector;
    MembershipController membershipController;
    DefaultTableModel dtm;
    CustomerController customerController;

    /**
     * Creates new form Member
     */
    public AddMemberDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getMemberID();

        try {
            serverConnector = ServerConnector.getServerConnector();
            membershipController = serverConnector.getMemberShipController();
            customerController = serverConnector.getCustomerController();
            dtm = (DefaultTableModel) addMemberShipTypeTable.getModel();
            getMemberShipTypes();
        } catch (NotBoundException ex) {
            Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        telField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        addMemberShipTypeTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        memberID = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member", 0, 0, null, new java.awt.Color(0, 153, 153)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, null, new java.awt.Color(0, 153, 153)));

        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameFieldKeyReleased(evt);
            }
        });

        telField.setText("0");
        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });
        telField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telFieldKeyReleased(evt);
            }
        });

        jLabel2.setText("Tel:");

        jLabel1.setText("Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, null, new java.awt.Color(0, 204, 204)));

        addMemberShipTypeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "In MemberShip Type", "Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        addMemberShipTypeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMemberShipTypeTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(addMemberShipTypeTable);
        addMemberShipTypeTable.getColumnModel().getColumn(0).setMinWidth(20);
        addMemberShipTypeTable.getColumnModel().getColumn(0).setMaxWidth(20);
        addMemberShipTypeTable.getColumnModel().getColumn(1).setPreferredWidth(80);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveButton)
        );

        memberID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(memberID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(memberID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (nameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Insert Name");
        } else {
            String cid = memberID.getText();
            String customerName = nameField.getText();

            String telNo = telField.getText().substring(1);


            Customer customer = new Customer(cid, customerName, telNo);
            try {
                boolean res = customerController.addCustomer(customer);
                if (res) {
                    JOptionPane.showMessageDialog(this, "Done");
                    int selectedRow = addMemberShipTypeTable.getSelectedRow();
                    
                    String customerID = memberID.getText();
                    String code = dtm.getValueAt(selectedRow, 2).toString();
                    
                    Member member = new Member(customerID, code);

                    getMemberID();

                } else {
                    JOptionPane.showMessageDialog(this, "Not Done");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void telFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telFieldKeyReleased
        if (telField.getText().isEmpty()) {
            telField.setText("0");
        }

        String tel = telField.getText();
        int i = tel.length();
        if (i > 10) {
            int index = tel.length();
            String cTel = tel.substring(0, index - 1);
            telField.setText(cTel);
            telField.requestFocus();
        }

        try {
            Long.parseLong(tel);
        } catch (NumberFormatException e) {
            try {
                int index = tel.length();
                String cTel = tel.substring(0, index - 1);
                telField.setText(cTel);
                telField.requestFocus();

            } catch (StringIndexOutOfBoundsException ex) {
                ex.getMessage();
            }

        }

    }//GEN-LAST:event_telFieldKeyReleased

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFieldActionPerformed

    private void nameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telField.requestFocus();
        }

    }//GEN-LAST:event_nameFieldKeyReleased

    private void addMemberShipTypeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMemberShipTypeTableMouseClicked
        int selectedRow = addMemberShipTypeTable.getSelectedRow();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String valueAt = dtm.getValueAt(i, 0).toString();
            if (i != selectedRow) {
                dtm.setValueAt(false, i, 0);
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addMemberShipTypeTableMouseClicked

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
            java.util.logging.Logger.getLogger(AddMemberDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMemberDialog dialog = new AddMemberDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addMemberShipTypeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel memberID;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables

    private void getMemberShipTypes() {
        try {
            dtm.setRowCount(0);
            ArrayList<MembershipType> memberShipTypes = membershipController.getMemberShipTypes();
            for (MembershipType memberShipType : memberShipTypes) {
                Object[] rows = {false, memberShipType.getMt(), memberShipType.getType()};
                dtm.addRow(rows);
            }
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(MemberShip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberShip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getMemberID() {
        try {
            String prefix = "C";
            String coloumn = "cid";
            String table = "customer";
            IDGenarate.nextID(memberID, prefix, coloumn, table);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMemberDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
