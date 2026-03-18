package com.dummiescompiler.lp62


enum TokenType{
	LEFT_PAREN, //(
	RIGHT_PAREN, //)
	LEFT_BRACE, //{
	RIGHT_BRACE, //}
	COMMA, //,
	DOT, //.
	MINUS, //-
	PLUS, //+
	SEMICOLON,// ;
	SLASH, //
	STAR, //* 
	


	BANG, //!
	BANG_EQUAL, //!=
	EQUAL, //=
	EQUAL_EQUAL // ==
	GREATER, // >
	GREATER_EQUAL, // >=
	LESS, // <
	LESS_EQUAL, //<=
	
	
	IDENTIFIER, //defintion of something like variable a function
	STRING, // "regular string"
	NUMBER, // decimal number 24334 and 2.4334
	

	AND, // and
	CLASS, //class
	ELSE, //else
	FALSE, //false
	FUN, //fun
	FOR, //for
	IF, //if
	NIL, //nil
	OR, //or
	PRINT, //print
	RETURN, //return
	SUPER, //super
	THIS, //this
	TRUE, //true
	VAR, //var
	THIS, //this
	WHILE, //while
	EOF //end of file
}
