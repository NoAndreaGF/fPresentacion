/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import datos.UsuariosDatos;
import clasesfaceboot.Usuario;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FrmRegistrar extends javax.swing.JFrame {

    UsuariosDatos ctrl = new UsuariosDatos();
    
    /**
     * Creates new form PantallaRegistrar
     */
    public FrmRegistrar() {
        initComponents();
        setLocationRelativeTo(null);
//        System.err.println("Usuarios: " + this.ctrl.toString());

    }

    public FrmRegistrar(UsuariosDatos ctrl) {
        initComponents();
        setLocationRelativeTo(null);
        this.ctrl = ctrl;
//        System.err.println("Usuarios: " + this.ctrl.toString());
    }

    public int calcularEdad() {
        Date fecha = txtDate.getDate();
                
        LocalDate localDate = Instant.ofEpochMilli(fecha.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate hoy = LocalDate.now();
        Period diff1 = Period.between(localDate, hoy);
        return diff1.getYears();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGSexo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        pwdContrasenia = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbtFem = new javax.swing.JRadioButton();
        rbtMas = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnFace = new javax.swing.JButton();
        btnGoogle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrate");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setText("Nombre");
        txtNombre.setToolTipText("Nombre");
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        pwdContrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdContrasenia.setText("Contraseña");
        pwdContrasenia.setToolTipText("Contraseña");
        pwdContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdContraseniaFocusLost(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(95, 184, 45));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrate_Nom.png"))); // NOI18N
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrate_Press.png"))); // NOI18N
        btnRegistrarse.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrate_Roll.png"))); // NOI18N
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setText("Correo Electrónico");
        txtEmail.setToolTipText("Correo Electrónico");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTel.setText("Número telefónico");
        txtTel.setToolTipText("Número telefónico");
        txtTel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelFocusLost(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        txtEdad.setEditable(false);
        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEdad.setToolTipText("Edad");
        txtEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sexo");

        btnGSexo.add(rbtFem);
        rbtFem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtFem.setText("Femenino");
        rbtFem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGSexo.add(rbtMas);
        rbtMas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtMas.setText("Masculino");
        rbtMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Regístrate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Regístrate con...");

        btnFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonface_Nom.png"))); // NOI18N
        btnFace.setBorder(null);
        btnFace.setBorderPainted(false);
        btnFace.setContentAreaFilled(false);
        btnFace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFace.setFocusPainted(false);
        btnFace.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonface_Press.png"))); // NOI18N
        btnFace.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonface_Roll.png"))); // NOI18N

        btnGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonGoogle_Nom.png"))); // NOI18N
        btnGoogle.setBorder(null);
        btnGoogle.setBorderPainted(false);
        btnGoogle.setContentAreaFilled(false);
        btnGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoogle.setFocusPainted(false);
        btnGoogle.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonGoogle_Pres.png"))); // NOI18N
        btnGoogle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonGoogle_roll.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdContrasenia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54))
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbtFem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtMas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnGoogle)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFace)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnRegistrarse)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFem)
                    .addComponent(rbtMas))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarse)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGoogle)
                    .addComponent(btnFace))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        String nombre = txtNombre.getText().trim();
        if (nombre.equals("Nombre")) {
            txtNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombre = txtNombre.getText().trim().toLowerCase();
        if (nombre.isEmpty()) {
            txtNombre.setText("Nombre");
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        String email = txtEmail.getText().trim();
        if (email.equals("Correo Electrónico")) {
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String email = txtEmail.getText().trim().toLowerCase();
        if (email.isEmpty()) {
            txtEmail.setText("Correo Electrónico");
        }
        else {
            Pattern pattern = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            Matcher mather = pattern.matcher(email);

            if (mather.find() == false) {
                JOptionPane.showMessageDialog(null, "El email ingresado es inválido.",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                txtEmail.setText("Correo Electrónico");
            }           
            
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelFocusGained
        String tel = txtTel.getText().trim();
        if (tel.equals("Número telefónico")) {
            txtTel.setText("");
        }
    }//GEN-LAST:event_txtTelFocusGained

    private void txtTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelFocusLost
        String tel = txtTel.getText().trim();
        if (tel.isEmpty()) {
            txtTel.setText("Número telefónico");
        }
    }//GEN-LAST:event_txtTelFocusLost

    private void pwdContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdContraseniaFocusGained
        String contrasenia = pwdContrasenia.getText().trim();
        if (contrasenia.equals("Contraseña")) {
            pwdContrasenia.setText("");
        }
    }//GEN-LAST:event_pwdContraseniaFocusGained

    private void pwdContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdContraseniaFocusLost
        String contrasenia = pwdContrasenia.getText().trim();
        if (contrasenia.isEmpty()) {
            pwdContrasenia.setText("Contraseña");
        }
    }//GEN-LAST:event_pwdContraseniaFocusLost

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String nombre = txtNombre.getText().trim().toLowerCase();
        String email = txtEmail.getText().trim().toLowerCase();
        char contra[] = pwdContrasenia.getPassword();
        String contraLib = new String(contra);
        String telefono = txtTel.getText().trim();
        String sexo = "";
        Date fecha = txtDate.getDate();
        
        if (rbtFem.isSelected()) {
            sexo = "Femenino";
        }
        else if (rbtMas.isSelected()) {
            sexo = "Masculino";
        }

        if (!(fecha == null) && !(sexo.isEmpty())
                && !(nombre.equalsIgnoreCase("Nombre"))
                && !(email.equalsIgnoreCase("Correo Electrónico"))
                && !(contraLib.equalsIgnoreCase("Contraseña"))
                && !(telefono.equalsIgnoreCase("Número telefónico"))) {
            if (calcularEdad() >= 18) {
                if (!ctrl.existente(email)) {

                    Usuario u = new Usuario(nombre, email, contraLib, telefono, sexo, fecha, calcularEdad());
                    ctrl.add(u);
//            FrmInicio frmInicio = new FrmInicio();
//            frmInicio.setVisible(true);

                    new FrmIniciarSesion(ctrl).setVisible(true);
                    this.dispose();
                    
                    JOptionPane.showMessageDialog(null, "Registro exitoso\n",
                            "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Usuario ya registrado",
                            "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Edad no valida",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "Datos incompletos",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        Date fecha = txtDate.getDate();
        if (!(fecha == null)) {
            txtEdad.setText(String.valueOf(calcularEdad()));
        }        
    }//GEN-LAST:event_jPanel2MouseMoved

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
        }
    }//GEN-LAST:event_txtTelKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFace;
    private javax.swing.ButtonGroup btnGSexo;
    private javax.swing.JButton btnGoogle;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField pwdContrasenia;
    private javax.swing.JRadioButton rbtFem;
    private javax.swing.JRadioButton rbtMas;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
