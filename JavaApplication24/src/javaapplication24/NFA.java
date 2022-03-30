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
El siguiente programa es sobre un DFA del lenguaje ∑= {0,1}, donde deberá cumplir la 
sentencia de L={w|w contenga pares de 1’s y pares de 0’s}.
********FECHA DE ENTREGA******* 
11 de abril del 2021
*/

package javaapplication24;

/**
 *
 * @author User
 */
public class NFA extends javax.swing.JFrame {

    /**
     * Creates new form NFA
     */
    public NFA() {
        initComponents();
    }
    //Declaración de variables
    char[] str;//Variable para guardar la cadena ingresada
    char start='0';//Variable del estado inicial
    char efinish='4';//Variable del estado final 1
    char efinish2='2';//Variable del estado final 2
    char actual=start;//Apuntador del inicio del ciclo
    boolean finish=false;//Variable para confirmar el comienzo de la validacion
    int cont=0;//Contador para ir recorriendo el arreglo de la cadena
    
   void ReiniciarVar(){
        start='0';
        efinish='4';
        efinish2='2';
        finish=false;
        cont=0;
        actual=start;
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cadena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        verificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NFA");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Proxy 2", 1, 12)); // NOI18N
        jLabel1.setText("Ingresar cadena a verificar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        cadena.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        getContentPane().add(cadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 270, 30));
        cadena.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Proxy 2", 1, 12)); // NOI18N
        jLabel2.setText("Estado de aceptación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        estado.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        verificar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        verificar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        verificar.setText("Verificar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        getContentPane().add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        limpiar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        limpiar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        Menu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Menu.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        salir.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        salir.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication24/NFA2.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Q=(q0,q1,q2,q3,q4)   ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, 20));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("L={w|w contenga pares de 1’s y pares de 0’s}");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 250, 20));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("F={q4}");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 100, 20));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("M=(Q,∑, q0, F, δ)  ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 20));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("∑=  {0,1}");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 100, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication24/fondo-papel-acuarela-blanco_88281-3969.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
    //Nos convierte el texto del textfield en un array
        str=cadena.getText().toCharArray();
        String ext=cadena.getText(); 
    //El ciclo verifica caracter por caracter de la cadena ingresada por medio 
    //de las transiciones entre cada estado
        while(finish==false){
            if(cont>str.length-1){
                finish=true;
                break;
            }
            //Estado Q0
            if(actual=='0'){
                if(str[cont]=='1'){ actual='3'; }
                if(str[cont]=='0'){ actual='1'; }
                cont++;
                continue;
            //Estado Q1   
            } if(actual=='1'){
                if(str[cont]=='1'){ actual='9'; break;  }
                if(str[cont]=='0'){ actual='2';   }
                cont++;
                continue;
            //Estado Q2    
            } if(actual=='2'){
                if(str[cont]=='1'){ actual='2';  }
                if(str[cont]=='0'){ actual='2';  }
                cont++;
                continue;
            //Estado Q3
            } if(actual=='3'){
                if(str[cont]=='1'){ actual='4';  }
                if(str[cont]=='0'){ actual='9'; break; }
                cont++;
                continue;
            //Estado Q4
            } if(actual=='4'){
                if(str[cont]=='1'){ actual='4';   }
                if(str[cont]=='0'){ actual='4';   }
                cont++;
                continue;
            }
        }
        //Finalmente, por medio del JLabel, imprime si la cadena es correcta o no mediante 
        //una comparativa del estado actual y el estado final
        if(actual==efinish || actual==efinish2){
            estado.setText("La cadena " + ext+ " si pertenece al L ={w|w contenga pares de 1’s y pares de 0’s}");
        }else{
           estado.setText("La cadena " + ext+ " no pertenece al L ={w|w contenga pares de 1’s y pares de 0’s}");
        }
        
        ReiniciarVar();
    }//GEN-LAST:event_verificarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Salir del programa
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // Regresar al menu
        Menu regresar=new Menu();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // Limpiar los label y textfield
        ReiniciarVar();
        cadena.setText("");
        estado.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(NFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NFA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JTextField cadena;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton salir;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}
