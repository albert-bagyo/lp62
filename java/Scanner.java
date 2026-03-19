package com.dummiescompiler.lp62

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.uitl.Map;

import static com.dummiescompiler.lp62.TokenType.*;
/*
class Scanner{
	private List<Token> tokens;
	private int position;
	private int line;
	Scanner(String source){
		this.position = 0;
		this.tokens = new List<Tokens>();
		this.line = 1;
	}

	public List<Token> scanTokens(){
		while(source.charAt(postion)){
			char currChar = source.charAt(position);
			switch(currChar){
				case '\n':
					line += 1;
					break;
				case '(':
				       tokens.append(
						Token(TokenType.LEFT_PAREN,
							currChar,
							currChar,
							line));
					break;
					//do same for single characters
				case '=':
					char next = source.charAt(position + 1);
					if(next + 1) == '='){

				        tokens.append(
					       Token(TokenType.EQUAL_EQUAL,
						       currChar + next,
						       chrChar + next,
						       line));
					else { if (next == '>'){
						//dosame
					}
					}
					//do same for doubles
				default:
					if(currChar.isnum):
					       handlenum();
					//skip over numbers until non numeric character;
			}
			position += 1;
		}
	

}*/
class Scanner{
  private final String source;
  private final List<Token> tokens = new ArrayList<>();
  private int start = 0;
  private int current = 0;
  private int line = 1;
  

  Scanner(String source){
	  this.source = source;
  }


 private boolean isAtEnd(){
	 return current >= source.length();
 }

 private char advance(){
	 return source.charAt(current++);
 }

 private void addToken(TokenType type, Object literal){
	 String text = source.substring(start, current)
	 tokens.add(new Token(type, text, literal , line);
	}

 private void addToken(TokenType type){
	 addToken(type, null);
 }

 private boolean match(char c){
	 if(isAtEnd()) return false;
	 if(source.charAt(current) != c) return false;
	 current++;
	 return true;
 }


 private void scanToken(){
	 char c = advance();
	 switch(c){
		case '(': addToken(LEFT_PAREN); break;
		case ')': addToken(RIGHT_PAREN); break;
		case '{': addToken(LEFT_BRACE); break;
		case '}': addToken(RIGHT_BRACE); break;
		case ',': addToken(COMMA); break;
		case '.': addToken(DOT); break;
		case '-': addToken(MINUS); break;
		case '+': addToken(PLUS); break;
		case ';': addToken(SEMICOLON); break;
		case '*': addToken(STAR); break;
		case '!':
			addToken(match('=') ? BANG_EQUAL : BANG);
			break;
		case '=':
			addToken(match('=') ? EQUAL_EQUAL : EQUAL);
			break;
		case '<':
			addToken(match('=') ? LESS_EQUAL : LESS);
			break;
		case '>':
			addToken(match('=') ? GREATER_EQUAL : GREATER);
			break;
		case '/':
		     	if(match('/')) {
				while(peek() != '\n' && isAtEnd()) advance();
			} else {
				addToken(SLASH);
			}
			break;


		default:
		    
		    Lp62.error(line, "Unrecognizable character.");
		    break;
	 }
 }
		
  List<Token> scanTokens(){
	  while(!isAtEnd()){
		  start = current;
		  scanToken();
	  }
	  tokens.add(addTokn(new Token(EOF,"",null,line));
	  return tokens;
}
