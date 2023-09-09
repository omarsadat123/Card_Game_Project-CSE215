import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Card_Game_Simulation  {
     static JFrame frame;
    static ImageIcon player1=new ImageIcon("player.png");
     static ImageIcon player2=new ImageIcon("player.png");
     static ImageIcon player3=new ImageIcon("player.png");
     static ImageIcon player4=new ImageIcon("player.png");
     static ImageIcon icon=new ImageIcon("back2.png");
     static ImageIcon icon0=new ImageIcon("s-2.png");
  	static ImageIcon icon1=new ImageIcon("s-3.png");
  	static ImageIcon icon2=new ImageIcon("s-4.png");
  	static ImageIcon icon3=new ImageIcon("s-5.png");
  	static ImageIcon icon4=new ImageIcon("s-6.png");
  	static ImageIcon icon5=new ImageIcon("s-7.png");
  	static ImageIcon icon6=new ImageIcon("s-8.png");
  	static ImageIcon icon7=new ImageIcon("s-9.png");
  	static ImageIcon icon8=new ImageIcon("s-10.png");
  	static ImageIcon icon9=new ImageIcon("s-jack.png");
  	static ImageIcon icon10=new ImageIcon("s-queen.png");
  	static ImageIcon icon11=new ImageIcon("s-king.png");
  	static ImageIcon icon12=new ImageIcon("s-ace.png");
  	static ImageIcon icon13=new ImageIcon("h-2.png");
  	static ImageIcon icon14=new ImageIcon("h-3.png");
  	static ImageIcon icon15=new ImageIcon("h-4.png");
  	static ImageIcon icon16=new ImageIcon("h-5.png");
  	static ImageIcon icon17=new ImageIcon("h-6.png");
  	static ImageIcon icon18=new ImageIcon("h-7.png");
  	static ImageIcon icon19=new ImageIcon("h-8.png");
  	static ImageIcon icon20=new ImageIcon("h-9.png");
  	static ImageIcon icon21=new ImageIcon("h-10.png");
  	static ImageIcon icon22=new ImageIcon("h-jack.png");
  	static ImageIcon icon23=new ImageIcon("h-queen.png");
  	static ImageIcon icon24=new ImageIcon("h-king.png");
  	static ImageIcon icon25=new ImageIcon("h-ace.png");
  	static ImageIcon icon26=new ImageIcon("d-2.png");
  	static ImageIcon icon27=new ImageIcon("d-3.png");
  	static ImageIcon icon28=new ImageIcon("d-4.png");
  	static ImageIcon icon29=new ImageIcon("d-5.png");
  	static ImageIcon icon30=new ImageIcon("d-6.png");
  	static ImageIcon icon31=new ImageIcon("d-7.png");
  	static ImageIcon icon32=new ImageIcon("d-8.png");
  	static ImageIcon icon33=new ImageIcon("d-9.png");
  	static ImageIcon icon34=new ImageIcon("d-10.png");
  	static ImageIcon icon35=new ImageIcon("d-jack.png");
  	static ImageIcon icon36=new ImageIcon("d-queen.png");
  	static ImageIcon icon37=new ImageIcon("d-king.png");
  	static ImageIcon icon38=new ImageIcon("d-ace.png");
  	static ImageIcon icon39=new ImageIcon("c-2.png");
  	static ImageIcon icon40=new ImageIcon("c-3.png");
  	static ImageIcon icon41=new ImageIcon("c-4.png");
  	static ImageIcon icon42=new ImageIcon("c-5.png");
  	static ImageIcon icon43=new ImageIcon("c-6.png");
  	static ImageIcon icon44=new ImageIcon("c-7.png");
  	static ImageIcon icon45=new ImageIcon("c-8.png");
  	static ImageIcon icon46=new ImageIcon("c-9.png");
  	static ImageIcon icon47=new ImageIcon("c-10.png");
  	static ImageIcon icon48=new ImageIcon("c-jack.png");
  	static ImageIcon icon49=new ImageIcon("c-queen.png");
  	static ImageIcon icon50=new ImageIcon("c-king.png");
  	static ImageIcon icon51=new ImageIcon("c-ace.png");     	
  	
	static JLabel labell = new JLabel();
	static JLabel label2 = new JLabel();
	static JLabel label3 = new JLabel();
	static JLabel label4 = new JLabel();
	static boolean checkedShuffle=false;
	
	 static int round=1;
	 static int currentWinnerIndex = -1;
	 
	 static JButton Next_Button;
	 static ArrayList<ArrayList<Integer>> playerHands = new ArrayList<>();
	 
	 static String[] suits = {"Hearts", "Clubs", "Diamonds","Spades"};
     static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
             "10", "Jack", "Queen", "King","Ace"};
     static String[] playerNames = {"Player1", "Player2", "Player3", "Player4"};
    static  int[] playerScores = new int[4];
	 
    public static void main(String[] args) {
    	
    	
    	frame = new JFrame("Card Game");
        frame.setBounds(100, 100, 864, 704);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
     	frame.setSize(1041,800);
     	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	frame.setLayout(null);
     	

     	labell .setBounds(108, 145, 202, 252);
     	labell.setIcon(new ImageIcon("back2.png"));
     	frame.add(labell );
     	
     	
     	label2 .setBounds(320, 145, 202, 252);
     	label2.setIcon(new ImageIcon("back2.png"));
     	frame.add( label2 );
     	
     	
    	label3.setBounds(532, 145, 202, 252);
    	label3.setIcon(new ImageIcon("back2.png"));
    	frame.add(label3);
    	
    	
    	label4.setIcon(new ImageIcon("back2.png"));
    	label4.setBounds(745, 145, 202, 252);
    	frame.add(label4);
    	
    	JLabel Player1_Label = new JLabel();
    	Player1_Label.setText("Player --1");
    	Player1_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
    	Player1_Label.setBounds(167, 451, 88, 30);
    	frame.add(Player1_Label);
    	
    	JLabel Player2_Label = new JLabel("Player--2");
    	Player2_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
    	Player2_Label.setBounds(371, 450, 71, 32);
    	frame.add(Player2_Label);
    	
    	JLabel Player3_Label = new JLabel("Player--3");
    	Player3_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
    	Player3_Label.setBounds(600, 450, 88, 32);
    	frame.add(Player3_Label);
    	
    	JLabel Player4_Label = new JLabel("Player--4");
    	Player4_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
    	Player4_Label.setBounds(805, 450, 82, 32);
    	frame.add(Player4_Label);
    	
    	 Next_Button = new JButton("Next");
    	Next_Button.setFocusable(false);
    	Next_Button.setEnabled(false);
    	Next_Button.setBackground(new Color(0, 128, 128));
    	Next_Button.setForeground(new Color(255, 0, 0));
    	Next_Button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			simulateRound();
                round++;
                checkedShuffle=true;
    		}
    	});
    	
    	Next_Button.setFont(new Font("Tahoma", Font.BOLD, 22));
    	Next_Button.setBounds(700, 552, 126, 51);
    	frame.add(Next_Button);
    	
    	JLabel Heading_Label = new JLabel("Card Deck Game");
    	Heading_Label.setForeground(new Color(0, 128, 0));
    	Heading_Label.setFont(new Font("Tahoma", Font.BOLD, 22));
    	Heading_Label.setHorizontalAlignment(SwingConstants.CENTER);
    	Heading_Label.setBounds(341, 11, 303, 51);
    	frame.add(Heading_Label);
    	
    	JButton Exit_Button = new JButton("Exit");
    	Exit_Button.setForeground(new Color(255, 0, 0));
    	Exit_Button.setFocusable(false);
    	Exit_Button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			 
    			System.exit(0);
    		}
    	});
    	Exit_Button.setFont(new Font("Tahoma", Font.BOLD, 22));
    	Exit_Button.setBounds(248, 554, 126, 51);
    	frame.add(Exit_Button);
    	
    	//Shuffle the deck
    	
    	JButton Shuffle_Button = new JButton("Shuffle the Deck");
    	Shuffle_Button.setFocusable(false);
    	Shuffle_Button.setEnabled(false);
    	Shuffle_Button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			Shuffle();
    			Shuffle_Button.setEnabled(false);
    			Next_Button.setEnabled(true);
    		}
    	});
    	Shuffle_Button.setFont(new Font("Tahoma", Font.BOLD, 21));
    	Shuffle_Button.setBounds(427, 553, 217, 51);
    	frame.add(Shuffle_Button);
    	
    	JButton Play_Button = new JButton("Play ");
    	Play_Button.setFocusable(false);
    	Play_Button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			Shuffle_Button.setEnabled(true);
    			
    		}
    	});
    	Play_Button.setForeground(new Color(102, 102, 255));
    	Play_Button.setFont(new Font("Tahoma", Font.BOLD, 22));
    	Play_Button.setBounds(83, 62, 160, 45);
    	frame.add(Play_Button);
    	
    	JButton Score_Button = new JButton("Score");
    	Score_Button.setFocusable(false);
    	Score_Button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			
    			if(checkedShuffle) {
    				for (int i = 0; i < 4; i++) {
    		        	JOptionPane.showMessageDialog(null,playerNames[i] + ": " + playerScores[i] + " points");
    		        	
    				}
    				JOptionPane.showMessageDialog(null, "@ Thanks for Playing @ ");
    				System.exit(0);
    			}
    			JOptionPane.showMessageDialog(null, "You are not started the game yet !!!!!"); 
    			new Card_Game_Simulation();
    			
    		}
    	});
    	Score_Button.setFont(new Font("Tahoma", Font.BOLD, 22));
    	Score_Button.setForeground(new Color(255, 0, 0));
    	Score_Button.setBounds(805, 62, 113, 39);
    	frame.add(Score_Button);
    	
    frame.setVisible(true);

 }
                  public static void Shuffle()   {                      // For Shuffle the deck Card 
                                                 
    	               int[] deck = new int[52];
         
                                                                     // Initialize deck
         for (int i = 0; i < deck.length; i++)
             deck[i] = i;

         // Shuffle the deck
         for (int i = 0; i < deck.length; i++) {
             int index = (int) (Math.random() * deck.length);
             int temp = deck[i];
             deck[i] = deck[index];
             deck[index] = temp;
         }

                                                        // Distribute the cards to 4 players
            for (int i = 0; i < 4; i++) {
             playerHands.add(new ArrayList<>());
         }

         for (int i = 0; i < deck.length; i++) {
             int playerIndex = i % 4;
             playerHands.get(playerIndex).add(deck[i]);
         }

         for (int i = 0; i < 4; i++) {
         	System.out.println("Player " + (i + 1) + "'s hand:");
             for (int cardIndex : playerHands.get(i)) {
                 String suit = suits[cardIndex / 13];
                 String rank = ranks[cardIndex % 13];
                 System.out.println(rank + " of " + suit);
                 
             }
             System.out.print("\n");
         }
   }
    public static ImageIcon IconSet(String suit,String rank) {
                	  if(rank=="2"&&suit=="Spades") {
                		  return icon0;
                     	}
                     	else if(rank=="3"&&suit=="Spades") {
                     		 return icon1;
                     	}
                     	else if(rank=="4"&&suit=="Spades") {
                     		 return icon2;
                     	}
                     	else if(rank=="5"&&suit=="Spades") {
                     		return icon3;
                     	}
                     	else if(rank=="6"&&suit=="Spades") {
                     		return icon4;
                     	}
                     	else if(rank=="7"&&suit=="Spades") {
                     		return icon5;
                     	}
                     	else if(rank=="8"&&suit=="Spades") {
                     		return icon6;
                     	}
                     	else if(rank=="9"&&suit=="Spades") {
                     		return icon7;
                     	}
                     	else if(rank=="10"&&suit=="Spades") {
                     		return icon8;
                     	}
                     	else if(rank=="Jack"&&suit=="Spades") {
                     		return icon9;
                     	}
                     	else if(rank=="Queen"&&suit=="Spades") {
                     		return icon10;
                     	}
                     	else if(rank=="King"&&suit=="Spades") {
                     		return icon11;
                     	}
                     	else if(rank=="Ace"&&suit=="Spades") {
                     		return icon12;
                     	}
                     	else if(rank=="2"&&suit=="Hearts") {
                     		return icon13;
                     	}
                     	else if(rank=="3"&&suit=="Hearts") {
                     		return icon14;
                     	}
                     	else if(rank=="4"&&suit=="Hearts") {
                     		return icon15;
                     	}
                     	else if(rank=="5"&&suit=="Hearts") {
                     		return icon16;
                     	}
                     	else if(rank=="6"&&suit=="Hearts") {
                     		return icon17;
                     	}
                     	else if(rank=="7"&&suit=="Hearts") {
                     		return icon18;
                     	}
                     	else if(rank=="8"&&suit=="Hearts") {
                     		return icon19;
                     	}
                     	else if(rank=="9"&&suit=="Hearts") {
                     		return icon20;
                     	}
                     	else if(rank=="10"&&suit=="Hearts") {
                     		return icon21;
                     	}
                     	else if(rank=="Jack"&&suit=="Hearts") {
                     		return icon22;
                     	}
                     	else if(rank=="Queen"&&suit=="Hearts") {
                     		return icon23;
                     	}
                     	else if(rank=="King"&&suit=="Hearts") {
                     		return icon24;
                     	}
                     	else if(rank=="Ace"&&suit=="Hearts") {
                     		return icon25;
                     	}
                     	else if(rank=="2"&&suit=="Diamonds") {
                     		return icon26;
                     	}
                     	else if(rank=="3"&&suit=="Diamonds") {
                     		return icon27;
                     	}
                     	else if(rank=="4"&&suit=="Diamonds") {
                     		return icon28;
                     	}
                     	else if(rank=="5"&&suit=="Diamonds") {
                     		return icon29;
                     	}
                     	else if(rank=="6"&&suit=="Diamonds") {
                     		return icon30;
                     	}
                     	else if(rank=="7"&&suit=="Diamonds") {
                     		return icon31;
                     	}
                     	else if(rank=="8"&&suit=="Diamonds") {
                     		return icon32;
                     	}
                     	else if(rank=="9"&&suit=="Diamonds") {
                     		return icon33;
                     	}
                     	else if(rank=="10"&&suit=="Diamonds") {
                     		return icon34;
                     	}
                     	else if(rank=="Jack"&&suit=="Diamonds") {
                     		return icon35;
                     	}
                     	else if(rank=="Queen"&&suit=="Diamonds") {
                     		return icon36;
                     	}
                     	else if(rank=="King"&&suit=="Diamonds") {
                     		return icon37;
                     	}
                     	else if(rank=="Ace"&&suit=="Diamonds") {
                     		return icon38;
                     	}
                     	else if(rank=="2"&&suit=="Clubs") {
                     		return icon39;
                     	}
                     	else if(rank=="3"&&suit=="Clubs") {
                     		return icon40;
                     	}
                     	else if(rank=="4"&&suit=="Clubs") {
                     		return icon41;
                     	}
                     	else if(rank=="5"&&suit=="Clubs") {
                     		return icon42;
                     	}
                     	else if(rank=="6"&&suit=="Clubs") {
                     		return icon43;
                     	}
                     	else if(rank=="7"&&suit=="Clubs") {
                     		return icon44;
                     	}
                     	else if(rank=="8"&&suit=="Clubs") {
                     		return icon45;
                     	}
                     	else if(rank=="9"&&suit=="Clubs") {
                     		return icon46;
                     	}
                     	else if(rank=="10"&&suit=="Clubs") {
                     		return icon47;
                     	}
                     	else if(rank=="Jack"&&suit=="Clubs") {
                     		return icon48;
                     	}
                     	else if(rank=="Queen"&&suit=="Clubs") {
                     		return icon49;
                     	}
                     	else if(rank=="King"&&suit=="Clubs") {
                     		return icon50;
                     	}
                     	else if(rank=="Ace"&&suit=="Clubs") {
                     		return icon51;
                     	}
					return icon;
                  }
    
                                                                   // Simulate 13 rounds
    public static void simulateRound() {
    	                 if(round<=13){
    	                    	 
       	         System.out.println("Round " + round + ":");
       
                 int highestCardIndex = -1;
                 int winnerIndex = -1;

                 int startingPlayerIndex = currentWinnerIndex != -1 ? currentWinnerIndex : 0;

                 for (int i = 0; i < 4; i++) {
               int currentPlayerIndex = (startingPlayerIndex + i) % 4;
               int currentPlayer = currentPlayerIndex;
            
               ArrayList<Integer> currentPlayerHand = playerHands.get(currentPlayer);
               
               // Find the highest card of the current suit in hand
               int maxRankIndex = -1;
               for (int cardIndex : currentPlayerHand) {
                   if (cardIndex / 13 == highestCardIndex / 13 &&
                       (maxRankIndex == -1 || cardIndex % 13 > maxRankIndex % 13)) {
                       maxRankIndex = cardIndex;
                   }
               }
               
               // If no same suit card found, throw any card
               int thrownCardIndex = maxRankIndex != -1 ? maxRankIndex : currentPlayerHand.get(0);
               currentPlayerHand.remove((Object) thrownCardIndex);

               String suit = suits[thrownCardIndex / 13];
               String rank = ranks[thrownCardIndex % 13];
               System.out.println(playerNames[currentPlayer] + " throws: " + rank + " of " + suit);
                   if(playerNames[currentPlayer]=="Player1") {
            	   labell.setIcon(IconSet(suit,rank));
                  }
                   else if(playerNames[currentPlayer]=="Player2") {
            	   label2.setIcon(IconSet(suit,rank));
                  }
                   else if(playerNames[currentPlayer]=="Player3") {
            	   label3.setIcon(IconSet(suit,rank));
                  }
                   else {
            	   label4.setIcon(IconSet(suit,rank));
                  }
               
         if (highestCardIndex == -1 ||
               	    (thrownCardIndex / 13 > highestCardIndex / 13) ||
               	    (thrownCardIndex / 13 == highestCardIndex / 13 && thrownCardIndex % 13 > highestCardIndex % 13)) {
               	    highestCardIndex = thrownCardIndex;
               	    winnerIndex = currentPlayer;
               	}
            }

           playerScores[winnerIndex]++;

       	   System.out.println("Round winner: " + playerNames[winnerIndex]+"\n");
       	
       	   currentWinnerIndex = winnerIndex;
           
          }
    	else {
    		 System.out.println("Final Scores:");
    	        for (int i = 0; i < 4; i++) {
       	         System.out.println(playerNames[i] + ": " + playerScores[i] + " points");
 	        	
       	        }
       	    	Next_Button.setEnabled(false); 	

    	}
  	}
}
