package student;

public class Test {
		public static void main(String[] args) {
			Node initialState = new Node();

			HillClimbSearch algo = new HillClimbSearch();
			Node res = algo.executeWithRandomRestart(initialState);
			System.out.println("H:"+res.getH());
			System.out.println("Hill climbing:");
			res.displayBoard();

			SAAlgo_NQueen sAAlgo = new SAAlgo_NQueen();
			Node result = sAAlgo.execute(initialState);
			System.out.println("H:"+result.getH());
			System.out.println("SA:");
			result.displayBoard();
	}
}