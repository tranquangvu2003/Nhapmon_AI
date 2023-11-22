package student;

public class Queen {
	private int row;
	private int column;

	public Queen(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

//		// Enter your code here
	public void move() {
		int i = getRow();
		setRow(i++);
		if(getRow()>Node.N) {
			setRow(0);
		}
	}
//	 check whether this Queen can attack the given Queen (q)
	public boolean isConflict(Queen q) {
		boolean res = false;
		if (getRow() == q.getRow() || getColumn() == q.getColumn())
			res = true;

		if ((getRow() - q.getRow()) + (getColumn() - q.getColumn()) == 0)
			res = true;

		return res;
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
