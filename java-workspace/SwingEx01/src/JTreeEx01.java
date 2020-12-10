import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreeEx01 frame = new JTreeEx01();
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
	public JTreeEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTree tree = new JTree();
		// 1.
		/*
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("과일");
						node_1.add(new DefaultMutableTreeNode("사과"));
						node_1.add(new DefaultMutableTreeNode("딸기"));
						node_1.add(new DefaultMutableTreeNode("수박"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("야채");
						node_1.add(new DefaultMutableTreeNode("샐러리"));
						node_1.add(new DefaultMutableTreeNode("토마토"));
						node_1.add(new DefaultMutableTreeNode("배추"));
					add(node_1);
				}
			}
		));
		*/
		
		// 2.
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("JTREE");
		
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("과일");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("야채");
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("고기");
		
		DefaultMutableTreeNode child11 = new DefaultMutableTreeNode("수박");
		DefaultMutableTreeNode child12 = new DefaultMutableTreeNode("참외");
		
		DefaultMutableTreeNode child21 = new DefaultMutableTreeNode("오이");
		DefaultMutableTreeNode child22 = new DefaultMutableTreeNode("당근");
		
		DefaultMutableTreeNode child31 = new DefaultMutableTreeNode("소고기");
		DefaultMutableTreeNode child32 = new DefaultMutableTreeNode("돼지고기");
		
		node1.add(child11);
		node1.add(child12);
		
		node2.add(child21);
		node2.add(child22);
		
		node3.add(child31);
		node3.add(child32);
		
		root.add(node1);
		root.add(node2);
		root.add(node3);
		
		tree.setModel(new DefaultTreeModel(root));
		
		tree.setBounds(17, 15, 149, 408);
		contentPane.add(tree);
	}
}
