// POORRAIL MAAR BUTTONS HEBBEN GEEN UITVOER MEER

package PoorRail;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import Train.*;

import javax.swing.SwingUtilities;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class PoorInterface extends javax.swing.JFrame implements ActionListener 
{	
	private JPanel jPanel1;
	private JTextPane tpTextTrain;
	private JButton btnDeleteWagon3;
	private JButton btnDeleteWagon2;
	private JButton btnDeleteWagon1;
	private JButton jButton1;
	private JPanel pnlWagons;
	private JButton btnAddWagon2;
	private JButton btnAddWagon1;
	private JTextField tfCurrentTrain;
	private JButton btnDeleteTrain;
	private JButton btnChooseTrain;
	private JComboBox<Train> cbAllTrains;
	private JButton btnNewTrain;
	private JTextField tfNewTrain;
	private JPanel jPanel2;
	private static JPanel drawPanel;
	
	private HashMap numberOfWagons;
	private int currentNumberOfWagons;
	private int currentTrain = -1;
	private int OFFSET = 100;
	private int TRAINLENGTH = 100;
	private JTextArea txtrTextArea;
	private JTextArea txtrCmdOutput;
	private JPanel panel;
	private JTextPane txtpnEnterCommand;
	private JTextField textField;
	private JButton btnSubmit;

	public PoorInterface() 
	{
		super();
		initGUI();
	}
	
	private void initGUI() 
	{
		// GUI BUILDING
		try 
		{
			this.setTitle("EvenPoorerRail");
			GridBagLayout thisLayout = new GridBagLayout();
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			thisLayout.rowWeights = new double[] {0.1, 0.1, 0.0, 0.0, 0.0};
			thisLayout.rowHeights = new int[] {7, 7, 150, 0, 7};
			thisLayout.columnWeights = new double[] {1.0, 1.0};
			thisLayout.columnWidths = new int[] {500, 489};
			getContentPane().setLayout(thisLayout);
			{
				jPanel1 = new JPanel();
				jPanel1.setLayout(new BorderLayout());
				getContentPane().add(jPanel1, new GridBagConstraints(0, 0, 2, 2, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 5, 0), 0, 0));
				{
					drawPanel = new JPanel();
					drawPanel.setBackground(Color.WHITE);
					jPanel1.add(drawPanel,BorderLayout.CENTER);
				}
			}
			{
				txtrTextArea = new JTextArea();
				txtrTextArea.setSize(new Dimension(200, 0));
				txtrTextArea.setEditable(false);
				txtrTextArea.setText("CMD");
				GridBagConstraints gbc_txtrTextArea = new GridBagConstraints();
				gbc_txtrTextArea.insets = new Insets(0, 0, 5, 5);
				gbc_txtrTextArea.fill = GridBagConstraints.BOTH;
				gbc_txtrTextArea.gridx = 0;
				gbc_txtrTextArea.gridy = 2;
				getContentPane().add(txtrTextArea, gbc_txtrTextArea);
			}
			{
				txtrCmdOutput = new JTextArea();
				txtrCmdOutput.setForeground(Color.WHITE);
				txtrCmdOutput.setDisabledTextColor(Color.WHITE);
				txtrCmdOutput.setBackground(Color.BLACK);
				txtrCmdOutput.setEditable(false);
				txtrCmdOutput.setText("CMD Output");
				GridBagConstraints gbc_txtrCmdOutput = new GridBagConstraints();
				gbc_txtrCmdOutput.gridheight = 2;
				gbc_txtrCmdOutput.insets = new Insets(0, 0, 5, 0);
				gbc_txtrCmdOutput.fill = GridBagConstraints.BOTH;
				gbc_txtrCmdOutput.gridx = 1;
				gbc_txtrCmdOutput.gridy = 2;
				getContentPane().add(txtrCmdOutput, gbc_txtrCmdOutput);
			}
			{
				panel = new JPanel();
				panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				GridBagConstraints gbc_panel = new GridBagConstraints();
				gbc_panel.anchor = GridBagConstraints.SOUTH;
				gbc_panel.insets = new Insets(0, 0, 5, 5);
				gbc_panel.fill = GridBagConstraints.HORIZONTAL;
				gbc_panel.gridx = 0;
				gbc_panel.gridy = 3;
				getContentPane().add(panel, gbc_panel);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[]{7, 7, 7, 0};
				gbl_panel.rowHeights = new int[]{7, 0};
				gbl_panel.columnWeights = new double[]{0.1, 0.1, 0.1, Double.MIN_VALUE};
				gbl_panel.rowWeights = new double[]{0.1, Double.MIN_VALUE};
				panel.setLayout(gbl_panel);
				{
					txtpnEnterCommand = new JTextPane();
					txtpnEnterCommand.setText("Enter command:");
					txtpnEnterCommand.setEditable(false);
					txtpnEnterCommand.setBackground(SystemColor.menu);
					GridBagConstraints gbc_txtpnEnterCommand = new GridBagConstraints();
					gbc_txtpnEnterCommand.weighty = 0.0;
					gbc_txtpnEnterCommand.weightx = 0.0;
					gbc_txtpnEnterCommand.ipady = 0;
					gbc_txtpnEnterCommand.ipadx = 0;
					gbc_txtpnEnterCommand.gridwidth = 1;
					gbc_txtpnEnterCommand.gridheight = 1;
					gbc_txtpnEnterCommand.fill = GridBagConstraints.NONE;
					gbc_txtpnEnterCommand.anchor = GridBagConstraints.SOUTH;
					gbc_txtpnEnterCommand.insets = new Insets(0, 0, 0, 5);
					gbc_txtpnEnterCommand.gridx = 0;
					gbc_txtpnEnterCommand.gridy = 0;
					panel.add(txtpnEnterCommand, gbc_txtpnEnterCommand);
				}
				{
					textField = new JTextField(20);
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.weighty = 0.0;
					gbc_textField.weightx = 0.0;
					gbc_textField.ipady = 0;
					gbc_textField.ipadx = 0;
					gbc_textField.gridwidth = 1;
					gbc_textField.gridheight = 1;
					gbc_textField.fill = GridBagConstraints.NONE;
					gbc_textField.anchor = GridBagConstraints.SOUTH;
					gbc_textField.insets = new Insets(0, 0, 0, 5);
					gbc_textField.gridx = 1;
					gbc_textField.gridy = 0;
					panel.add(textField, gbc_textField);
				}
				{
					btnSubmit = new JButton();
					btnSubmit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						}
					});
					btnSubmit.setText("Submit");
					GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
					gbc_btnSubmit.weighty = 0.0;
					gbc_btnSubmit.weightx = 0.0;
					gbc_btnSubmit.ipady = 0;
					gbc_btnSubmit.ipadx = 0;
					gbc_btnSubmit.gridwidth = 1;
					gbc_btnSubmit.gridheight = 1;
					gbc_btnSubmit.fill = GridBagConstraints.NONE;
					gbc_btnSubmit.anchor = GridBagConstraints.SOUTH;
					gbc_btnSubmit.gridx = 2;
					gbc_btnSubmit.gridy = 0;
					panel.add(btnSubmit, gbc_btnSubmit);
				}
			}
			{
				pnlWagons = new JPanel();
				GridBagLayout jPanel3Layout = new GridBagLayout();
				getContentPane().add(pnlWagons, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				jPanel3Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel3Layout.rowHeights = new int[] {7, 7, 7, 7};
				jPanel3Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel3Layout.columnWidths = new int[] {7, 7, 7, 7};
				pnlWagons.setLayout(jPanel3Layout);
				pnlWagons.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				{
					tfCurrentTrain = new JTextField();
					tfCurrentTrain.setBorder(null);
					tfCurrentTrain.setBackground(SystemColor.menu);
					tfCurrentTrain.setEditable(false);
					pnlWagons.add(tfCurrentTrain, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
					tfCurrentTrain.setText("selected: ");
				}
				{
					btnAddWagon1 = new JButton();
					pnlWagons.add(btnAddWagon1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnAddWagon1.setText("add wagon 1");
					btnAddWagon1.addActionListener(this);
				}
				{
					btnAddWagon2 = new JButton();
					pnlWagons.add(btnAddWagon2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnAddWagon2.setText("add wagon 2");
					btnAddWagon2.addActionListener(this);
				}
				{
					jButton1 = new JButton();
					pnlWagons.add(jButton1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("add wagon 3");
					jButton1.addActionListener(this);
				}
				{
					btnDeleteWagon1 = new JButton();
					pnlWagons.add(btnDeleteWagon1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnDeleteWagon1.setText("delete wagon 1");
					btnDeleteWagon1.addActionListener(this);
				}
				{
					btnDeleteWagon2 = new JButton();
					pnlWagons.add(btnDeleteWagon2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnDeleteWagon2.setText("delete wagon 2");
					btnDeleteWagon2.addActionListener(this);
				}
				{
					btnDeleteWagon3 = new JButton();
					pnlWagons.add(btnDeleteWagon3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnDeleteWagon3.setText("delete wagon 3");
					btnDeleteWagon3.addActionListener(this);
				}
			}
			{
				jPanel2 = new JPanel();
				jPanel2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				GridBagLayout jPanel2Layout = new GridBagLayout();
				//jPanel2.setLayout(null);
				jPanel2.setLayout(jPanel2Layout);
				getContentPane().add(jPanel2, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 5), 0, 0));
				{
					tpTextTrain = new JTextPane();
					tpTextTrain.setBackground(SystemColor.menu);
					tpTextTrain.setEditable(false);
					jPanel2.add(tpTextTrain, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jPanel2.setBounds(10, 10, 100, 15);
					jPanel2Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
					jPanel2Layout.rowHeights = new int[] {7, 7, 7, 7};
					jPanel2Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
					jPanel2Layout.columnWidths = new int[] {7, 7, 7, 7};
					tpTextTrain.setText("train name:");
				}
				{
					tfNewTrain = new JTextField(20);
					tfNewTrain.requestFocus();
					jPanel2.add(tfNewTrain, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				}
				{
					btnNewTrain = new JButton();
					jPanel2.add(btnNewTrain, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnNewTrain.setText("make new train");
					btnNewTrain.addActionListener(this);
				}
				{
					ComboBoxModel cbAllTrainsModel = 
						new DefaultComboBoxModel(
								new String[] { });
					cbAllTrains = new JComboBox();
				/*	GridLayout cbAllTrainsLayout = new GridLayout(1, 1);
					cbAllTrainsLayout.setColumns(1);
					cbAllTrainsLayout.setHgap(5);
					//cbAllTrainsLayout.setVgap(5);
					cbAllTrains.setLayout(cbAllTrainsLayout);*/
					jPanel2.add(cbAllTrains, new GridBagConstraints(1, 1, 1, 2, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
					cbAllTrains.setModel(cbAllTrainsModel);
				}
				{
					btnChooseTrain = new JButton();
					jPanel2.add(btnChooseTrain, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnChooseTrain.setText("select train");
					btnChooseTrain.addActionListener(this);
				}
				{
					btnDeleteTrain = new JButton();
					jPanel2.add(btnDeleteTrain, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					btnDeleteTrain.setText("delete train");
					btnDeleteTrain.addActionListener(this);
				}
			}
			pack();
			numberOfWagons = new HashMap();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource()== btnNewTrain)
		{
			// NEW TRAIN BUTTON
			
			
				String trainName = tfNewTrain.getText();
				if (trainName != null && trainName.trim().length()>0)
				{
					Train train = new Train(trainName);
					cbAllTrains.addItem(train);
//					currentTrain = cbAllTrains.getSelectedIndex();
//					svo.addTrain(train, cbAllTrains, numberOfWagons, currentNumberOfWagons, currentTrain);
//					svo.drawLocomotive(train, drawPanel);
				}
			
			

		}
		else if (event.getSource() == btnChooseTrain)
		{
			// SELECT TRAIN BUTTON
//			
			if (cbAllTrains.getItemCount() > 0)
			{
				Train selection = (Train)cbAllTrains.getSelectedItem();
				tfCurrentTrain.setText("selected: " + selection.getName());
//				int ti = cbAllTrains.getSelectedIndex();
//				if (ti != currentTrain)
//				{
//					numberOfWagons.put(currentTrain, currentNumberOfWagons);
//				}
//				currentTrain = ti;
//				try
//				{
//					currentNumberOfWagons = (Integer) numberOfWagons.get(currentTrain);
//				}
//				catch (Exception e)
//				{
//					currentNumberOfWagons = 0;
//				}			
			}
		}
		else if (event.getSource() == btnDeleteTrain)
		{
			// DELETE TRAIN BUTTON
			
//			
//			if (cbAllTrains.getItemCount() > 0)
//			{
//				String t = (String)cbAllTrains.getSelectedItem();
//				cbAllTrains.removeItemAt(cbAllTrains.getSelectedIndex());
//				numberOfWagons.remove(t);
//				repaint();
//				if ((String)cbAllTrains.getSelectedItem() != null)
//				{
//					currentTrain = cbAllTrains.getSelectedIndex();
//					tfCurrentTrain.setText("selected: " + (String)cbAllTrains.getSelectedItem());
//				}
//				else
//				{
//					currentTrain = 0;
//					tfCurrentTrain.setText("selected: ");
//				}
//			}
		}
		else if (event.getSource() == btnAddWagon1)
		{
			// ADD WAGON 1
		
			
//			currentNumberOfWagons++;
//			drawWagon("Wagon1");
		}
		else if (event.getSource() == btnAddWagon2)
		{
			// ADD WAGON 2
			
//			currentNumberOfWagons++;
//			drawWagon("Wagon2");
		}
		else if (event.getSource() == jButton1)
		{
			// ADD WAGON 3
			
//			currentNumberOfWagons++;
//			drawWagon("Wagon3");
		}
		else if (event.getSource() == btnDeleteWagon1)
		{
			// DELETE WAGON 1
			
//			repaint(30+TRAINLENGTH,80+currentTrain*OFFSET,1,1);
		}
		else if (event.getSource() == btnDeleteWagon2)
		{
			// DELETE WAGON 2
			
//			repaint(30+TRAINLENGTH,80+currentTrain*OFFSET,1,1);		
		}
		else if (event.getSource() == btnDeleteWagon3)
		{
			// DELETE WAGON 3
			
//			repaint(30+TRAINLENGTH,80+currentTrain*OFFSET,1,1);		
		}
	}
		
//		public void drawLocomotive(String train) 
//		{
//			if (train != "")
//			{
//				Graphics g = drawPanel.getGraphics();
//				g.setColor(Color.LIGHT_GRAY);
//				g.fillRect(30,80+currentTrain*OFFSET,80,40);
//				g.fillRect(80,60+currentTrain*OFFSET,30,30);
//				g.drawRoundRect(85, 40+currentTrain*OFFSET, 20, 20, 20, 20);
//				g.drawRoundRect(85, currentTrain*OFFSET, 40, 40, 40, 40);
//				g.setColor(Color.BLACK);
//				g.fillRoundRect(35, 120+currentTrain*OFFSET, 20, 20, 20, 20);
//				g.fillRoundRect(80, 120+currentTrain*OFFSET, 20, 20, 20, 20);
//				g.drawString(train,40,105+currentTrain*OFFSET);
//			}
//	    }
//	
	
	// FUNCTIES GEBRUIKT IN DE GUI(buttons)
//	public String addTrain(String train)
//	{
//		String t = "";
//		try
//		{
//			t = train.trim();
//			for (int i = 0; i < cbAllTrains.getItemCount();i++ )
//			{
//				String cbTrain = (String)cbAllTrains.getItemAt(i);
//				if (cbTrain.equalsIgnoreCase(t))
//				{
//					t = "";
//					break;
//				}
//			}
//			if (t != "")
//			{
//				if (currentTrain >= 0)
//				{
//					numberOfWagons.put(currentTrain,currentNumberOfWagons);
//				}
//				cbAllTrains.addItem(t);
//				cbAllTrains.setSelectedItem(t);
//				numberOfWagons.put(t, 0);
//			}
//		}
//		catch (Exception e)
//		{
//		}
//		return t;
//			
//	}

	
	public void drawWagon(String wagon) 
	{
		Graphics g = drawPanel.getGraphics();
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(30+currentNumberOfWagons*TRAINLENGTH,80+currentTrain*OFFSET,80,40);
		g.setColor(Color.BLACK);
		g.fillRoundRect(35+currentNumberOfWagons*TRAINLENGTH, 120+currentTrain*OFFSET, 20, 20, 20, 20);
		g.fillRoundRect(80+currentNumberOfWagons*TRAINLENGTH, 120+currentTrain*OFFSET, 20, 20, 20, 20);
		g.drawString(wagon,40+currentNumberOfWagons*TRAINLENGTH,105+currentTrain*OFFSET);
    }
	
	public static JPanel getdrawPanel() {
		return drawPanel;
	}
}
