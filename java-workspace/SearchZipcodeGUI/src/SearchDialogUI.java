import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model2.AddressListModel;
import model2.DongComboBoxModel;
import model2.GugunComboBoxModel;
import model2.SidoComboBoxModel;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class SearchDialogUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	private JList list;
	
	public String getAddress() {
		return (String)list.getSelectedValue();
	}

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			SearchDialogUI dialog = new SearchDialogUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 */
	public SearchDialogUI() {
		setBounds(100, 100, 450, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// select / deselect 둘다 이벤트 발생 => select 될때만 처리 
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//System.out.println((String)comboBox1.getSelectedItem());
					comboBox2.setModel(new GugunComboBoxModel((String)comboBox1.getSelectedItem()));
					
				}
				
			}
		});
		comboBox1.setBounds(17, 15, 125, 27);
		contentPanel.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					comboBox3.setModel(new DongComboBoxModel(
							(String)comboBox1.getSelectedItem(), 
							(String)comboBox2.getSelectedItem())
							);
				}
			}
		});
		comboBox2.setBounds(151, 15, 125, 27);
		contentPanel.add(comboBox2);
		
		comboBox3 = new JComboBox();
		comboBox3.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					list.setModel(new AddressListModel(
							(String)comboBox1.getSelectedItem(), 
							(String)comboBox2.getSelectedItem(), 
							(String)comboBox3.getSelectedItem())
							);
				}
			}
		});
		comboBox3.setBounds(286, 15, 125, 27);
		contentPanel.add(comboBox3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(17, 57, 394, 433);
		contentPanel.add(scrollPane);
		
		list = new JList();
		list.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane.setViewportView(list);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("확인");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SearchDialogUI.this.dispose();						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SearchDialogUI.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		// 초기 시도 데이터 입력
		comboBox1.setModel(new SidoComboBoxModel());
	}
}
