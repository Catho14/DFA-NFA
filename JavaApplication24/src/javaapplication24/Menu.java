/* 
******NOMBRE DEL ARCHIVO****** 
Menu
************MATERIA************ 
Lenguajes y autómatas I - A 
******NOMBRE DEL PROFESOR****** 
Hernandez Perez Roberto 
****INTEGRANTES DEL EQUIPO***** 
Cathi Huizache Carlos Alberto	18200749 
Olguin Cervantes Yitzaren 	18200777 
Sánchez Domínguez Natalia 	18200789 
**********DESCRIPCIÓN********** 

********FECHA DE ENTREGA******* 
11 de abril del 2021
*/

package javaapplication24;

public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DFA = new javax.swing.JButton();
        NFA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DFA.setBackground(new java.awt.Color(255, 255, 255));
        DFA.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DFA.setText("DFA");
        DFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFAActionPerformed(evt);
            }
        });
        getContentPane().add(DFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        NFA.setBackground(java.awt.SystemColor.controlLtHighlight);
        NFA.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NFA.setText("NFA");
        NFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NFAActionPerformed(evt);
            }
        });
        getContentPane().add(NFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication24/pngtree-abstract-polygonal-space-low-poly-dark-background-with-connecting-dots-and-image_337931.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFAActionPerformed
        DFA regresar=new DFA();
        regresar.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_DFAActionPerformed

    private void NFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NFAActionPerformed
        NFA regresar=new NFA();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NFAActionPerformed

    public static void main(String args[]) {
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DFA;
    private javax.swing.JButton NFA;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
