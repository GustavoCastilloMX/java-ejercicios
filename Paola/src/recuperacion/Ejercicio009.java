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
public class Ejercicio009 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio009
     */
    public Ejercicio009() {
        initComponents();
    }
    
    /*
    Determinar a qué lugar podrá ir de vacaciones una persona, considerando que
    la línea de autobuses “La tortuga” cobra por kilómetro recorrido. Se debe 
    considerar el costo del pasaje tanto de ida, como de vuelta; los datos que
    se conocen y que son fijos son: México, 750 km; P.V., 800 km; Acapulco, 
    1200 km, y Cancún, 1800 km. También se debe considerar la posibilidad de 
    tener que quedarse en casa. 
    */
    
    //Metodos
    public float costoViajeMexico(float costoKm){
        float costoMexico = (costoKm * 750) * 2;
        return costoMexico;
    }
    
    public float costoViajePV(float costoKm){
        float costoPV = (costoKm * 800) * 2;
        return costoPV;
    }
    
    public float costoViajeAcapulco(float costoKm){
        float costoAcapulco = (costoKm * 1200) * 2;
        return costoAcapulco;
    }
    
    public float costoViajeCancun(float costoKm){
        float costoCancun = (costoKm * 1800) * 2;
        return costoCancun;
    }
    
    public void decidirLugar(float costoKm, float presupuesto){
        
        String mensaje = "";
        
        if(presupuesto >= costoViajeCancun(costoKm)){
            mensaje = "Puedes viajar a Cancún";
        }
        else if(presupuesto >= costoViajeAcapulco(costoKm)){
            mensaje = "Puedes viajar a Acapulco";
        }
        else if(presupuesto >= costoViajePV(costoKm)){
            mensaje = "Puedes viajar a Puerto Vallarta";
        }
        else if(presupuesto >= costoViajeMexico(costoKm)){
            mensaje = "Puedes viajar a México";
        }
        else{
            mensaje = "Presupuesto insuficiente, disfruta de tu hogar";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
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
        jLabel3 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        txtPresupuesto = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calcular a donde viajar con tu presupuesto:");

        jLabel2.setText("Costo por km: $");

        jLabel3.setText("Presupuesto: $");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnCalcular)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        float costoKM = Float.parseFloat(txtCosto.getText().toString());
        float prespuesto = Float.parseFloat(txtPresupuesto.getText().toString());
        
        decidirLugar(costoKM, prespuesto);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio009().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtPresupuesto;
    // End of variables declaration//GEN-END:variables
}
