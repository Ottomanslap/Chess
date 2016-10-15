package chess;

class Piece {
	String name;
	String pieceSymbolL;
	String pieceSymbolS;
	boolean isBlack;
	Piece(char type){
		if (type == 'p'){
			name = "White Pawn";
			pieceSymbolS = "♙";
			pieceSymbolL = "p";
			isBlack = false;
		}
		else if (type == 'P'){
			name = "Black Pawn";
			pieceSymbolS = "♟";
			pieceSymbolL = "P";
			isBlack = true;
		}
		else if (type == 'r'){
			name = "White Rook";
			pieceSymbolS = "♖";
			pieceSymbolL = "r";
			isBlack = false;
		}
		else if (type == 'R'){
			name = "Black Rook";
			pieceSymbolS = "♜";
			pieceSymbolL = "R";
			isBlack = false;
		}
		else if (type == 'k'){
			name = "White Knight";
			pieceSymbolS = "♘";
			pieceSymbolL = "k";
			isBlack = false;
		}
		else if (type == 'K'){
			name = "Black Knight";
			pieceSymbolS = "♞";
			pieceSymbolL = "K";
			isBlack = true;
		}
		else if (type == 'b'){
			name = "White Bishop";
			pieceSymbolS = "♗";
			pieceSymbolL = "b";
			isBlack = false;
		}
		else if (type == 'B'){
			name = "Black Bishop";
			pieceSymbolS = "♝";
			pieceSymbolL = "B";
			isBlack = true;
		}
		else if (type == 'a'){
			name = "White King";
			pieceSymbolS = "♔";
			pieceSymbolL = "a";
			isBlack = false;
		}
		else if (type == 'A'){
			name = "Black King";
			pieceSymbolS = "♚";
			pieceSymbolL = "A";
			isBlack = true;
		}
		else if (type == 'q'){
			name = "White Queen";
			pieceSymbolS = "♕";
			pieceSymbolL = "q";
			isBlack = false;
		}
		else if (type == 'Q'){
			name = "Black Queen";
			pieceSymbolS = "♛";
			pieceSymbolL = "Q";
			isBlack = true;
		}
	}
	public String toStringS(){
		return this.pieceSymbolS;
	}
	public String toStringL(){
		return this.pieceSymbolL;
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
