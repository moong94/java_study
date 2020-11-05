package mouse6_7_omok_final;
import java.awt.Color;

import java.awt.Dimension;

import java.awt.Font;

import java.awt.Graphics;

import java.awt.Point;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

 

class Stone{

    int x;

    int y;

    int size;

    int type;

}

 

class MyPanel extends JPanel implements MouseListener, ActionListener{

    

    Stone[][] grid;

    Point mousePos;

    JButton rect;

    JButton reset;

    int win;

    boolean stoneType;

    boolean isShow;

    boolean end;

    final int MAX_SIZE = 10;

    final int START_POS = 300;

    final int REC_SIZE = 40;

    final int GRID_SIZE = 30;

 

    public MyPanel() {

        

        setLayout(null);

        addMouseListener(this);

        setBackground(new Color(255, 228, 0));

        

        grid = new Stone[MAX_SIZE][MAX_SIZE];

        mousePos = new Point();

        

        rect = new JButton("Rect");

        rect.setBounds(50, 200, 100, 50);

        rect.addActionListener(this);

        add(rect);

        

        reset = new JButton("Reset");

        reset.setBounds(50, 300, 100, 50);

        reset.addActionListener(this);

        add(reset);

        

        init();

    }

    

    void init() {

        

        stoneType = false;

        isShow = false;

        win = 0;

        end = false;

 

        for(int y=0; y<MAX_SIZE; y++) {

            for(int x=0; x<MAX_SIZE; x++) {

                Stone stone = new Stone();

                stone.x = START_POS - 15 + (x * REC_SIZE);

                stone.y = 100 - 15 + (y * REC_SIZE);

                stone.size = GRID_SIZE;

                stone.type = 0;

                

                grid[y][x] = stone;

            }

        }

    }

    

    void judge() {

        // 가로

        for(int y=0; y<MAX_SIZE; y++) {

            for(int x=0; x<MAX_SIZE - 4; x++) {

                if(grid[y][x].type == 1 && grid[y][x+1].type == 1 && grid[y][x+2].type == 1 && grid[y][x+3].type == 1 && grid[y][x+4].type == 1) {

                    win = 1;

                }

                if(grid[y][x].type == 2 && grid[y][x+1].type == 2 && grid[y][x+2].type == 2 && grid[y][x+3].type == 2 && grid[y][x+4].type == 2) {

                    win = 2;

                }

            }

        }

        // 세로

        for(int y=0; y<MAX_SIZE - 4; y++) {

            for(int x=0; x<MAX_SIZE; x++) {

                if(grid[y][x].type == 1 && grid[y+1][x].type == 1 && grid[y+2][x].type == 1 && grid[y+3][x].type == 1 && grid[y+4][x].type == 1) {

                    win = 1;

                }

                if(grid[y][x].type == 2 && grid[y+1][x].type == 2 && grid[y+2][x].type == 2 && grid[y+3][x].type == 2 && grid[y+4][x].type == 2) {

                    win = 2;

                }

            }

        }

        // 대각선 \

        for(int y=0; y<MAX_SIZE - 4; y++) {

            for(int x=0; x<MAX_SIZE - 4; x++) {

                if(grid[y][x].type == 1 && grid[y+1][x+1].type == 1 && grid[y+2][x+2].type == 1 && grid[y+3][x+3].type == 1 && grid[y+4][x+4].type == 1) {

                    win = 1;

                }                

                if(grid[y][x].type == 2 && grid[y+1][x+1].type == 2 && grid[y+2][x+2].type == 2 && grid[y+3][x+3].type == 2 && grid[y+4][x+4].type == 2) {

                    win = 2;

                }                

            }

        }

        // 대각선 /

        for(int y=MAX_SIZE - 1; y>MAX_SIZE - 7; y--) {

            for(int x=0; x<MAX_SIZE - 4; x++) {

                if(grid[y][x].type == 1 && grid[y-1][x+1].type == 1 && grid[y-2][x+2].type == 1 && grid[y-3][x+3].type == 1 && grid[y-4][x+4].type == 1) {

                    win = 1;

                }

                if(grid[y][x].type == 2 && grid[y-1][x+1].type == 2 && grid[y-2][x+2].type == 2 && grid[y-3][x+3].type == 2 && grid[y-4][x+4].type == 2) {

                    win = 2;

                }

            }

        }

        

    }

    

    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        try {

            Thread.sleep(10);

            repaint();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        

        g.setFont(new Font("", Font.BOLD, 30));

        g.drawString("나만의 오목게임", 50, 50);

        if(stoneType) {

            g.drawString("[백돌] 차례", 50, 100);

        }else {

            g.drawString("[흑돌] 차례", 50, 100);

        }

        

        for(int i=0; i<MAX_SIZE; i++) {

            // 가로

            g.drawLine(START_POS, 100 + (REC_SIZE * i), START_POS + (REC_SIZE * (MAX_SIZE - 1)), 100 + (REC_SIZE * i));

            // 세로

            g.drawLine(START_POS + (REC_SIZE * i), 100, START_POS + (REC_SIZE * i), 100 + (REC_SIZE * (MAX_SIZE - 1)));

        }

        

        for(int y=0; y<MAX_SIZE; y++) {

            for(int x=0; x<MAX_SIZE;  x++) {

                if(isShow) {

                    g.drawRect(grid[y][x].x, grid[y][x].y, grid[y][x].size, grid[y][x].size);

                }

                if(grid[y][x].type == 1) {

                    g.setColor(Color.WHITE);

                    g.fillOval(grid[y][x].x, grid[y][x].y, grid[y][x].size, grid[y][x].size);

                }

                else if(grid[y][x].type == 2) {

                    g.setColor(Color.BLACK);

                    g.fillOval(grid[y][x].x, grid[y][x].y, grid[y][x].size, grid[y][x].size);

                }

            }

        }

        

        g.setColor(Color.RED);

        g.setFont(new Font("", Font.BOLD, 30));

        if(win == 1) {

            g.drawString("[백돌] 승리!", 50, 150);

            end = true;

        }else if(win == 2) {

            g.drawString("[흑돌] 승리!", 50, 150);

            end = true;

        }

    }

    

    @Override

    public void actionPerformed(ActionEvent e) {

        if(rect == e.getSource()) {

            isShow = !isShow;

        }

        else if(reset == e.getSource()) {

            init();

        }

    }

 

    @Override

    public void mousePressed(MouseEvent e) {

        

        if(end) return;

        

        mousePos = e.getPoint();

        for(int y=0; y<MAX_SIZE; y++) {

            for(int x=0; x<MAX_SIZE; x++) {

                int minX = grid[y][x].x;

                int maxX = grid[y][x].x + grid[y][x].size;

                int minY = grid[y][x].y;

                int maxY = grid[y][x].y + grid[y][x].size;

                

                if(minX <= mousePos.x && mousePos.x <= maxX

                && minY <= mousePos.y && mousePos.y <= maxY) {

                    if(grid[y][x].type == 0) {

                        if(stoneType) {

                            grid[y][x].type = 1;

                        }else {

                            grid[y][x].type = 2;

                        }

                        judge();

                        stoneType = !stoneType;

                    }

                }

            }

        }

        

    }

 

    @Override

    public void mouseClicked(MouseEvent e) {

        // TODO Auto-generated method stub

        

    }

    

    @Override

    public void mouseReleased(MouseEvent e) {

        // TODO Auto-generated method stub

        

    }

 

    @Override

    public void mouseEntered(MouseEvent e) {

        // TODO Auto-generated method stub

        

    }

 

    @Override

    public void mouseExited(MouseEvent e) {

    }

}

 

public class Mouse12 {

    public static void main(String[] args) {

 

        int width = 800;

        int height = 600;

        

        JFrame frame = new JFrame();

        frame.setTitle("마우스 연습(7)");

        frame.setSize(width, height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        

        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension screenSize = tk.getScreenSize();

        frame.setLocation(screenSize.width/2 - width/2, screenSize.height/2 - height/2);

        

        MyPanel mp = new MyPanel();

        frame.setContentPane(mp);

        frame.revalidate();

        

    }

}