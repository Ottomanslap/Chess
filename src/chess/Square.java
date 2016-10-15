package chess;

class Square {
	boolean isBlack;
	Piece piece;
	public String toString() {
		if (piece != null){
			return("["+piece.toString()+"]");
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
