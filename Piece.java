
public class Piece {
	
	String team;
	String type;
	int value;
	boolean hasMoved;
	
	public Piece(String pieceTeam, String pieceType) {
		team = pieceTeam;
		type = pieceType;
		hasMoved = false;
		
		value = pieceValue(type);
	}
	
	
	
	
	public int pieceValue(String type) {
		switch(type) {
			case "pawn":
				return 1;
			case "rook":
				return 5;
			case "knight":
				return 3;
			case "bishop":
				return 3;
			case "queen":
				return 8;
			case "king":
				return 100;
		}
		return -1;
	}
	
	// getters and setters
	
	public String getTeam() {
		return team;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String newType) {
		this.type = newType;
	}
	
	public boolean getHasMoved() {
		return hasMoved;
	}
	
	public void setHasMoved(boolean bool) {
		this.hasMoved = bool;
	}
	
	public int getValue() {
		return value;
	}
	
}
