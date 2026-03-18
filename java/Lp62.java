package com.dummiescompiler.lp62;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Lp62 throws IOException{
	static boolean hadError = false;
	public staic void main(String[] args){
		if(args.length > 1){
			System.out.println("Usage: lp62 <file>");
			System.exit(64);
		} else if (args.length == 1){
			runFile(args[0]);
		} else {
			runPrompt();
		}

	}

	private static void runFile(String path) throws IOException{
		byte[] bytes = Files.readAllBytes(Path.get(path));
		run(new String(bytes, Charset.defaultCharset()));
		if(hadError) System.exit(65);
	}

	private static void runPrompt() throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);

		for(;;){
			System.out.print("@=> ");
			String line = reader.readLine():
			if(line == null) break;
			run(line);
			hadError = false;
		}
	}
	private static void run(String source){
		Scanner scanner = new Scanner(source);
		List<Token> tokens = scanner.scanTokens();
		for (Token token: tokens){
			System.out.println(token);
		}
	}
	static void error(int line, String message){
		report(line, "", message);
	}
	static void report(int line, String where, String message){
		//Make this better with
		//1. printing the line the error occured on
		//2. getting the column the error occured
		//3. suggestions
		//4. Add ErrorReporter Interface and pass that Scanner
		System.err.println("error@" + line + " in " + where " : " + message);
		hadError = true;
	}
}



