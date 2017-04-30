package cn.uplooking.game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import java.util.Random;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GameTest extends JFrame {

	String[] image = { "res/0.jpg", "res/1.jpg", "res/2.jpg", "res/3.jpg",
			"res/4.jpg", "res/5.jpg", "res/6.jpg", "res/7.jpg" };
	private JButton[] b = { new JButton(), new JButton(), new JButton(),
			new JButton(), new JButton(), new JButton(), new JButton(),
			new JButton(), new JButton() };
	private JButton b4 = new JButton("关于游戏");
	private JButton b3 = new JButton("原图");
	private JButton b2 = new JButton("重新开始");

	private int flag = 0;
	private Icon ic = null;
	private URL url = null;
	private int count = 0;

	public GameTest() {
		this.setSize(620, 665);
		Dimension dim = getToolkit().getScreenSize();
		double height = dim.getHeight();
		double width = dim.getWidth();
		int x = (int) (width - 620) / 2;
		int y = (int) (height - 665) / 2;
		this.setLocation(x, y);
		this.setTitle("我的第一个拼图游戏");
		final JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		p.setLayout(new GridLayout(3, 3));
		// ----------把按钮控件加到面板上----------------
		for (int i = 0; i < 9; i++) {
			p.add(b[i]);
		}
		// ------------------把1--8张图片随机加到按钮上，按钮控件下标随机
		for (int i = 0; i < 8; i++) {
			while (true) {
				Random rd = new Random();
				int k = rd.nextInt(9);
				url = this.getClass().getClassLoader().getResource(image[i]);
				ic = new ImageIcon(url);
				if (b[k].getIcon() == null) {// ----避免重复----
					b[k].setIcon(ic);
					break;
				}
			}
		}
		// --------------------按钮触发事件------------------
		// 0
		b[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[1].getIcon() == null) {
					b[1].setIcon(b[0].getIcon());
					b[0].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}

				} else if (b[3].getIcon() == null) {
					b[3].setIcon(b[0].getIcon());
					b[0].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 1
		b[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[0].getIcon() == null) {
					b[0].setIcon(b[1].getIcon());
					b[1].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[2].getIcon() == null) {
					b[2].setIcon(b[1].getIcon());
					b[1].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[4].getIcon() == null) {
					b[4].setIcon(b[1].getIcon());
					b[1].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}

				}
			}
		});
		// 2
		b[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[1].getIcon() == null) {
					b[1].setIcon(b[2].getIcon());
					b[2].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[5].getIcon() == null) {
					b[5].setIcon(b[2].getIcon());
					b[2].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 3
		b[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[0].getIcon() == null) {
					b[0].setIcon(b[3].getIcon());
					b[3].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[4].getIcon() == null) {
					b[4].setIcon(b[3].getIcon());
					b[3].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[6].getIcon() == null) {
					b[6].setIcon(b[3].getIcon());
					b[3].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 4
		b[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[1].getIcon() == null) {
					b[1].setIcon(b[4].getIcon());
					b[4].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[3].getIcon() == null) {
					b[3].setIcon(b[4].getIcon());
					b[4].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[5].getIcon() == null) {
					b[5].setIcon(b[4].getIcon());
					b[4].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[7].getIcon() == null) {
					b[7].setIcon(b[4].getIcon());
					b[4].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 5
		b[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[2].getIcon() == null) {
					b[2].setIcon(b[5].getIcon());
					b[5].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[4].getIcon() == null) {
					b[4].setIcon(b[5].getIcon());
					b[5].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[8].getIcon() == null) {
					b[8].setIcon(b[5].getIcon());
					b[5].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 6
		b[6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[3].getIcon() == null) {
					b[3].setIcon(b[6].getIcon());
					b[6].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[7].getIcon() == null) {
					b[7].setIcon(b[6].getIcon());
					b[6].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 7
		b[7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[4].getIcon() == null) {
					b[4].setIcon(b[7].getIcon());
					b[7].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[6].getIcon() == null) {
					b[6].setIcon(b[7].getIcon());
					b[7].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[8].getIcon() == null) {
					b[8].setIcon(b[7].getIcon());
					b[7].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// 8
		b[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b[5].getIcon() == null) {
					b[5].setIcon(b[8].getIcon());
					b[8].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				} else if (b[7].getIcon() == null) {
					b[7].setIcon(b[8].getIcon());
					b[8].setIcon(null);
					count++;
					if (result()) {
						if (count <= 5) {
							JOptionPane.showMessageDialog(null, "您太棒啦!!!\n才走了"
									+ count + "步");
						} else if (count > 5 && count < 10) {
							JOptionPane.showMessageDialog(null, "您太厉害了!!!\n才走了"
									+ count + "步");
						} else {
							JOptionPane.showMessageDialog(null, "恭喜您!\n才走了"
									+ count + "步");
						}
					}
				}
			}
		});
		// --原图----
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int j = 0; j < 9; j++) {
					if (j < 8) {
						url = this.getClass().getClassLoader()
								.getResource(image[j]);
						Icon ic = new ImageIcon(url);
						b[j].setIcon(ic);
					} else {
						b[j].setIcon(null);
					}
				}
				count = 0;

			}
		});
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		// 重新开始
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();// 释放本机屏幕资源
				new GameTest();
				count = 0;
			}
		});
		// 关于版本号
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "author:王平涛\nVerson.0.9");

			}
		});
		this.add(p, new BorderLayout().CENTER);
		this.add(p2, new BorderLayout().SOUTH);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public boolean result() {
		if (b[b.length - 1].getIcon() != null) {
			return false;
		}
		for (int i = 0; i < b.length - 1; i++) {
			String bb = b[i].getIcon().toString();
			String im = this.getClass().getClassLoader().getResource(image[i])
					.toString();
			if (!im.equals(bb)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		new GameTest();
	}

}
