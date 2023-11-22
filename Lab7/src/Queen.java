
public class Queen {
	private int row;
	private int column;

	public Queen(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public void move() {
		if (row < Node.N - 1) {
			row++;
		} else
			this.row = 0;
	}

//check whether this Queen can attack the given Queen (q)
	public boolean isConflict(Queen q) {
		// Check rows and columns
		if (row == q.getRow() || column == q.getColumn())
			return true;
		// Check diagonals
		else if (Math.abs(column - q.getColumn()) == Math.abs(row - q.getRow()))
			return true;
		return false;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "(" + row + ", " + column + ")";
	}
}
/*
 import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GA_NQueenAlgo {
    public static final int POP_SIZE = 100; // Population size
    public static final double MUTATION_RATE = 0.03;
    public static final int MAX_ITERATIONS = 1000;

    List<Node> population = new ArrayList<>();
    Random rd = new Random();

    // initialize the individuals of the population
    public void initPopulation() {
        for (int i = 0; i < POP_SIZE; i++) {
            Node ni = new Node();
            population.add(ni);
        }
    }

    // Main execution method
    public Node execute() {
        for (int iter = 0; iter < MAX_ITERATIONS; iter++) {
            List<Node> newPopulation = new ArrayList<>();

            for (int i = 0; i < POP_SIZE; i++) {
                Node x = getParentByTournamentSelection();
                Node y = getParentByTournamentSelection();

                Node child = reproduce(x, y);

                if (rd.nextDouble() < MUTATION_RATE) {
                    mutate(child);
                }

                newPopulation.add(child);
            }

            population = newPopulation;
        }

        // Find and return the best individual in the population
        Node bestIndividual = findBestIndividual();
        return bestIndividual;
    }

    // Mutate an individual by selecting a random Queen and move it to a random row.
    public void mutate(Node node) {
        node.mutate();
    }

    // Crossover x and y to reproduce a child
    public Node reproduce(Node x, Node y) {
        return x.reproduce(y);
    }

    // Select K individuals from the population at random and select the best out of these to become a parent.
    public Node getParentByTournamentSelection() {
        int tournamentSize = 5;
        Node bestIndividual = null;

        for (int i = 0; i < tournamentSize; i++) {
            Node randomIndividual = population.get(rd.nextInt(POP_SIZE));

            if (bestIndividual == null || randomIndividual.getH() < bestIndividual.getH()) {
                bestIndividual = randomIndividual;
            }
        }

        return bestIndividual;
    }

    // Find and return the best individual in the population
    private Node findBestIndividual() {
        Node bestIndividual = population.get(0);

        for (Node individual : population) {
            if (individual.getH() < bestIndividual.getH()) {
                bestIndividual = individual;
            }
        }

        return bestIndividual;
    }

    // You can add additional utility methods or adjust the code based on your requirements
} 
 
 * */
 