package chess;

class Square {
	boolean isBlack;
	Piece piece;
	public String toString(String SL) {
		if (piece != null){
			switch (SL){
			case "S":
				return("["+piece.toStringS()+"]");
			case "L":
				return("["+piece.toStringL()+"]");
			default :
				throw new Error("ERROR: Square recieved incorrect input for Symbol/Letter:" + SL);
			}
		}else{
			if (isBlack){
				return ("[■]");
			}else{
				return ("[ ]");
			}
		}
	}
	boolean isOccupied() {
		if (piece == null)
			return false;
		else
			return true;
	}
	void clear(){
		this.piece = null;
	}
}
