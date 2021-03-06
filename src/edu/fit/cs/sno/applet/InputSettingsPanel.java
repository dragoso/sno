/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InputSettingsPanel.java
 *
 * Created on Mar 28, 2011, 12:31:09 AM
 */

package edu.fit.cs.sno.applet;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import edu.fit.cs.sno.snes.Core;
import edu.fit.cs.sno.util.Settings;

/**
 *
 * @author Eric
 */
public class InputSettingsPanel extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form InputSettingsPanel */
    public InputSettingsPanel() {
        initComponents(); initText();
    }
    private void initText() {
        try {
			LInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.l")));
		} catch (NumberFormatException e1) {
		}
        try {
			RInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.r")));
		} catch (NumberFormatException e1) {
		}
        try {
			upInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.up")));
		} catch (NumberFormatException e1) {
		}
        try {
			downInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.down")));
		} catch (NumberFormatException e1) {
		}
        try {
			leftInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.left")));
		} catch (NumberFormatException e1) {
		}
        try {
			rightInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.right")));
		} catch (NumberFormatException e1) {
		}
        try {
			aInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.a")));
		} catch (NumberFormatException e1) {
		}
        try {
			bInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.b")));
		} catch (NumberFormatException e1) {
		}
        try {
			xInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.x")));
		} catch (NumberFormatException e1) {
		}
        try {
			yInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.y")));
		} catch (NumberFormatException e1) {
		}
        try {
			startInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.start")));
		} catch (NumberFormatException e1) {
		}
        try {
			selectInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.player1.select")));
		} catch (NumberFormatException e1) {
		}

        try {
			pauseInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.emulator.pause")));
		} catch (NumberFormatException e1) {
		}
        try {
			resetAudioInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.emulator.resetAudio")));
		} catch (NumberFormatException e) {
			resetAudioInput.setText("");
		}
        try {
			frameskipInput.setText(KeyEvent.getKeyText(Settings.getInt("sno.input.emulator.frameskip")));
		} catch (NumberFormatException e) {
		}

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings({ "deprecation" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputSettingsPanel = new javax.swing.JPanel();
        gameControlPanel = new javax.swing.JPanel();
        yLabel = new javax.swing.JLabel();
        rightInput = new javax.swing.JTextField();
        upInput = new javax.swing.JTextField();
        aLabel = new javax.swing.JLabel();
        aInput = new javax.swing.JTextField();
        leftLabel = new javax.swing.JLabel();
        xInput = new javax.swing.JTextField();
        startLabel = new javax.swing.JLabel();
        bInput = new javax.swing.JTextField();
        selectLabel = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        upLabel = new javax.swing.JLabel();
        leftInput = new javax.swing.JTextField();
        startInput = new javax.swing.JTextField();
        yInput = new javax.swing.JTextField();
        bLabel = new javax.swing.JLabel();
        xLabel = new javax.swing.JLabel();
        selectInput = new javax.swing.JTextField();
        downInput = new javax.swing.JTextField();
        downLabel = new javax.swing.JLabel();
        LLabel = new javax.swing.JLabel();
        LInput = new javax.swing.JTextField();
        rLabel = new javax.swing.JLabel();
        RInput = new javax.swing.JTextField();
        emulatorControlPanel = new javax.swing.JPanel();
        frameskipLabel = new javax.swing.JLabel();
        pauseLabel = new javax.swing.JLabel();
        resetAudioLabel = new javax.swing.JLabel();
        frameskipInput = new javax.swing.JTextField();
        pauseInput = new javax.swing.JTextField();
        resetAudioInput = new javax.swing.JTextField();
        acceptButton = new javax.swing.JButton();

        inputSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Settings"));
        inputSettingsPanel.setPreferredSize(new java.awt.Dimension(478, 328));

        gameControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Game Controls"));

        yLabel.setText("Y");

        rightInput.setNextFocusableComponent(xInput);
        rightInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        rightInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightInputKeyPressed(evt);
            }
        });

        upInput.setNextFocusableComponent(leftInput);
        upInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        upInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upInputKeyPressed(evt);
            }
        });

        aLabel.setText("A");

        aInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        aInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aInputKeyPressed(evt);
            }
        });

        leftLabel.setText("Left");

        xInput.setHighlighter(null);
        xInput.setNextFocusableComponent(yInput);
        xInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
        });
        xInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xInputKeyPressed(evt);
            }
        });

        startLabel.setText("Start");

        bInput.setNextFocusableComponent(aInput);
        bInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        bInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bInputKeyPressed(evt);
            }
        });

        selectLabel.setText("Select");

        rightLabel.setText("Right");

        upLabel.setText("Up");

        leftInput.setNextFocusableComponent(downInput);
        leftInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        leftInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftInputKeyPressed(evt);
            }
        });

        startInput.setNextFocusableComponent(LInput);
        startInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        startInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startInputKeyPressed(evt);
            }
        });

        yInput.setHighlighter(null);
        yInput.setNextFocusableComponent(bInput);
        yInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        yInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yInputKeyPressed(evt);
            }
        });

        bLabel.setText("B");

        xLabel.setText("X");

        selectInput.setText("                 ");
        selectInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        selectInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectInputKeyPressed(evt);
            }
        });

        downInput.setNextFocusableComponent(rightInput);
        downInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        downInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                downInputKeyPressed(evt);
            }
        });

        downLabel.setText("Down");

        LLabel.setText("L");

        LInput.setFocusCycleRoot(true);
        LInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        LInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LInputKeyPressed(evt);
            }
        });

        rLabel.setText("R");

        RInput.setText("                 ");
        RInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        RInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RInputKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout gameControlPanelLayout = new javax.swing.GroupLayout(gameControlPanel);
        gameControlPanel.setLayout(gameControlPanelLayout);
        gameControlPanelLayout.setHorizontalGroup(
            gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upLabel)
                    .addComponent(leftLabel)
                    .addComponent(downLabel)
                    .addComponent(rightLabel)
                    .addComponent(selectLabel)
                    .addComponent(LLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LInput, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(upInput, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(selectInput, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(leftInput, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(downInput, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(rightInput, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aLabel)
                    .addComponent(startLabel))
                .addGap(4, 4, 4)
                .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startInput, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gameControlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RInput, aInput, bInput, startInput, xInput, yInput});

        gameControlPanelLayout.setVerticalGroup(
            gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gameControlPanelLayout.createSequentialGroup()
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xLabel)
                            .addComponent(xInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yLabel)
                            .addComponent(yInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bLabel)
                            .addComponent(bInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aLabel)
                            .addComponent(aInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startLabel)
                            .addComponent(startInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gameControlPanelLayout.createSequentialGroup()
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LLabel)
                            .addComponent(LInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leftInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gameControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectLabel))))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        emulatorControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Emulator Controls"));

        frameskipLabel.setText("Frameskip");

        pauseLabel.setText("Pause");

        resetAudioLabel.setText("Reset Audio");

        frameskipInput.setText("                 ");
        frameskipInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        frameskipInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frameskipInputKeyPressed(evt);
            }
        });

        pauseInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        pauseInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pauseInputKeyPressed(evt);
            }
        });

        resetAudioInput.setNextFocusableComponent(frameskipInput);
        resetAudioInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldfocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        resetAudioInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resetAudioInputKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout emulatorControlPanelLayout = new javax.swing.GroupLayout(emulatorControlPanel);
        emulatorControlPanel.setLayout(emulatorControlPanelLayout);
        emulatorControlPanelLayout.setHorizontalGroup(
            emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emulatorControlPanelLayout.createSequentialGroup()
                .addGroup(emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frameskipLabel)
                    .addComponent(pauseLabel)
                    .addComponent(resetAudioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pauseInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(frameskipInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(resetAudioInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addContainerGap())
        );
        emulatorControlPanelLayout.setVerticalGroup(
            emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emulatorControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frameskipInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frameskipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pauseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pauseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emulatorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetAudioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetAudioLabel))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        acceptButton.setText("Ok");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputSettingsPanelLayout = new javax.swing.GroupLayout(inputSettingsPanel);
        inputSettingsPanel.setLayout(inputSettingsPanelLayout);
        inputSettingsPanelLayout.setHorizontalGroup(
            inputSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emulatorControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        inputSettingsPanelLayout.setVerticalGroup(
            inputSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputSettingsPanelLayout.createSequentialGroup()
                .addComponent(emulatorControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acceptButton))
            .addComponent(gameControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputSettingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setText(java.awt.event.KeyEvent evt) {
        ((JTextField)evt.getComponent()).setText(evt.getKeyText( evt.getKeyCode()));
        ((JTextField)evt.getComponent()).transferFocus();
    }
    private void rightInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.right", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_rightInputKeyPressed

    private void upInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.up", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_upInputKeyPressed

    private void aInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.a", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_aInputKeyPressed

    private void xInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.x", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_xInputKeyPressed

    private void bInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.b", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_bInputKeyPressed

    private void leftInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.left", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_leftInputKeyPressed

    private void startInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.start", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_startInputKeyPressed

    private void yInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.y", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_yInputKeyPressed

    private void selectInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.select", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_selectInputKeyPressed

    private void downInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_downInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.down", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_downInputKeyPressed

    private void LInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.l", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_LInputKeyPressed

    private void RInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RInputKeyPressed
        setText(evt);
        Settings.set("sno.input.player1.r", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_RInputKeyPressed

    private void frameskipInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frameskipInputKeyPressed
        setText(evt);
        Settings.set("sno.input.emulator.frameskip", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_frameskipInputKeyPressed

    private void pauseInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pauseInputKeyPressed
        setText(evt);
        Settings.set("sno.input.emulator.pause", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_pauseInputKeyPressed

    private void resetAudioInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resetAudioInputKeyPressed
        setText(evt);
        Settings.set("sno.input.emulator.resetAudio", String.valueOf(evt.getKeyCode()));
}//GEN-LAST:event_resetAudioInputKeyPressed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
    	Core.pause = false;
    	SNOApplet.instance.layout.show(getRootPane().getContentPane(), "Game");
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void textfieldfocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldfocusGained
        xInput.setEditable(true);
        ((JTextField)(evt.getComponent())).setEditable(false);
    }//GEN-LAST:event_textfieldfocusGained

    private void textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusLost
        ((JTextField)(evt.getComponent())).setEditable(true);
        xInput.setEditable(true);
    }//GEN-LAST:event_textFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LInput;
    private javax.swing.JLabel LLabel;
    private javax.swing.JTextField RInput;
    private javax.swing.JTextField aInput;
    private javax.swing.JLabel aLabel;
    private javax.swing.JButton acceptButton;
    private javax.swing.JTextField bInput;
    private javax.swing.JLabel bLabel;
    private javax.swing.JTextField downInput;
    private javax.swing.JLabel downLabel;
    private javax.swing.JPanel emulatorControlPanel;
    private javax.swing.JTextField frameskipInput;
    private javax.swing.JLabel frameskipLabel;
    private javax.swing.JPanel gameControlPanel;
    private javax.swing.JPanel inputSettingsPanel;
    private javax.swing.JTextField leftInput;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JTextField pauseInput;
    private javax.swing.JLabel pauseLabel;
    private javax.swing.JLabel rLabel;
    private javax.swing.JTextField resetAudioInput;
    private javax.swing.JLabel resetAudioLabel;
    private javax.swing.JTextField rightInput;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JTextField selectInput;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JTextField startInput;
    private javax.swing.JLabel startLabel;
    private javax.swing.JTextField upInput;
    private javax.swing.JLabel upLabel;
    private javax.swing.JTextField xInput;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField yInput;
    private javax.swing.JLabel yLabel;
    // End of variables declaration//GEN-END:variables

}
