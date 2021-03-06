/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class Ejercicio006 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio006
     */
    public Ejercicio006() {
        initComponents();
    }

    /*
    El presidente de la república ha decidido estimular a todos los estudiantes
    de una universidad mediante la asignación de becas mensuales, para esto se
    tomarán en consideración los siguientes criterios: Para alumnos mayores de
    18 años con promedio mayor o igual a 9, la beca será de $2000.00; con
    promedio mayor o igual a 7.5, de $1000.00; para los promedios menores de 
    7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará
    una carta de invitación incitándolos a que estudien más en el próximo ciclo
    escolar. A los alumnos de 18 años o menores de esta edad, con promedios
    mayores o iguales a 9, se les dará $3000; con promedios menores a 9 pero
    mayores o iguales a 8, $2000; para los alumnos con promedios menores a 8
    pero mayores o iguales a 6, se les dará $100, y a los alumnos que tengan
    promedios menores a 6 se les enviará carta de invitación. 
    */
    
    //Metodos
    
    public String becaMayores(float promedio){
        
        String mensaje="";
        
        if (promedio >= 9 ){
            mensaje="Es acreedor a una beca de $2,000.00 MXN";
        }
        else if (promedio >= 7.5){
            mensaje="Es acreedor a una beca de $1,000.00 MXN";
        }
        else if (promedio >= 6){
            mensaje="Es acreedor a una beca de $500.00 MXN";
        }
        else{
            mensaje="Se te invita a estudiar más en el próximo ciclo escolar,"
                    + " para que seas acreedor a una beca.";
        }
        
        return mensaje;
    }
    
    public String becaMenores(float promedio){
        
        String mensaje = "";
        
        if (promedio >= 9 ){
            mensaje = "Es acreedor a una beca de $3,000.00 MXN";
        }
        else if (promedio >=8){
            mensaje = "Es acreedor a una beca de $2,000.00 MXN";
        }
        else if (promedio >= 6){
            mensaje = "Es acreedor a una beca de $100.00 MXN";
        }
        else{
            mensaje = "Se te invita a estudiar más en el próximo ciclo escolar,"
                    + " para que seas acreedor a una beca.";
        }
        
        return mensaje;
    }
    
    public String elegirBeca(int edad, float promedio){
        
        String mensaje = "";
        
        if (edad > 18) mensaje = becaMayores(promedio);
        else mensaje = becaMenores(promedio);
        
        return mensaje;
    }
    
    public void asignarBeca(int edad, float promedio){
        
        JOptionPane.showMessageDialog(null, elegirBeca(edad, promedio));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spnPromedio = new javax.swing.JSpinner();
        btnAsignarBeca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Asignación de becas:");

        jLabel2.setText("Edad:");

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        jLabel3.setText("Promedio:");

        spnPromedio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(0.1f)));

        btnAsignarBeca.setText("Asignar Beca");
        btnAsignarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarBecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAsignarBeca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(spnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignarBeca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarBecaActionPerformed
        
        int edad = Integer.parseInt(spnEdad.getValue().toString());
        float promedio = Float.parseFloat(spnPromedio.getValue().toString());
        
        asignarBeca(edad, promedio);
        
    }//GEN-LAST:event_btnAsignarBecaActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio006.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio006.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio006.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio006.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio006().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarBeca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnPromedio;
    // End of variables declaration//GEN-END:variables
}
