import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import model1.ZipcodeComboBoxModel1;
import model1.ZipcodeListModel3;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

public class ZipcodeSearchUI07 extends JFrame {

	private JPanel contentPane;
	private JList list;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI07 frame = new ZipcodeSearchUI07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ZipcodeSearchUI07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(17, 15, 594, 66);
		contentPane.add(panel);
		panel.setLayout(null);

		comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox1.getSelectedItem()!=null) {
					comboBox2.setModel(new ZipcodeComboBoxModel1((String)comboBox1.getSelectedItem(), "gugun"));
				}
			}

		});
		comboBox1.setModel(new ZipcodeComboBoxModel1("sido"));
		comboBox1.setBounds(17, 23, 150, 27);
		panel.add(comboBox1);

		comboBox2 = new JComboBox();
		comboBox2.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox1.getSelectedItem()!=null && comboBox2.getSelectedItem()!=null) {
					comboBox3.setModel(new ZipcodeComboBoxModel1((String)comboBox1.getSelectedItem(), (String)comboBox2.getSelectedItem(), "dong"));
				}
			}
		});
		comboBox2.setBounds(216, 23, 150, 27);
		panel.add(comboBox2);

		comboBox3 = new JComboBox();
		comboBox3.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//System.out.println((String)comboBox1.getSelectedItem() +","+ (String)comboBox2.getSelectedItem()+","+ (String)comboBox3.getSelectedItem());
				if(comboBox1.getSelectedItem()!=null && comboBox2.getSelectedItem()!=null && comboBox3.getSelectedItem()!=null) {
					list.setModel(new ZipcodeListModel3((String)comboBox1.getSelectedItem(), (String)comboBox2.getSelectedItem(), (String)comboBox3.getSelectedItem()));
				}
			}
		});
		comboBox3.setBounds(427, 23, 150, 27);
		panel.add(comboBox3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(17, 96, 594, 373);
		contentPane.add(scrollPane);

		list = new JList();
		list.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane.setViewportView(list);
	}
}
