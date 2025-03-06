lexer grammar Tokenizer;


INT_REAL
	: [0-9]+ '.' [0-9]+
	;
	
INT_LITERAL
	: [0-9]+
	;

CHAR_LITERAL
	: '\'' ~[\n\r] '\''
	| '\'\\n\'' // newline
	;


LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;

SEMICOLON
	: ';' -> skip
	;



ID 
	: [a-zA-Z_][a-zA-Z0-9_]*
	;