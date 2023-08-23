
package Inventario;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inventario extends javax.swing.JFrame {

    private final Producto[] productos;
    private final int[][] inventario;

    private static final int PRODUCTOS_MAXIMOS = 1000;

    public Inventario() {
        initComponents();
        this.setTitle("Sistema Combate Artes Marciales");
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/Logo.jpg"));
        this.setIconImage(img);
        lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);

        productos = new Producto[PRODUCTOS_MAXIMOS];
        inventario = new int[PRODUCTOS_MAXIMOS][1];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblIdProducto = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        lblSerieProducto = new javax.swing.JLabel();
        lblValorProducto = new javax.swing.JLabel();
        lblProveedorProducto = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtSerieProducto = new javax.swing.JTextField();
        txtValorProducto = new javax.swing.JTextField();
        txtProveedorProducto = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrarInventario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 100));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Comercializadora OliVanders - Control de Inventarios");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblIdProducto.setText("Id Producto:");
        lblIdProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblIdProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        lblIdProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        lblIdProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        lblNombreProducto.setText("Nombre Producto:");
        lblNombreProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        lblNombreProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        lblNombreProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        lblSerieProducto.setText("Serie Producto:");
        lblSerieProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblSerieProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        lblSerieProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        lblSerieProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        lblValorProducto.setText("Valor Producto:");
        lblValorProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblValorProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        lblValorProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        lblValorProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        lblProveedorProducto.setText("Proveedor Producto:");
        lblProveedorProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblProveedorProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        lblProveedorProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        lblProveedorProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        txtIdProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        txtIdProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        txtIdProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        txtNombreProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        txtNombreProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        txtNombreProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        txtSerieProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        txtSerieProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        txtSerieProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        txtValorProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        txtValorProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        txtValorProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        txtProveedorProducto.setMaximumSize(new java.awt.Dimension(140, 20));
        txtProveedorProducto.setMinimumSize(new java.awt.Dimension(140, 20));
        txtProveedorProducto.setPreferredSize(new java.awt.Dimension(140, 20));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("");
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setInheritsPopupMenu(true);
        btnAgregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar.setName("Insertar Producto"); // NOI18N
        btnAgregar.setOpaque(true);
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 100));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.png"))); // NOI18N
        btnMostrar.setBorder(null);
        btnMostrar.setBorderPainted(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnMostrar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnMostrar.setPreferredSize(new java.awt.Dimension(100, 100));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtMostrarInventario.setColumns(20);
        txtMostrarInventario.setRows(5);
        jScrollPane1.setViewportView(txtMostrarInventario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSerieProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerieProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProveedorProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerieProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerieProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAgregar.getAccessibleContext().setAccessibleName("Insertar Producto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/cerrar.png"));
        this.setIconImage(img);
        btnSalir.setIcon(new ImageIcon(img.getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProductos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarInventario();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void agregarProductos() {
        int id = Integer.parseInt(txtIdProducto.getText());
        String name = txtNombreProducto.getText();
        String serial = txtSerieProducto.getText();
        double value = Double.parseDouble(txtValorProducto.getText());
        String supplier = txtProveedorProducto.getText();

        Producto newProduct = new Producto(id, name, serial, value, supplier);
        int index = encontrarIndiceDisponible();
        if (index != -1) {
            productos[index] = newProduct;
            inventario[index][0]++;
            JOptionPane.showMessageDialog(this, "El producto ha sido agregado exitosamente al inventario.");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "El inventario Esta lleno, no se puede agregar más productos.");
        }
    }

    private int encontrarIndiceDisponible() {
        for (int i = 0; i < PRODUCTOS_MAXIMOS; i++) {
            if (productos[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private void mostrarInventario() {
        txtMostrarInventario.setText("Existencias del Inventario:\n\n");
        for (int i = 0; i < PRODUCTOS_MAXIMOS; i++) {
            if (productos[i] != null) {
                txtMostrarInventario.append(productos[i].getName() + " (ID: " + productos[i].getId()
                        + ") - Cantidad: " + inventario[i][0] + "\n");
            }
        }
    }

    private void limpiarCampos() {
        txtIdProducto.setText("");
        txtNombreProducto.setText("");
        txtSerieProducto.setText("");
        txtValorProducto.setText("");
        txtProveedorProducto.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Inventario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblProveedorProducto;
    private javax.swing.JLabel lblSerieProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValorProducto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextArea txtMostrarInventario;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtProveedorProducto;
    private javax.swing.JTextField txtSerieProducto;
    private javax.swing.JTextField txtValorProducto;
    // End of variables declaration//GEN-END:variables
}

class Producto {

    private final int id;
    private final String name;
    private final String serial;
    private final double value;
    private final String supplier;

    public Producto(int id, String name, String serial, double value, String supplier) {
        this.id = id;
        this.name = name;
        this.serial = serial;
        this.value = value;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSerial() {
        return serial;
    }

    public double getValue() {
        return value;
    }

    public String getSupplier() {
        return supplier;
    }
}
