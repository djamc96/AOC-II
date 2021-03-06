/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ModuloA.CacheDMNew;
import ModuloA.Cache_dm_tam_total;
import ModuloB.Cache_ModuloB_Parte1;
import ModuloB.Cache_ModuloB_Parte2;
import ModuloB.Calculo_ModuloB_Parte1;
import ModuloB.Calculo_ModuloB_Parte2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ritiele Aldeburg , Anderson Cruz
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jComboModulos = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextObs = new javax.swing.JTextArea();
        jTextCapacidadeCache = new javax.swing.JTextField();
        /*try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("0123456789");

            jTextCapacidadeCache = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }*/

        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jTextLarguraPalavra = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        jTextNumeroPalavra = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de AOC II Primeiro Semestre de 2018");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  Calculadora de AOC II  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add2.png"))); // NOI18N
        jButtonNovo.setText("Novo Calculo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonGravar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save24x24.png"))); // NOI18N
        jButtonGravar.setText("Salvar Calculo");
        jButtonGravar.setEnabled(false);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel24x24.png"))); // NOI18N
        jButtonSair.setText("Cancelar");
        jButtonSair.setEnabled(false);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonCalcular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar24x24.png"))); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.setEnabled(false);
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jComboModulos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboModulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modulo A", "Modulo B1", "Modulo B2" }));
        jComboModulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboModulosItemStateChanged(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboModulos, 0, 109, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboModulos))
                .addGap(5, 5, 5))
        );

        jTextObs.setEditable(false);
        jTextObs.setColumns(1);
        jTextObs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextObs.setLineWrap(true);
        jTextObs.setRows(1);
        jTextObs.setText("Tamanho Total da cache:\n\nCapacidade  para armazenamento de informações do usuario:\n\nLargura da palavra:\n\nTamanho do campo de deslocamento:\n\nNúmero de conjuntos da cache:\n\nTamanho do campo de índice do endereço:\n\nTamanho do campo TAG do endereço:");
        jTextObs.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextObs.setEnabled(false);
        jScrollPane4.setViewportView(jTextObs);

        jTextCapacidadeCache.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextCapacidadeCache.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCapacidadeCache.setEnabled(false);
        jTextCapacidadeCache.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextCapacidadeCache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCapacidadeCacheActionPerformed(evt);
            }
        });

        Label1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Label1.setText("Capacidade da cache (em KB) para armazenamento de informações do usuario:");

        Label2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Label2.setText("Largura (em bytes) da palavra:");

        jTextLarguraPalavra.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextLarguraPalavra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextLarguraPalavra.setEnabled(false);
        jTextLarguraPalavra.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextLarguraPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLarguraPalavraActionPerformed(evt);
            }
        });

        Label3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Label3.setText("Número de palavras por bloco:");

        jTextNumeroPalavra.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextNumeroPalavra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNumeroPalavra.setText("1");
        jTextNumeroPalavra.setEnabled(false);
        jTextNumeroPalavra.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextNumeroPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroPalavraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCapacidadeCache, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(480, 480, 480))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextLarguraPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNumeroPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(388, 388, 388))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextCapacidadeCache, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jTextLarguraPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumeroPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpaCampo() {
        jTextObs.setText(null);
        jTextCapacidadeCache.setText("");
        jTextLarguraPalavra.setText("");
        jTextNumeroPalavra.setText("1");
    }

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

        if (jComboModulos.getSelectedIndex() == 0) {
            this.limpaCampo();
            this.jComboModulos.setEnabled(false);
            this.jTextNumeroPalavra.setEnabled(false);
            this.jTextCapacidadeCache.setEnabled(true);
            this.jTextLarguraPalavra.setEnabled(true);
            this.jButtonNovo.setEnabled(false);
            this.jButtonCalcular.setEnabled(true);
            this.jButtonSair.setEnabled(true);
        } else {
            if ((jComboModulos.getSelectedIndex() == 1)) {
                this.limpaCampo();
                this.jTextNumeroPalavra.setEnabled(true);
                this.jComboModulos.setEnabled(false);
                this.jTextNumeroPalavra.setEnabled(true);
                this.jTextCapacidadeCache.setEnabled(true);
                this.jTextLarguraPalavra.setEnabled(true);
                this.jButtonNovo.setEnabled(false);
                this.jButtonCalcular.setEnabled(true);
                this.jButtonSair.setEnabled(true);
            } else {
                if ((jComboModulos.getSelectedIndex() == 2)) {
                    this.limpaCampo();
                    this.jTextNumeroPalavra.setText("");
                    this.jTextNumeroPalavra.setEnabled(true);
                    this.jComboModulos.setEnabled(false);
                    this.jTextNumeroPalavra.setEnabled(true);
                    this.jTextCapacidadeCache.setEnabled(true);
                    this.jTextLarguraPalavra.setEnabled(true);
                    this.jButtonNovo.setEnabled(false);
                    this.jButtonCalcular.setEnabled(true);
                    this.jButtonSair.setEnabled(true);
                }
            }
        }

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        File arquivo = new File("Calculo.txt");
        String texto = "";
        String[] txt = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("Calculo.txt"));

            texto = jTextObs.getText();
            txt = texto.split("\n");
            for (int i = 0; i < txt.length; i++) {
                pw.println(txt[i]);
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Calculo Salvo com Sucesso!!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.limpaCampo();
        this.jComboModulos.setSelectedIndex(0);
        jTextNumeroPalavra.setText("1");
        Label1.setText("Capacidade da cache (em KB) para armazenamento de informações do usuario:");
        Label2.setText("Largura (em bytes) da palavra:");
        Label3.setText("Número de palavras por bloco:");
        this.jComboModulos.setEnabled(true);
        this.jTextNumeroPalavra.setEnabled(false);
        this.jTextCapacidadeCache.setEnabled(false);
        this.jTextLarguraPalavra.setEnabled(false);
        this.jButtonGravar.setEnabled(false);
        this.jButtonNovo.setEnabled(true);
        this.jButtonSair.setEnabled(false);
        this.jButtonCalcular.setEnabled(false);


    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        if (jComboModulos.getSelectedIndex() == 0) {
            if (jTextCapacidadeCache.getText().equals("0") || jTextCapacidadeCache.getText().equals("") || jTextLarguraPalavra.getText().equals("0") || jTextLarguraPalavra.getText().equals("") || jTextNumeroPalavra.getText().equals("0") || jTextNumeroPalavra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Verifique os Valores de Entrada!!", "Erro ao Calcular", JOptionPane.WARNING_MESSAGE);
            } else {
                //Le dados da tela e coloca na cache
                CacheDMNew cache = new CacheDMNew(Float.parseFloat(jTextCapacidadeCache.getText()), Float.parseFloat(jTextLarguraPalavra.getText()), Float.parseFloat(jTextNumeroPalavra.getText()));
                //inicializa a cache1
                CacheDMNew cache1 = new CacheDMNew(0, 0, 1);
                //Estancia Cache_dm_tam_total
                Cache_dm_tam_total result_calc = new Cache_dm_tam_total();
                //efetua o calculo e salva na cache1
                cache1 = result_calc.Calc(cache);
                //Mostra na tela os resultados
                jTextObs.setText("Tamanho Total da cache: " + cache1.getT_total() + "\n\n"
                        + "Capacidade  para armazenamento de informações do usuario: " + cache1.getT_user() + "\n\n"
                        + "Largura da palavra: " + cache1.getT_word() + "\n\n"
                        + "Numero de Palavras por Bloco" + cache1.getN_word_bloco() + "\n\n"
                        + "Tamanho do campo de deslocamento: " + cache1.getOb() + "\n\n"
                        + "Número de conjuntos da cache: " + cache1.getN_conj() + "\n\n"
                        + "Tamanho do campo de índice do endereço: " + cache1.getT_ind() + "\n\n"
                        + "Tamanho do campo TAG do endereço: " + cache1.getTag() + "\n\n ");

                this.jButtonGravar.setEnabled(true);
            }
        } else {
            if (jComboModulos.getSelectedIndex() == 1) {
                if (jTextCapacidadeCache.getText().equals("0") || jTextCapacidadeCache.getText().equals("") || jTextLarguraPalavra.getText().equals("0") || jTextLarguraPalavra.getText().equals("") || jTextNumeroPalavra.getText().equals("0") || jTextNumeroPalavra.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Verifique os Valores de Entrada!!", "Erro ao Calcular", JOptionPane.WARNING_MESSAGE);
                } else {
                    //Le dados da tela e coloca na cache
                    Cache_ModuloB_Parte1 cache_b = new Cache_ModuloB_Parte1(Float.parseFloat(jTextCapacidadeCache.getText()), Float.parseFloat(jTextLarguraPalavra.getText()), Float.parseFloat(jTextNumeroPalavra.getText()));
                    //inicializa a cache1
                    Cache_ModuloB_Parte1 cache1_b = new Cache_ModuloB_Parte1(0, 0, 1);
                    //estancia calculo modulo b1
                    Calculo_ModuloB_Parte1 result_calc_b1 = new Calculo_ModuloB_Parte1();
                    //efetua o calculo e salva na cache1
                    cache1_b = result_calc_b1.Calc(cache_b);

                    jTextObs.setText("Tamanho Total da cache: " + cache1_b.getT_total() + "\n\n"
                            + "Capacidade  para armazenamento de informações do usuario: " + cache1_b.getT_user() + "\n\n"
                            + "Largura da palavra: " + cache1_b.getT_word() + "\n\n"
                            + "Numero de Palavras por Bloco" + cache1_b.getN_word_bloco() + "\n\n"
                            + "Tamanho do campo de deslocamento: " + cache1_b.getOb() + "\n\n"
                            + "Tamanho do Endereço: " + cache1_b.getT_end() + "\n\n"
                            + "Offiset de Palavra: " + cache1_b.getOp() + "\n\n"
                            + "Tamanho de Overhad: " + cache1_b.getOverhad() + "\n\n"
                            + "Número de conjuntos da cache: " + cache1_b.getN_conj() + "\n\n"
                            + "Tamanho do campo de índice do endereço: " + cache1_b.getT_ind() + "\n\n"
                            + "Tamanho do campo TAG do endereço: " + cache1_b.getTag() + "\n\n ");
                    jButtonGravar.setEnabled(true);
                }
            } else {
                if (jComboModulos.getSelectedIndex() == 2) {
                    if (jTextCapacidadeCache.getText().equals("0") || jTextCapacidadeCache.getText().equals("") || jTextLarguraPalavra.getText().equals("0") || jTextLarguraPalavra.getText().equals("") || jTextNumeroPalavra.getText().equals("0") || jTextNumeroPalavra.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Verifique os Valores de Entrada!!", "Erro ao Calcular", JOptionPane.WARNING_MESSAGE);
                    } else {
                        //Le dados da tela e coloca na cache
                        Cache_ModuloB_Parte2 cache_b2 = new Cache_ModuloB_Parte2(Integer.parseInt(jTextCapacidadeCache.getText()), Integer.parseInt(jTextLarguraPalavra.getText()), Float.parseFloat(jTextNumeroPalavra.getText()));
                        //inicializa a cache1
                        Cache_ModuloB_Parte2 cache1_b2 = new Cache_ModuloB_Parte2(0, 0, 1);
                        //estancia calculo modulo b1
                        Calculo_ModuloB_Parte2 result_calc_b2 = new Calculo_ModuloB_Parte2();
                        //efetua o calculo e salva na cache1
                        cache1_b2 = result_calc_b2.Calc(cache_b2);

                        jTextObs.setText("Número de bits do campo de índice do endereço: " + cache1_b2.getT_ind() + "\n\n"
                                + "Largura (em bytes) do endereço: " + cache1_b2.getT_end() + "\n\n"
                                + "Overhead (em bytes) da cache: " + cache1_b2.getOverhad() + "\n\n"
                                + "Numero de conjuntos da cache: " + cache1_b2.getN_conj() + "\n\n"
                                + "Offset de Bloco: " + cache1_b2.getO_bloco() + "\n\n"
                                + "Tamanho do Bloco: " + cache1_b2.getT_bloco() + "\n\n"
                                + "Tamanho do campo TAG do endereço: " + cache1_b2.getTag() + "\n\n ");
                        jButtonGravar.setEnabled(true);
                    }
                } else {

                }
            }
        }


    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jTextCapacidadeCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCapacidadeCacheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCapacidadeCacheActionPerformed

    private void jTextLarguraPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLarguraPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLarguraPalavraActionPerformed

    private void jTextNumeroPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroPalavraActionPerformed

    private void jComboModulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboModulosItemStateChanged
        if (jComboModulos.getSelectedIndex() == 0 || jComboModulos.getSelectedIndex() == 1) {
            jTextNumeroPalavra.setText("1");
            Label1.setText("Capacidade da cache (em KB) para armazenamento de informações do usuario:");
            Label2.setText("Largura (em bytes) da palavra:");
            Label3.setText("Número de palavras por bloco:");
        } else {
            if (jComboModulos.getSelectedIndex() == 2) {
                jTextNumeroPalavra.setText("");
                Label1.setText("Número de bits do campo de índice do endereço:");
                Label2.setText("Largura (em bytes) do endereço:");
                Label3.setText("Overhead (em bytes) da cache:");
            } else {

            }
        }
    }//GEN-LAST:event_jComboModulosItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboModulos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextCapacidadeCache;
    private javax.swing.JTextField jTextLarguraPalavra;
    private javax.swing.JTextField jTextNumeroPalavra;
    private javax.swing.JTextArea jTextObs;
    // End of variables declaration//GEN-END:variables
}
