package com.dummiescompiler.lp62

class Token{
	final String lexeme;
	final int line;
	final TokenType type;
	final Object literal;


	Token(Tokentype type, String lexem, Object literal, int line){
		self.type = type;
		self.lexeme = lexem;
		self.literal = leteral;
		self.line = line;
	}

	public String toString(){
		return line + " : " + type + " " + lexeme + " " literal
	}
}
