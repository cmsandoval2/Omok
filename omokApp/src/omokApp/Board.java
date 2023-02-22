package omokApp;

public class Board {
private final int size;
private final Stone[][] stones;
public Board(int size) {
	this.size=size;
	this.stones=new Stone[size][size];
}
public int getSize() {
	return this.size;
}
public Stone getStone(int row, int col) {
	if(!isValidPosition(row,col)) {
		throw new IllegalArgumentException("Invalid Position");
	}
	return this.stones[row][col];
}
public void placeStone(int row, int col, Player player) {
	if(!isValidPosition(row, col)) {
		throw new IllegalArgumentException("Stone already placed at the position");
	}
	this.stones[row][col]=new Stone(player);
}
public boolean isFull() {
	for(int row=0; row<this.size;row++) {
		for(int col=0;col<this.size;col++) {
			if(this.stones[row][col]==null) {
				return false;
			}
		}
	}
	return true;
}
private boolean isValidPosition(int row, int col) {
	return row>=0 && row<this.size && col>=0 && col<this.size;
}
}
