package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import antlrDSL.richrailsCommand;
import antlrDSL.richrailsLexer;
import antlrDSL.richrailsParser;
import javax.swing.border.SoftBevelBorder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import Train.Train;
import Train.TrainController;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JLabel;
import persistence.SavingFactory;
import persistence.XmlSave;

@SuppressWarnings("serial")
public class PoorInterface extends javax.swing.JFrame
{	
	private JPanel jPanel1;
	private static JPanel drawPanel;
	private JTextArea txtAreaCmd;
	private JScrollPane txtAreaCmdd;
	private static JTextArea txtAreaCmdOutput;
	private JScrollPane txtAreaCmdOutputt;
	private JPanel panel;
	private JTextPane txtpnEnterCommand;
	private JTextField textFieldCommand;
	private JButton btnSubmit;
	private final static String newline = "\n";
	private JLabel lblThimEickhofMarc;

	public PoorInterface() 
	{
		super();
		initGUI();
	}
	
	private void initGUI() 	// Render the GUI
	{
		try 
		{
			this.setTitle("EvenPoorerRail");
			GridBagLayout thisLayout = new GridBagLayout();
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			thisLayout.rowWeights = new double[] {0.1, 0.1, 0.0, 0.0};
			thisLayout.rowHeights = new int[] {7, 7, 150, 0};
			thisLayout.columnWeights = new double[] {1.0, 1.0};
			thisLayout.columnWidths = new int[] {500, 489};
			getContentPane().setLayout(thisLayout);
			{
				jPanel1 = new JPanel();
				jPanel1.setLayout(new BorderLayout());
				getContentPane().add(jPanel1, new GridBagConstraints(0, 0, 2, 2, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 5, 0), 0, 0));
				{
					drawPanel = new JPanel();
					drawPanel.setFocusTraversalKeysEnabled(false);
					drawPanel.setFocusable(false);
					drawPanel.setBackground(Color.WHITE);
					jPanel1.add(drawPanel,BorderLayout.CENTER);
				}
			}
			{
				txtAreaCmd = new JTextArea();
				txtAreaCmd.setFocusTraversalKeysEnabled(false);
				txtAreaCmd.setFocusable(false);
				txtAreaCmd.setAutoscrolls(false);
				txtAreaCmd.setSize(new Dimension(200, 0));
				txtAreaCmd.setEditable(false);
				txtAreaCmdd = new JScrollPane(txtAreaCmd);
				GridBagConstraints gbc_txtAreaCmd = new GridBagConstraints();
				gbc_txtAreaCmd.insets = new Insets(0, 0, 5, 5);
				gbc_txtAreaCmd.fill = GridBagConstraints.BOTH;
				gbc_txtAreaCmd.gridx = 0;
				gbc_txtAreaCmd.gridy = 2;
				getContentPane().add(txtAreaCmdd, gbc_txtAreaCmd);
			}
			{
				txtAreaCmdOutput = new JTextArea();
				txtAreaCmdOutput.setFocusTraversalKeysEnabled(false);
				txtAreaCmdOutput.setFocusable(false);
				txtAreaCmdOutput.setForeground(Color.WHITE);
				txtAreaCmdOutput.setDisabledTextColor(Color.WHITE);
				txtAreaCmdOutput.setBackground(Color.BLACK);
				txtAreaCmdOutput.setEditable(false);
				txtAreaCmdOutputt = new JScrollPane(txtAreaCmdOutput);
				GridBagConstraints gbc_txtAreaCmdOutput = new GridBagConstraints();
				gbc_txtAreaCmdOutput.insets = new Insets(0, 0, 5, 0);
				gbc_txtAreaCmdOutput.fill = GridBagConstraints.BOTH;
				gbc_txtAreaCmdOutput.gridx = 1;
				gbc_txtAreaCmdOutput.gridy = 2;
				getContentPane().add(txtAreaCmdOutputt, gbc_txtAreaCmdOutput);
			}
			{
				panel = new JPanel();
				panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				GridBagConstraints gbc_panel = new GridBagConstraints();
				gbc_panel.anchor = GridBagConstraints.SOUTH;
				gbc_panel.insets = new Insets(0, 0, 0, 5);
				gbc_panel.fill = GridBagConstraints.HORIZONTAL;
				gbc_panel.gridx = 0;
				gbc_panel.gridy = 3;
				getContentPane().add(panel, gbc_panel);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[]{7, 7, 7, 0};
				gbl_panel.rowHeights = new int[]{7, 0};
				gbl_panel.columnWeights = new double[]{0.0, 0.1, 0.0, Double.MIN_VALUE};
				gbl_panel.rowWeights = new double[]{0.1, Double.MIN_VALUE};
				panel.setLayout(gbl_panel);
				{
					txtpnEnterCommand = new JTextPane();
					txtpnEnterCommand.setFocusCycleRoot(false);
					txtpnEnterCommand.setFocusTraversalKeysEnabled(false);
					txtpnEnterCommand.setFocusable(false);
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
					gbc_txtpnEnterCommand.anchor = GridBagConstraints.SOUTHWEST;
					gbc_txtpnEnterCommand.insets = new Insets(0, 0, 0, 5);
					gbc_txtpnEnterCommand.gridx = 0;
					gbc_txtpnEnterCommand.gridy = 0;
					panel.add(txtpnEnterCommand, gbc_txtpnEnterCommand);
				}
				{
					textFieldCommand = new JTextField(20);
					GridBagConstraints gbc_textFieldCommand = new GridBagConstraints();
					gbc_textFieldCommand.weighty = 0.0;
					gbc_textFieldCommand.weightx = 0.0;
					gbc_textFieldCommand.ipady = 0;
					gbc_textFieldCommand.ipadx = 0;
					gbc_textFieldCommand.gridwidth = 1;
					gbc_textFieldCommand.gridheight = 1;
					gbc_textFieldCommand.fill = GridBagConstraints.HORIZONTAL;
					gbc_textFieldCommand.anchor = GridBagConstraints.SOUTH;
					gbc_textFieldCommand.insets = new Insets(0, 0, 0, 5);
					gbc_textFieldCommand.gridx = 1;
					gbc_textFieldCommand.gridy = 0;
					panel.add(textFieldCommand, gbc_textFieldCommand);
				}
				{
					btnSubmit = new JButton();
					
					btnSubmit.addActionListener(new ActionListener() {							
						public void actionPerformed(ActionEvent arg0) {
							CharStream is = CharStreams.fromString(textFieldCommand.getText());		
						      try {																		// Start the commandline itterator to check the command
					        richrailsLexer lexer = new richrailsLexer(is);
					        // create a buffer of tokens pulled from the lexer
					        CommonTokenStream tokens = new CommonTokenStream(lexer);
					        // create a parser that feeds off the tokens buffer
					        richrailsParser parser = new richrailsParser(tokens);
					        ParserRuleContext commandContext = parser.command();
					        ParseTreeWalker walker = new ParseTreeWalker();
					        richrailsCommand listener = new richrailsCommand();
					        walker.walk(listener, commandContext);
							String command = textFieldCommand.getText();
							txtAreaCmd.append(command + newline);
							textFieldCommand.setText("");
							
							//XmlSave.XmlSave(new Train("Choochoo"));
							//XmlSave.XmlLoad();
							
							XmlSave xs = new XmlSave();
							xs.saveToXML(TrainController.getInstance());
							System.out.println(TrainController.getInstance().getAllTrains().toString());
							
						      }
						      catch (Exception e) {
						    	  System.out.println("Exception occured: " + e);
						      }
						    //SavingFactory.getSave("XML");
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
					gbc_btnSubmit.anchor = GridBagConstraints.SOUTHEAST;
					gbc_btnSubmit.gridx = 2;
					gbc_btnSubmit.gridy = 0;
					panel.add(btnSubmit, gbc_btnSubmit);
				}
			}
			{
				lblThimEickhofMarc = new JLabel("Thim Eickhof, Marc Bosman, Ruben Sikkens");
				lblThimEickhofMarc.setToolTipText("Thim Eickhof, Marc Bosman, Ruben Sikkens");
				GridBagConstraints gbc_lblThimEickhofMarc = new GridBagConstraints();
				gbc_lblThimEickhofMarc.gridx = 1;
				gbc_lblThimEickhofMarc.gridy = 3;
				getContentPane().add(lblThimEickhofMarc, gbc_lblThimEickhofMarc);
			}
			{
				{

				}
			}
			pack();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static JPanel getdrawPanel() {					// Used to get the specific Jpanel when needed outside of this class
		return drawPanel;
	}
	
	public static void setCMDOutput(String output) {		// Used to add text to the output panel outside of this class
		txtAreaCmdOutput.append(output + newline);
	}
}


