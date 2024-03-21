package empleados;

import java.awt.Image;
import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VISTA extends javax.swing.JFrame {

    private ArrayList<EMPLEADOS> Lista;
    File fichero;
    String Ced, Nom, Ap, Gen, Fn, Fi, Fo;
    int Sal;
    String Dn, Mn, An, Di, Mi, Ai;

    public VISTA() {
        this.setLocationRelativeTo(this);
        Lista = new ArrayList<EMPLEADOS>();
        initComponents();
        contar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtNacimiento = new javax.swing.JTextField();
        TxtIngreso = new javax.swing.JTextField();
        TxtSalario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtNe = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        TxtGenero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtimagen = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jFoto = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxtCedulaN = new javax.swing.JTextField();
        TxtNombresN = new javax.swing.JTextField();
        TxtApellidosN = new javax.swing.JTextField();
        ComG = new javax.swing.JComboBox<>();
        ComAN = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        ComMN = new javax.swing.JComboBox<>();
        ComDN = new javax.swing.JComboBox<>();
        ComDI = new javax.swing.JComboBox<>();
        ComMI = new javax.swing.JComboBox<>();
        ComAI = new javax.swing.JComboBox<>();
        TxtSalarioN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Datos Empleado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombres*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 113, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 149, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Género*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 183, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 212, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Ingreso*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 238, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Salario*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 262, -1, -1));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 111, 150, -1));
        jPanel1.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 147, 150, -1));
        jPanel1.add(TxtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 210, 159, -1));
        jPanel1.add(TxtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 236, 157, -1));
        jPanel1.add(TxtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 260, 157, -1));

        jLabel13.setText("EMPLEADOS EN REGISTRO:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 19, -1, -1));

        TxtNe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtNe.setBorder(null);
        TxtNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNeActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNe, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 14, 31, -1));

        jLabel14.setText("$");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 263, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Identificación*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 81, -1, -1));

        TxtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 78, 150, -1));
        jPanel1.add(TxtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 181, 150, -1));

        jButton1.setText("MODIFICAR SALARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 289, 157, -1));

        jButton6.setText("LIMPIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 327, 157, -1));
        jPanel1.add(txtimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 176, 132, -1));

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jFoto.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 12, -1, -1));

        BtnBuscar.setText("BUSCAR EMPLEADO");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 306, 153, -1));

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jButton3.setText("CALCULAR ANTIGÜEDAD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("CALCULAR PRESTACIONES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("CALCULAR EDAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setText("MOSTRAR TODOS LOS EMPLEADOS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("ELIMINAR EMPLEADO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombres", "Apellidos", "Genéro", "Fecha de Nacimiento", "Fecha de ingreso", "Salario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empleados/MicrosoftTeams-image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("INGRESAR USUARIO");

        jLabel11.setText("IDENTIFICACIÓN:");

        jLabel16.setText("NOMBRES:");

        jLabel17.setText("APELLIDOS:");

        jLabel18.setText("GÉNERO:");

        jLabel19.setText("FECHA DE NACIMIENTO:");

        jLabel20.setText("FECHA DE INGRESO:");

        jLabel21.setText("SALARIO");

        ComG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "MASCULINO", "FEMENINO" }));

        ComAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));

        jButton9.setText("AÑADIR FOTO");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        BtnNuevo.setText("NUEVO EMPLEADO");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        ComMN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        ComDN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ComDI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ComMI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        ComAI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ComG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TxtNombresN, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(TxtApellidosN)
                            .addComponent(TxtCedulaN)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(20, 20, 20)))
                .addGap(66, 66, 66))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(57, 57, 57)
                        .addComponent(TxtSalarioN)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ComDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ComDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtCedulaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TxtNombresN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtApellidosN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(ComG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(ComAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ComDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TxtSalarioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar() {
        TxtCedula.setText("");
        TxtNombre.setText("");
        TxtApellido.setText("");
        TxtGenero.setText("");
        TxtNacimiento.setText("");
        TxtIngreso.setText("");
        TxtSalario.setText("");
        jFoto.setText("");
    }

    private void contar() {
        int Ne = 0;
        Ne = Lista.size();
        String Nel = Integer.toString(Ne);
        TxtNe.setText(Nel);
        TxtNe.setEditable(false);
    }

    private int BuscarCedula(String Ced) {

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getCedula().equals(Ced)) {
                return i;
            }
        }
        return -1;
    }

    private void mostrard() {
        BtnBuscar.setEnabled(true);

        int NAux = BuscarCedula(TxtCedula.getText());

        if (NAux >= 0) {
            TxtCedula.setText(Lista.get(NAux).getCedula());
            TxtNombre.setText(String.valueOf(Lista.get(NAux).getNombre()));
            TxtApellido.setText(String.valueOf(Lista.get(NAux).getApellido()));
            TxtGenero.setText(String.valueOf(Lista.get(NAux).getGenero()));
            TxtNacimiento.setText(String.valueOf(Lista.get(NAux).getFechaNac()));
            TxtIngreso.setText(String.valueOf(Lista.get(NAux).getFechaIng()));
            TxtSalario.setText(String.valueOf(Lista.get(NAux).getSalario()));
            Image imag = new ImageIcon(Lista.get(NAux).getFoto()).getImage();
            ImageIcon icono = new ImageIcon(imag.getScaledInstance(119, 129, Image.SCALE_SMOOTH));
            jFoto.setIcon(icono);

        } else {
            JOptionPane.showMessageDialog(null, "EMPLEADO NO REGISTRADO");
            TxtNombre.setText("");
        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaingreso = LocalDate.parse(TxtIngreso.getText(), date);
            LocalDate fechaactual = LocalDate.now();

            Period periodo = Period.between(fechaingreso, fechaactual);

            String resultado = ("El empleado tiene : " + periodo.getYears() + "Años, " + periodo.getMonths() + " Meses y " + periodo.getDays() + " Dias en la empresa");
            JOptionPane.showMessageDialog(null, resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BUSQUE O VERIFIQUE LAS FECHAS DE EL PACIENTE A CALCULAR");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        String VG, VDN, VMN, VAN, VDI, VMI, VAI;
        VG = ComG.getSelectedItem().toString();
        VDN = ComDN.getSelectedItem().toString();
        VMN = ComMN.getSelectedItem().toString();
        VAN = ComAN.getSelectedItem().toString();

        VDI = ComDI.getSelectedItem().toString();
        VMI = ComMI.getSelectedItem().toString();
        VAI = ComAI.getSelectedItem().toString();

        int Er = BuscarCedula(TxtCedulaN.getText());
        
        if (TxtCedulaN.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Campo cedula vacio", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (TxtNombresN.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Campo  nombre vacio", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (TxtApellidosN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo apellido vacio", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VG == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione Genero", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VDN == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione día de nacimiento", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VMN == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione mes de nacimiento", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VAN == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione año de nacimiento", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VDI == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione dia de ingreso ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VMI == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione mes de ingreso ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (VAI == "-") {
            JOptionPane.showMessageDialog(null, "Seleccione año de ingreso ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (TxtSalarioN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo salario vacio", "Error", JOptionPane.ERROR_MESSAGE);

        }
        
        
        if (TxtCedulaN.getText().isEmpty()||TxtNombresN.getText().isEmpty()||TxtApellidosN.getText().isEmpty()||VG == "-"||VDN == "-"||VMN == "-"||VAN == "-"||VDI == "-"||VMI == "-"||VAI == "-"||TxtSalarioN.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null,"VERIFICA LOS DATOS PARA GUARDAR");
        }else{
           if (Er < 0) {  
                try {
                    Ced = TxtCedulaN.getText();
                    Nom = TxtNombresN.getText();
                    Ap = TxtApellidosN.getText();
                    //GENERO
                    Gen = ComG.getSelectedItem().toString();
                    //DATOS DE NACIEMIENTO
                    Dn = ComDN.getSelectedItem().toString();
                    Mn = ComMN.getSelectedItem().toString();
                    An = ComAN.getSelectedItem().toString();
                    Fn = (Dn + "/" + Mn + "/" + An);
                    //DATOS DE INGRESO
                    Di = ComDI.getSelectedItem().toString();
                    Mi = ComMI.getSelectedItem().toString();
                    Ai = ComAI.getSelectedItem().toString();
                    Fi = (Di + "/" + Mi + "/" + Ai);

                    Sal = Integer.parseInt(TxtSalarioN.getText());
                    Lista.add(new EMPLEADOS(Ced, Nom, Ap, Gen, Fn, Fi, Sal, Fo));
                    TxtCedulaN.setText("");
                    TxtNombresN.setText("");
                    TxtApellidosN.setText("");
                    TxtSalarioN.setText("");
                    contar();
                    ComG.setSelectedIndex(0);
                    ComDN.setSelectedIndex(0);
                    ComMN.setSelectedIndex(0);
                    ComAN.setSelectedIndex(0);
                    ComDI.setSelectedIndex(0);
                    ComMI.setSelectedIndex(0);
                    ComAI.setSelectedIndex(0);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "CORRIGE PARA GUARDAR");
                }
            } else {
                JOptionPane.showMessageDialog(null, "EL USUARIO YA SE ENCUENTRA REGISTRADO");
            } 
        } 

        

    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        mostrard();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String Ca = TxtCedula.getText();
        if (!"".equals(Ca)) {
            int opc = JOptionPane.showConfirmDialog(this, "¿DESEA BORRAR AL EMPLEADO?", "CONFIRMAR",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opc == JOptionPane.YES_OPTION) {
                for (int i = 0; i < Lista.size(); i++) {
                    if (Lista.get(i).getCedula().equals(TxtCedula.getText())) {
                        Lista.remove(i);
                        limpiar();

                        JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO CORRECTAMENTE");
                        break;
                    }
                }
            }
            contar();
        } else {
            JOptionPane.showMessageDialog(null, "BUSCA EL EMPLEADO A ELIMINAR");
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Ced = TxtCedula.getText();
            Nom = TxtNombre.getText();
            Ap = TxtApellido.getText();
            Gen = TxtGenero.getText();
            Fn = TxtNacimiento.getText();
            Fi = TxtIngreso.getText();
            Sal = Integer.parseInt(TxtSalario.getText());
            EMPLEADOS t = new EMPLEADOS(Ced, Nom, Ap, Gen, Fn, Fi, Sal, Fo);
            int pos = 0;
            Lista.set(pos, t);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "REVISA DE NUEVO LOS DATOS");
        }
        TxtSalario.setText("");
        mostrard();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechanacimiento = LocalDate.parse(TxtNacimiento.getText(), date);
            LocalDate fechaactual = LocalDate.now();

            Period periodo = Period.between(fechanacimiento, fechaactual);

            String resultado = ("El empleado tiene:  " + periodo.getYears() + " Años, " + periodo.getMonths() + " Meses y " + periodo.getDays() + " Dias de edad");
            JOptionPane.showMessageDialog(null, resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BUSQUE O VERIFIQUE LAS FECHAS DE EL PACIENTE A CALCULAR");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int An, Prestaciones, Salarioe;
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaingreso = LocalDate.parse(TxtIngreso.getText(), date);
            LocalDate fechaactual = LocalDate.now();

            Period periodo = Period.between(fechaingreso, fechaactual);

            An = periodo.getYears();
            int Años = (An / 12) + periodo.getMonths();
            Salarioe = Integer.parseInt(TxtSalario.getText());
            Prestaciones = (Años * Salarioe) / 12;

            JOptionPane.showMessageDialog(null, "EL VALOR TOTAL DE PRESTACIONES DEL EMPLEADO ES DE: $" + Prestaciones);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BUSQUE O VERIFIQUE LAS FECHAS DE EL PACIENTE A CALCULAR");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TxtNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNeActionPerformed

    }//GEN-LAST:event_TxtNeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String Matriz[][] = new String[Lista.size()][7];
        EMPLEADOS aux;
        for (int i = 0; i < Lista.size(); i++) {
            aux = Lista.get(i);
            Matriz[i][0] = aux.getCedula();
            Matriz[i][1] = aux.getNombre();
            Matriz[i][2] = aux.getApellido();
            Matriz[i][3] = aux.getGenero();
            Matriz[i][4] = aux.getFechaNac();
            Matriz[i][5] = aux.getFechaIng();
            Matriz[i][6] = Integer.toString(aux.getSalario());
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Identificación", "Nombres", "Apellidos", "Genéro", "Fecha de Nacimiento", "Fecha de ingreso", "Salario"
                }
        ));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            txtimagen.setText(archivo.getAbsolutePath());
        }
        ImageIcon iconLogo = new ImageIcon(archivo.toString());
        ImageIcon icono = new ImageIcon(iconLogo.getImage().getScaledInstance(150, 190, Image.SCALE_SMOOTH));

        Fo = (archivo.toString());

    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VISTA().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> ComAI;
    private javax.swing.JComboBox<String> ComAN;
    private javax.swing.JComboBox<String> ComDI;
    private javax.swing.JComboBox<String> ComDN;
    private javax.swing.JComboBox<String> ComG;
    private javax.swing.JComboBox<String> ComMI;
    private javax.swing.JComboBox<String> ComMN;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtApellidosN;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCedulaN;
    private javax.swing.JTextField TxtGenero;
    private javax.swing.JTextField TxtIngreso;
    private javax.swing.JTextField TxtNacimiento;
    private javax.swing.JTextField TxtNe;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNombresN;
    private javax.swing.JTextField TxtSalario;
    private javax.swing.JTextField TxtSalarioN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtimagen;
    // End of variables declaration//GEN-END:variables

}
