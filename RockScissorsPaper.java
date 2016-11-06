class RockScissorsPaper {
	String sel1, sel2;
	
	public RockScissorsPaper(String sel1, String sel2) {
		this.sel1 = sel1;
		this.sel2 = sel2;
		
		rsp(sel1, sel2);
	}
	
	public void rsp(String sel1, String sel2) {
		if (sel1.equals("Scissors")) {
			if (sel2.equals("Rock"))
				System.out.println("player2 win!");
			else if (sel2.equals("Paper"))
				System.out.println("player1 win!");
			else
				System.out.println("draw!");
		}
		else if (sel1.equals("Rock")) {
			if (sel2.equals("Scissors"))
				System.out.println("player1 win!");
			else if (sel2.equals("Paper"))
				System.out.println("player2 win!");
			else
				System.out.println("draw!");
		}
		else {
			if (sel2.equals("Scissors"))
				System.out.println("player2 win!");
			else if (sel2.equals("Rock"))
				System.out.println("player1 win!");
			else
				System.out.println("draw!");
		}
	}
	
	public static void main(String[] args) {
		String sel1 = "Paper";
		String sel2 = "Rock";
		
		System.out.println("player1: " + sel1 + ",player2: " + sel2);
		RockScissorsPaper rps = new RockScissorsPaper(sel1, sel2);
	}
}