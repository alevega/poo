
public class main {

	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			new Thread(new HiloHolaMundo(i)).start();;			
		}
		
	}

}
