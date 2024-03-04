/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teoria_1_proyecto;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rinal
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        //DB_Manager db = new DB_Manager();
        db.crearConexion();
        db.crearTablas();
        //db.HacerConsulta("select id from users");
        CambiarPantallaTiempo CPT = new CambiarPantallaTiempo(Portadita, this, 4000);
        CPT.start();
        JF_enVenta.show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Portadita = new javax.swing.JFrame();
        JP_Portada = new FondoPanel("./Imagen\\beinvenida.jpeg");
        JL_Welcome = new javax.swing.JLabel();
        JF_Agentes = new javax.swing.JFrame();
        JB_CrearAgente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        JF_Compradores = new javax.swing.JFrame();
        JB_CrearComprador = new javax.swing.JButton();
        JF_Vendedor = new javax.swing.JFrame();
        JB_CrearVendedor = new javax.swing.JButton();
        JF_Vendidas = new javax.swing.JFrame();
        JB_CrearPropiedadEVendida = new javax.swing.JButton();
        JF_enVenta = new javax.swing.JFrame();
        JB_crearVenta = new javax.swing.JButton();

        Portadita.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Portadita.setUndecorated(true);

        JP_Portada.setBackground(new java.awt.Color(255, 51, 51));
        JP_Portada.setForeground(new java.awt.Color(255, 153, 153));

        JL_Welcome.setBackground(new java.awt.Color(162, 210, 255));
        JL_Welcome.setFont(new java.awt.Font("Montserrat Thin", 1, 70)); // NOI18N
        JL_Welcome.setForeground(new java.awt.Color(255, 255, 255));
        JL_Welcome.setText("Welcome!");

        javax.swing.GroupLayout JP_PortadaLayout = new javax.swing.GroupLayout(JP_Portada);
        JP_Portada.setLayout(JP_PortadaLayout);
        JP_PortadaLayout.setHorizontalGroup(
            JP_PortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PortadaLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(JL_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        JP_PortadaLayout.setVerticalGroup(
            JP_PortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_PortadaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(JL_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PortaditaLayout = new javax.swing.GroupLayout(Portadita.getContentPane());
        Portadita.getContentPane().setLayout(PortaditaLayout);
        PortaditaLayout.setHorizontalGroup(
            PortaditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Portada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PortaditaLayout.setVerticalGroup(
            PortaditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Portada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JB_CrearAgente.setText("Crear Agente");
        JB_CrearAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_CrearAgenteMouseClicked(evt);
            }
        });

        jButton2.setText("Modificar Agente");

        jButton3.setText("Borrar Agente");

        jButton4.setText("Ver Agentes");

        jButton5.setText("Buscar Agente");

        javax.swing.GroupLayout JF_AgentesLayout = new javax.swing.GroupLayout(JF_Agentes.getContentPane());
        JF_Agentes.getContentPane().setLayout(JF_AgentesLayout);
        JF_AgentesLayout.setHorizontalGroup(
            JF_AgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_AgentesLayout.createSequentialGroup()
                .addGroup(JF_AgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JF_AgentesLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(JB_CrearAgente))
                    .addGroup(JF_AgentesLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton2))
                    .addGroup(JF_AgentesLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(JF_AgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton5))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        JF_AgentesLayout.setVerticalGroup(
            JF_AgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_AgentesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(JB_CrearAgente)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        JB_CrearComprador.setText("Crear Comprador");
        JB_CrearComprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_CrearCompradorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JF_CompradoresLayout = new javax.swing.GroupLayout(JF_Compradores.getContentPane());
        JF_Compradores.getContentPane().setLayout(JF_CompradoresLayout);
        JF_CompradoresLayout.setHorizontalGroup(
            JF_CompradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_CompradoresLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(JB_CrearComprador)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        JF_CompradoresLayout.setVerticalGroup(
            JF_CompradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_CompradoresLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JB_CrearComprador)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        JB_CrearVendedor.setText("Crear Vendedor");
        JB_CrearVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_CrearVendedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JF_VendedorLayout = new javax.swing.GroupLayout(JF_Vendedor.getContentPane());
        JF_Vendedor.getContentPane().setLayout(JF_VendedorLayout);
        JF_VendedorLayout.setHorizontalGroup(
            JF_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JF_VendedorLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(JB_CrearVendedor)
                .addGap(150, 150, 150))
        );
        JF_VendedorLayout.setVerticalGroup(
            JF_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_VendedorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(JB_CrearVendedor)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        JB_CrearPropiedadEVendida.setText("Crear Propiedad Vendida");
        JB_CrearPropiedadEVendida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_CrearPropiedadEVendidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JF_VendidasLayout = new javax.swing.GroupLayout(JF_Vendidas.getContentPane());
        JF_Vendidas.getContentPane().setLayout(JF_VendidasLayout);
        JF_VendidasLayout.setHorizontalGroup(
            JF_VendidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_VendidasLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(JB_CrearPropiedadEVendida)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        JF_VendidasLayout.setVerticalGroup(
            JF_VendidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_VendidasLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(JB_CrearPropiedadEVendida)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        JB_crearVenta.setText("Crear propiedad en venta");
        JB_crearVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_crearVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JF_enVentaLayout = new javax.swing.GroupLayout(JF_enVenta.getContentPane());
        JF_enVenta.getContentPane().setLayout(JF_enVentaLayout);
        JF_enVentaLayout.setHorizontalGroup(
            JF_enVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_enVentaLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(JB_crearVenta)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        JF_enVentaLayout.setVerticalGroup(
            JF_enVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_enVentaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(JB_crearVenta)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_CrearAgenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_CrearAgenteMouseClicked
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el id", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el nombre", JOptionPane.QUESTION_MESSAGE);
        String dir = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la dir", JOptionPane.QUESTION_MESSAGE);
        String cel = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el cel", JOptionPane.QUESTION_MESSAGE);
        String telOf = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el teloficina", JOptionPane.QUESTION_MESSAGE);

        char[] nombreChar = nombre.toCharArray();
        char[] dirChar = dir.toCharArray();
        int celInt = Integer.parseInt(cel);
        int telofInt = Integer.parseInt(telOf);
        char[] idChar = id.toCharArray();

        String vista = "INSERT INTO agentes VALUES ('" + new String(idChar) + "','" + new String(nombreChar) + "','" + new String(dirChar) + "'," + celInt + ",'" + telOf + "')";
        
        db.HacerConsulta(vista);
    }//GEN-LAST:event_JB_CrearAgenteMouseClicked

    private void JB_CrearCompradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_CrearCompradorMouseClicked
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el id", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el nombre", JOptionPane.QUESTION_MESSAGE);
        String dir = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la dir", JOptionPane.QUESTION_MESSAGE);
        String cel = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el cel", JOptionPane.QUESTION_MESSAGE);
        
        char[] nombreChar = nombre.toCharArray();
        char[] dirChar = dir.toCharArray();
        int celInt = Integer.parseInt(cel);
        char[] idChar = id.toCharArray();

        String vista = "INSERT INTO compradores VALUES ('" + new String(idChar) + "','" + new String(nombreChar) + "','" + new String(dirChar) + "'," + celInt + ")";
        db.HacerConsulta(vista);
    }//GEN-LAST:event_JB_CrearCompradorMouseClicked

    private void JB_CrearVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_CrearVendedorMouseClicked
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el id", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el nombre", JOptionPane.QUESTION_MESSAGE);
        String dir = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la dir", JOptionPane.QUESTION_MESSAGE);
        String cel = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el cel", JOptionPane.QUESTION_MESSAGE);
        
        char[] nombreChar = nombre.toCharArray();
        char[] dirChar = dir.toCharArray();
        int celInt = Integer.parseInt(cel);
        char[] idChar = id.toCharArray();

        String vista = "INSERT INTO vendedores VALUES ('" + new String(idChar) + "','" + new String(nombreChar) + "','" + new String(dirChar) + "'," + celInt + ")";
        db.HacerConsulta(vista);
    }//GEN-LAST:event_JB_CrearVendedorMouseClicked

    private void JB_CrearPropiedadEVendidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_CrearPropiedadEVendidaMouseClicked
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el id", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el nombre", JOptionPane.QUESTION_MESSAGE);
        String dir = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la dir", JOptionPane.QUESTION_MESSAGE);
        String ciudad = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la ciudad", JOptionPane.QUESTION_MESSAGE);
        String cantDormitorios = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la cantidad de dormitorios", JOptionPane.QUESTION_MESSAGE);
        String caracteristicas = JOptionPane.showInputDialog(JF_Agentes, "Ingrese las caracteristicas", JOptionPane.QUESTION_MESSAGE);
        String precio = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el precio", JOptionPane.QUESTION_MESSAGE);
        String fechaPublicacion =JOptionPane.showInputDialog(JF_Agentes, "Ingrese la fecha de publicacion", JOptionPane.QUESTION_MESSAGE);
        String fechaVenta = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la fecha de la venta", JOptionPane.QUESTION_MESSAGE);
        String numeroIdentidadA=JOptionPane.showInputDialog(JF_Agentes, "Ingrese el numero de identidad del agente", JOptionPane.QUESTION_MESSAGE);
        String numeroIdentidadV = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el numero de identidad de el vendedor", JOptionPane.QUESTION_MESSAGE);
        String numeroIdentidadC = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el numero de identidad del comprador", JOptionPane.QUESTION_MESSAGE);
        String comision = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la comision", JOptionPane.QUESTION_MESSAGE);
        
        String vista = "INSERT INTO propiedades_vendidas VALUES ('" + id + "','" + nombre + "','" + ciudad + "','" + dir + "','" + cantDormitorios + "','" + caracteristicas + "','" + precio + "','" + fechaPublicacion + "','" + fechaVenta + "','" + numeroIdentidadA + "','" + numeroIdentidadV + "','" + numeroIdentidadC + "','" + comision + "')";
        db.HacerConsulta(vista);
    }//GEN-LAST:event_JB_CrearPropiedadEVendidaMouseClicked

    private void JB_crearVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_crearVentaMouseClicked
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el id", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el nombre", JOptionPane.QUESTION_MESSAGE);
        String dir = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la dir", JOptionPane.QUESTION_MESSAGE);
        String ciudad = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la ciudad", JOptionPane.QUESTION_MESSAGE);
        String cantDormitorios = JOptionPane.showInputDialog(JF_Agentes, "Ingrese la cantidad de dormitorios", JOptionPane.QUESTION_MESSAGE);
        String caracteristicas = JOptionPane.showInputDialog(JF_Agentes, "Ingrese las caracteristicas", JOptionPane.QUESTION_MESSAGE);
        String precio = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el precio", JOptionPane.QUESTION_MESSAGE);
        String fechaPublicacion =JOptionPane.showInputDialog(JF_Agentes, "Ingrese la fecha de publicacion", JOptionPane.QUESTION_MESSAGE);
        String numeroIdentidadA=JOptionPane.showInputDialog(JF_Agentes, "Ingrese el numero de identidad del agente", JOptionPane.QUESTION_MESSAGE);
        String numeroIdentidadV = JOptionPane.showInputDialog(JF_Agentes, "Ingrese el numero de identidad de el vendedor", JOptionPane.QUESTION_MESSAGE);
        String vista = "INSERT INTO propiedades_en_mercado VALUES ('" + id + "','" + nombre + "','" + ciudad + "','" + dir + "','" + cantDormitorios + "','" + caracteristicas + "','" + precio + "','" + fechaPublicacion + "','" + numeroIdentidadA + "','" + numeroIdentidadV+ "')";
        db.HacerConsulta(vista);
    }//GEN-LAST:event_JB_crearVentaMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_CrearAgente;
    private javax.swing.JButton JB_CrearComprador;
    private javax.swing.JButton JB_CrearPropiedadEVendida;
    private javax.swing.JButton JB_CrearVendedor;
    private javax.swing.JButton JB_crearVenta;
    private javax.swing.JFrame JF_Agentes;
    private javax.swing.JFrame JF_Compradores;
    private javax.swing.JFrame JF_Vendedor;
    private javax.swing.JFrame JF_Vendidas;
    private javax.swing.JFrame JF_enVenta;
    private javax.swing.JLabel JL_Welcome;
    private javax.swing.JPanel JP_Portada;
    private javax.swing.JFrame Portadita;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables

 //Variables globales
    DB_Manager db = new DB_Manager();


//Este metodo es para reproducir sonidos en el programa
    public static Clip playMusic(String filepath) {
        try {
            File music = new File(filepath);
            AudioInputStream AudioImput = AudioSystem.getAudioInputStream(music);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioImput);
            return clip;
        } catch (Exception e) {
            System.out.println("El Archivo no Existe");
            e.printStackTrace();
        }
        return null;
    }

    //--------------------------
    //Esta Clase se utiliza para Poner Imagenes dentro de paneles
    class FondoPanel extends JPanel {

        public FondoPanel(String direccion) {
            this.direccion = direccion;
        }

        private String direccion;
        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(direccion).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
