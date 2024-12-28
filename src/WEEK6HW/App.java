package WEEK6HW;

public class App {
	public static void main(String[] args) { 
		Deck deck = new Deck(); 
		Player player1 = new Player("Player 1"); 
		Player player2 = new Player("Player 2"); 
		
		deck.shuffle(); // Shuffle the deck 
		
		// Draw 52 cards (26 each) 
		for (int i = 0; i < 26; i++) { 
			player1.draw(deck); 
			player2.draw(deck); 
		} 
		
		// Play the game 
		for (int i = 0; i < 26; i++) { 
			Card player1Card = player1.flip(); 
			Card player2Card = player2.flip(); 
			if (player1Card.getValue() > player2Card.getValue()) { 
				player1.incrementScore(); 
				System.out.println("Player 1 wins this round!"); 
			} else if (player1Card.getValue() < player2Card.getValue()) { 
				player2.incrementScore(); 
				System.out.println("Player 2 wins this round!"); 
			} else { 
				System.out.println("It's a tie!");
			} 
		} 
		
		// Print final scores 
		System.out.println("Final Scores:"); 
		System.out.println(player1.getName() + ": " + player1.getScore()); 
		System.out.println(player2.getName() + ": " + player2.getScore()); 
		
		// Declare the winner 
		if (player1.getScore() > player2.getScore()) { 
			System.out.println("Player 1 wins the game!"); 
		} else if (player1.getScore() < player2.getScore()) { 
			System.out.println("Player 2 wins the game!"); 
		} else { 
			System.out.println("It's a draw!");
		} 
	}

}