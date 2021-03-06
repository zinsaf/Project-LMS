/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrytagging.view;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import laundrytagging.view.Recieve;

/**
 *
 * @author insaf
 */
public class MainFrame extends javax.swing.JFrame {

    Timer timer;
    int i = 1;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        addDesktop();
        new Timer(1, new ClockListener()).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        timeField = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        taggingButton = new javax.swing.JButton();
        reciveButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        viewLounderyButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        viewLounderyButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tagging System");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        taggingButton.setText("    Tagging");
        taggingButton.setContentAreaFilled(false);
        taggingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        taggingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taggingButtonActionPerformed(evt);
            }
        });

        reciveButton.setText("    Packaging");
        reciveButton.setContentAreaFilled(false);
        reciveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reciveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciveButtonActionPerformed(evt);
            }
        });

        searchButton.setText("   Search");
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        viewLounderyButton.setText("    View ");
        viewLounderyButton.setContentAreaFilled(false);
        viewLounderyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewLounderyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLounderyButtonActionPerformed(evt);
            }
        });

        exitButton.setText("  LogOut");
        exitButton.setContentAreaFilled(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        viewLounderyButton1.setText("Shift");
        viewLounderyButton1.setContentAreaFilled(false);
        viewLounderyButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewLounderyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLounderyButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taggingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reciveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(viewLounderyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewLounderyButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exitButton, reciveButton, searchButton, viewLounderyButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(taggingButton)
                .addGap(0, 0, 0)
                .addComponent(reciveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewLounderyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewLounderyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {exitButton, reciveButton, searchButton, taggingButton, viewLounderyButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(787, 787, 787))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taggingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taggingButtonActionPerformed
        mainPanel.removeAll();
        Dimension dimension = mainPanel.getSize();
        Tagging orderForm = new Tagging();
        orderForm.setSize(dimension);
        mainPanel.add(orderForm);
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_taggingButtonActionPerformed

    private void reciveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciveButtonActionPerformed
        mainPanel.removeAll();
        Dimension dimension = mainPanel.getSize();
        Recieve recive = new Recieve();
        recive.setSize(dimension);
        mainPanel.add(recive);
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_reciveButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String kk = JOptionPane.showInputDialog(this, "Please Enter The Barcode...");
        if (kk != null) {
            SearchItem searchItem = new SearchItem(this, true);
            searchItem.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void viewLounderyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLounderyButtonActionPerformed
        mainPanel.removeAll();
        Dimension dimension = mainPanel.getSize();
        ViewLaundry viewLoundery = new ViewLaundry();
        viewLoundery.setSize(dimension);
        mainPanel.add(viewLoundery);
        javax.swing.SwingUtilities.updateComponentTreeUI(this);  // TODO add your handling code here:
    }//GEN-LAST:event_viewLounderyButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are You Sure You Want Exit ?");
        if (i == 0) {
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void viewLounderyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLounderyButton1ActionPerformed
        mainPanel.removeAll();
        Dimension dimension = mainPanel.getSize();
        Desktop desktop = new Desktop();
        desktop.setSize(dimension);
        mainPanel.add(desktop);
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_viewLounderyButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        try {
//            /* Set the Nimbus look and feel */
//            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//             */
//            UIManager.setLookAndFeel(new AeroLookAndFeel());
//            //</editor-fold>
//        } catch (UnsupportedLookAndFeelException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton reciveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton taggingButton;
    private javax.swing.JLabel timeField;
    private javax.swing.JButton viewLounderyButton;
    private javax.swing.JButton viewLounderyButton1;
    // End of variables declaration//GEN-END:variables

    private void addDesktop() {
//        mainPanel.removeAll();
//        Dimension dimension = mainPanel.getSize();
//        Desktop desktop=new Desktop();
//        desktop.setSize(dimension);
//        mainPanel.add(desktop);
//        javax.swing.SwingUtilities.updateComponentTreeUI(this); 
    }

    class ClockListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String amPm = "";
            Calendar now = Calendar.getInstance();
            int h = now.get(Calendar.HOUR);
            int m = now.get(Calendar.MINUTE);
            int s = now.get(Calendar.SECOND);
            int ap = now.get(Calendar.AM_PM);
            if (ap == 1) {
                String pm = "PM";
                amPm = pm;
            } else {
                String am = "AM";
                amPm = am;
            }



            //int ms = now.get(Calendar.MILLISECOND);
            int d = now.get(Calendar.DATE);
            int mo = now.get(Calendar.MONTH);
            int y = now.get(Calendar.YEAR);




            timeField.setText("" + h + ":" + m + ":" + s + " " + amPm + " ");
            timeField.setBackground(Color.BLACK);
            timeField.setForeground(Color.red);
            //timeField.setText(String.format("%1$tH:%1$tM:%1$tS", now));

        }
    }
}
