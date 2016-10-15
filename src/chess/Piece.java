package chess;

class Piece {
	String name;
	String pieceSymbol;
	boolean isBlack;
	Piece(char type){
		if (type == 'p'){
			name = "White Pawn";
			//pieceSymbol = "♙";
			pieceSymbol = "p";
			isBlack = false;
		}
		else if (type == 'P'){
			name = "Black Pawn";
			//pieceSymbol = "♟";
			pieceSymbol = "P";
			isBlack = true;
		}
		else if (type == 'r'){
			name = "White Rook";
			//pieceSymbol = "♖";
			pieceSymbol = "r";
			isBlack = false;
		}
		else if (type == 'R'){
			name = "Black Rook";
			//pieceSymbol = "♜";
			pieceSymbol = "R";
			isBlack = false;
		}
		else if (type == 'k'){
			name = "White Knight";
			//pieceSymbol = "♘";
			pieceSymbol = "k";
			isBlack = false;
		}
		else if (type == 'K'){
			name = "Black Knight";
			//pieceSymbol = "♞";
			pieceSymbol = "K";
			isBlack = true;
		}
		else if (type == 'b'){
			name = "White Bishop";
			//pieceSymbol = "♗";
			pieceSymbol = "b";
			isBlack = false;
		}
		else if (type == 'B'){
			name = "Black Bishop";
			//pieceSymbol = "♝";
			pieceSymbol = "B";
			isBlack = true;
		}
		else if (type == 'a'){
			name = "White King";
			//pieceSymbol = "♔";
			pieceSymbol = "a";
			isBlack = false;
		}
		else if (type == 'A'){
			name = "Black King";
			//pieceSymbol = "♚";
			pieceSymbol = "A";
			isBlack = true;
		}
		else if (type == 'q'){
			name = "White Queen";
			//pieceSymbol = "♕";
			pieceSymbol = "q";
			isBlack = false;
		}
		else if (type == 'Q'){
			name = "Black Queen";
			//pieceSymbol = "♛";
			pieceSymbol = "Q";
			isBlack = true;
		}
	}
	public String toString(){
		return this.pieceSymbol;
	}
	public boolean isBlack(){				
		return this.isBlack;
	}
	public static boolean isValid (char trial){
		if (trial == 'p' || trial == 'P' || trial == 'r' || trial == 'R' || trial == 'k' || trial == 'K' || trial == 'b' || trial == 'B' || trial == 'a' || trial == 'A' || trial == 'q' || trial == 'Q' || trial == 'x')
			return true;
		else
			return false;
	}
	
}
