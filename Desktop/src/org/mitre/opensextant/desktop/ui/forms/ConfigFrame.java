/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mitre.opensextant.desktop.ui.forms;

import java.io.File;
import java.util.Hashtable;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;

/**
 *
 * @author aquina
 */
public class ConfigFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConfigFrameNew
     */
    public ConfigFrame() {
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

        timeExtractionRadioButtonGroup = new javax.swing.ButtonGroup();
        outputPanel = new javax.swing.JPanel();
        pathLabel = new javax.swing.JLabel();
        outputText = new javax.swing.JTextField();
        browseOutButton = new javax.swing.JButton();
        gdbCheck = new javax.swing.JCheckBox();
        wktCheck = new javax.swing.JCheckBox();
        shapefileCheck = new javax.swing.JCheckBox();
        jsonCheck = new javax.swing.JCheckBox();
        kmlCheck = new javax.swing.JCheckBox();
        formatLabel = new javax.swing.JLabel();
        xlsCheck = new javax.swing.JCheckBox();
        csvCheck = new javax.swing.JCheckBox();
        sqliteCheck = new javax.swing.JCheckBox();
        extractPanel = new javax.swing.JPanel();
        extractTimeCheck = new javax.swing.JCheckBox();
        extractIdentifiersCheck = new javax.swing.JCheckBox();
        csvTimeRadioButton = new javax.swing.JRadioButton();
        cartProdTimeRadioButton = new javax.swing.JRadioButton();
        processingPanel = new javax.swing.JPanel();
        tempLabel = new javax.swing.JLabel();
        browseTempButton = new javax.swing.JButton();
        tempText = new javax.swing.JTextField();
        browseCacheButton = new javax.swing.JButton();
        warnLabel = new javax.swing.JLabel();
        threadCount = new javax.swing.JSpinner();
        cacheLabel = new javax.swing.JLabel();
        cacheText = new javax.swing.JTextField();
        threadsLabel = new javax.swing.JLabel();
        loggingPanel = new javax.swing.JPanel();
        loggingSlider = new javax.swing.JSlider();
        logLevelLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();

        setTitle("Configuration");

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        pathLabel.setText("Path:");
        pathLabel.setToolTipText("The location of the directory to place output files");

        outputText.setToolTipText("Directly enter output directory location");
        outputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTextActionPerformed(evt);
            }
        });

        browseOutButton.setText("Browse...");
        browseOutButton.setToolTipText("Navigate filesystem for output directory location");
        browseOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOutButtonActionPerformed(evt);
            }
        });

        gdbCheck.setText("GDB");
        gdbCheck.setToolTipText("Esri Shapefile");
        gdbCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdbCheckActionPerformed(evt);
            }
        });

        wktCheck.setText("WKT");
        wktCheck.setToolTipText("Well-Known Text");
        wktCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wktCheckActionPerformed(evt);
            }
        });

        shapefileCheck.setText("Shapefile");
        shapefileCheck.setToolTipText("Esri Shapefile");
        shapefileCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapefileCheckActionPerformed(evt);
            }
        });

        jsonCheck.setText("JSON");
        jsonCheck.setToolTipText("JavaScript Object Notation");
        jsonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsonCheckActionPerformed(evt);
            }
        });

        kmlCheck.setText("KML");
        kmlCheck.setToolTipText("Keyhole Markup Language");
        kmlCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmlCheckActionPerformed(evt);
            }
        });

        formatLabel.setText("Format:");
        formatLabel.setToolTipText("The type of file to output the results into");

        xlsCheck.setText("XLS");
        xlsCheck.setToolTipText("JavaScript Object Notation");
        xlsCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlsCheckActionPerformed(evt);
            }
        });

        csvCheck.setText("CSV");
        csvCheck.setToolTipText("Comma-Separated Values");
        csvCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvCheckActionPerformed(evt);
            }
        });

        sqliteCheck.setText("SQLite");
        sqliteCheck.setToolTipText("Esri Shapefile");
        sqliteCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqliteCheckActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout outputPanelLayout = new org.jdesktop.layout.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formatLabel)
                    .add(pathLabel))
                .add(18, 18, 18)
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(outputPanelLayout.createSequentialGroup()
                        .add(outputText)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseOutButton))
                    .add(outputPanelLayout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(csvCheck)
                            .add(xlsCheck)
                            .add(kmlCheck)
                            .add(jsonCheck))
                        .add(29, 29, 29)
                        .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(sqliteCheck)
                            .add(shapefileCheck)
                            .add(wktCheck)
                            .add(gdbCheck))
                        .add(0, 391, Short.MAX_VALUE)))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(outputPanelLayout.createSequentialGroup()
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(outputText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pathLabel)
                    .add(browseOutButton))
                .add(12, 12, 12)
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(formatLabel)
                    .add(csvCheck)
                    .add(wktCheck))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xlsCheck)
                    .add(shapefileCheck))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(kmlCheck)
                    .add(gdbCheck))
                .add(7, 7, 7)
                .add(outputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jsonCheck)
                    .add(sqliteCheck))
                .add(0, 3, Short.MAX_VALUE))
        );

        extractPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extract", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        extractTimeCheck.setSelected(true);
        extractTimeCheck.setText("Extract Time");
        extractTimeCheck.setToolTipText("Extract time patterns when processing documents");
        extractTimeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractTimeCheckActionPerformed(evt);
            }
        });

        extractIdentifiersCheck.setSelected(true);
        extractIdentifiersCheck.setText("Extract Identifiers");
        extractIdentifiersCheck.setToolTipText("Extract unique identifier patterns when processing documents");
        extractIdentifiersCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractIdentifiersCheckActionPerformed(evt);
            }
        });

        timeExtractionRadioButtonGroup.add(csvTimeRadioButton);
        csvTimeRadioButton.setSelected(true);
        csvTimeRadioButton.setText("Collapse extracted times to comma separated column");
        csvTimeRadioButton.setToolTipText("All extracted time elements will be attached to each extracted Geo element as a comma separated list in the output");
        csvTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvTimeRadioButtonActionPerformed(evt);
            }
        });

        timeExtractionRadioButtonGroup.add(cartProdTimeRadioButton);
        cartProdTimeRadioButton.setText("Create a copy of each Geo row per Time extracted (G x T)");
        cartProdTimeRadioButton.setToolTipText("Each extracted Geo element will appear with each time element associated with it.  This will produce a copied Geo element for each time element resulting in (Geo Elements) x (Time Elements) number of rows.");

        org.jdesktop.layout.GroupLayout extractPanelLayout = new org.jdesktop.layout.GroupLayout(extractPanel);
        extractPanel.setLayout(extractPanelLayout);
        extractPanelLayout.setHorizontalGroup(
            extractPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(extractPanelLayout.createSequentialGroup()
                .add(extractPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(extractPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(extractTimeCheck))
                    .add(extractPanelLayout.createSequentialGroup()
                        .add(74, 74, 74)
                        .add(extractPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cartProdTimeRadioButton)
                            .add(csvTimeRadioButton)))
                    .add(extractPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(extractIdentifiersCheck)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        extractPanelLayout.setVerticalGroup(
            extractPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(extractPanelLayout.createSequentialGroup()
                .add(extractTimeCheck)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(csvTimeRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cartProdTimeRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(extractIdentifiersCheck))
        );

        processingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        tempLabel.setText("Temp Path:");
        tempLabel.setToolTipText("The location to place temporary files used during job execution");

        browseTempButton.setText("Browse...");
        browseTempButton.setToolTipText("Navigate filesystem for temporary directory location");
        browseTempButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseTempButtonActionPerformed(evt);
            }
        });

        tempText.setToolTipText("Directly enter temporary directory location");
        tempText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTextActionPerformed(evt);
            }
        });

        browseCacheButton.setText("Browse...");
        browseCacheButton.setToolTipText("Navigate filesystem for temporary directory location");
        browseCacheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseCacheButtonActionPerformed(evt);
            }
        });

        warnLabel.setForeground(new java.awt.Color(255, 0, 0));
        warnLabel.setText("Warning: Exceeding number of cores may cause slowdown");
        warnLabel.setToolTipText("");

        threadCount.setModel(new javax.swing.SpinnerNumberModel(1, 1, 25, 1));
        threadCount.setToolTipText("Each additional thread allows an additional job to run concurrently");

        cacheLabel.setText("Cache Path:");
        cacheLabel.setToolTipText("The location to place temporary files used during job execution");

        cacheText.setToolTipText("Directly enter temporary directory location");
        cacheText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacheTextActionPerformed(evt);
            }
        });

        threadsLabel.setText("Threads:");
        threadsLabel.setToolTipText("The number of simultaneous jobs that can be run");

        org.jdesktop.layout.GroupLayout processingPanelLayout = new org.jdesktop.layout.GroupLayout(processingPanel);
        processingPanel.setLayout(processingPanelLayout);
        processingPanelLayout.setHorizontalGroup(
            processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(processingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cacheLabel)
                    .add(tempLabel)
                    .add(threadsLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(processingPanelLayout.createSequentialGroup()
                        .add(threadCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(warnLabel)
                        .add(0, 140, Short.MAX_VALUE))
                    .add(processingPanelLayout.createSequentialGroup()
                        .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tempText)
                            .add(cacheText))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(browseCacheButton)
                            .add(browseTempButton))
                        .addContainerGap())))
        );
        processingPanelLayout.setVerticalGroup(
            processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(processingPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(threadCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(warnLabel))
                    .add(threadsLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cacheLabel)
                    .add(cacheText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseCacheButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(processingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tempText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseTempButton)
                    .add(tempLabel)))
        );

        loggingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logging", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        loggingSlider.setMaximum(4);
        loggingSlider.setPaintLabels(true);
        loggingSlider.setPaintTicks(true);
        loggingSlider.setSnapToTicks(true);

        logLevelLabel.setText("Log Level:");
        logLevelLabel.setToolTipText("The location to place temporary files used during job execution");

        org.jdesktop.layout.GroupLayout loggingPanelLayout = new org.jdesktop.layout.GroupLayout(loggingPanel);
        loggingPanel.setLayout(loggingPanelLayout);
        loggingPanelLayout.setHorizontalGroup(
            loggingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loggingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(logLevelLabel)
                .add(26, 26, 26)
                .add(loggingSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 445, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        loggingPanelLayout.setVerticalGroup(
            loggingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loggingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(logLevelLabel)
                .addContainerGap(24, Short.MAX_VALUE))
            .add(loggingPanelLayout.createSequentialGroup()
                .add(loggingSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        doneButton.setText("Done");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(processingPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(outputPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(extractPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(loggingPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(doneButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(outputPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(extractPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(processingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(loggingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(doneButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputTextActionPerformed

    private void browseOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseOutButtonActionPerformed

    private void gdbCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdbCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdbCheckActionPerformed

    private void wktCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wktCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wktCheckActionPerformed

    private void shapefileCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapefileCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shapefileCheckActionPerformed

    private void jsonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsonCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsonCheckActionPerformed

    private void kmlCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmlCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmlCheckActionPerformed

    private void xlsCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlsCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xlsCheckActionPerformed

    private void csvCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csvCheckActionPerformed

    private void extractTimeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractTimeCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extractTimeCheckActionPerformed

    private void browseTempButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseTempButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new File(tempText.getText()));
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            tempText.setText(chooser.getSelectedFile().toString());
        }
    }//GEN-LAST:event_browseTempButtonActionPerformed

    private void tempTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTextActionPerformed

    private void browseCacheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseCacheButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new File(cacheText.getText()));
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
{                      }     }//GEN-LAST:event_browseCacheButtonActionPerformed

    private void cacheTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacheTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cacheTextActionPerformed

    private void extractIdentifiersCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractIdentifiersCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extractIdentifiersCheckActionPerformed

    private void csvTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvTimeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csvTimeRadioButtonActionPerformed

    private void sqliteCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqliteCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqliteCheckActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConfigFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseCacheButton;
    private javax.swing.JButton browseOutButton;
    private javax.swing.JButton browseTempButton;
    private javax.swing.JLabel cacheLabel;
    protected javax.swing.JTextField cacheText;
    protected javax.swing.JRadioButton cartProdTimeRadioButton;
    protected javax.swing.JCheckBox csvCheck;
    protected javax.swing.JRadioButton csvTimeRadioButton;
    protected javax.swing.JButton doneButton;
    protected javax.swing.JCheckBox extractIdentifiersCheck;
    private javax.swing.JPanel extractPanel;
    protected javax.swing.JCheckBox extractTimeCheck;
    private javax.swing.JLabel formatLabel;
    protected javax.swing.JCheckBox gdbCheck;
    protected javax.swing.JCheckBox jsonCheck;
    protected javax.swing.JCheckBox kmlCheck;
    private javax.swing.JLabel logLevelLabel;
    private javax.swing.JPanel loggingPanel;
    protected javax.swing.JSlider loggingSlider;
    private javax.swing.JPanel outputPanel;
    protected javax.swing.JTextField outputText;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JPanel processingPanel;
    protected javax.swing.JCheckBox shapefileCheck;
    protected javax.swing.JCheckBox sqliteCheck;
    private javax.swing.JLabel tempLabel;
    protected javax.swing.JTextField tempText;
    protected javax.swing.JSpinner threadCount;
    private javax.swing.JLabel threadsLabel;
    protected javax.swing.ButtonGroup timeExtractionRadioButtonGroup;
    protected javax.swing.JLabel warnLabel;
    protected javax.swing.JCheckBox wktCheck;
    protected javax.swing.JCheckBox xlsCheck;
    // End of variables declaration//GEN-END:variables
}
