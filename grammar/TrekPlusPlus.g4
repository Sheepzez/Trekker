grammar TrekPlusPlus;

@header {package me.isaacjordan.TrekPlusPlus.Generated;}

program
	:	proc+ func*
	;
	

func		:	func_decl seq_com func_end;
func_decl	:	INITSUBROUTINE ID LPAR RPAR;
func_end	:	DISMISSED;
func_call	: 	ENGAGE ID;

proc	: 	proc_decl seq_com proc_end;
proc_decl: TOBOLDLYGO ID;
proc_end: BEAMMEUP;

var_decl: RESISTANCE ID;
var_set: ID expr MAKEITSO;

array_decl: THENEEDS;

return_statement	:	'return' expr;

seq_com	:	command*;
command	:	'example-command'
			| array_decl
			| func_call
			| var_decl
			| var_set
			| return_statement
			;
			
literal	:	KHAN
			| QAPLA;
			
expr	:	literal
		|	ID
		|	expr COMP expr
		;


// Numbers use KHAN notation. (A count is base, N count is mantissa)

// Star Trek quotes
RESISTANCE	:	'Resistance Is'; 										// USED (Variable Assignment)
THENEEDS	:	'The Needs Of The Many Outweigh The Needs Of The Few'; 	// USED (Array Declaration)
TOBOLDLYGO	:	'To Boldly Go'; 										// USED (Procedure Declaration)
BEAMMEUP	:	'Beam Me Up'; 											// USED (Procedure End)
DISMISSED	:	'Dismissed'; 											// USED (Function End)
MAKEITSO	:	'Make It So'; 											// USED (Variable Assignment)
ENGAGE		:	'Engage';												// USED (Function Call)
INITSUBROUTINE: 'Initialize Subroutine';								// USED (Function Declaration)
SETPHASERS	: 	'Set Phasers To Stun'; 									// final keyword?
WESSELS		:	'Nuclear Wessels';
GIVINGHER	:	'Im Giving Her All Shes Got, Captain!'; 				// overflow exception?
DOCTORNOTA	:	'Im A Doctor, Not A...'; 								// casting types?
LIVELONG	:	'Live Long and Prosper'; 								// static variable (long lived)?
TEA			: 	'Tea. Earl Grey. Hot.';
ATEASE		:	'At ease, Ensign';
GOODDAYTODIE:	'Today is a good day to die';
QAPLA		:	'Qapla';												// USED (Boolean True Literal)
SHIELDSUP	:	'Shields up! Red alert!';
FOURLIGHTS	:	'There are four lights!';
SHUTUP		:	'Shut up, Wesley!';
ENTER		:	'Enter';
REPORT		:	'Report';												// String input?


// Literals

EQ		:	'=';
GT		:	'>';
LT		:	'<';
COMP	:	(EQ EQ) | (GT EQ?) | (LT EQ?);
FALSE	:	'False';
BOOL	:	QAPLA | FALSE;
KHAN	:	'KH' 'A'+ 'N'+;
ID		: 	LETTER (LETTER | DIGIT)*;
LITERAL	:	DIGIT+;
LETTER	:	'A'..'Z' | 'a'..'z' | '_';
DIGIT	:	'0'..'9';
LPAR	:	'(';
RPAR	:	')';
SPACE	:	(' ' | '\t')+   -> skip ;
EOL		:	'\r'? '\n'          -> skip ;
COMMENT :	(('#' ~('\r' | '\n')* '\r'? '\n') | ('/*' .*? '*/'))  -> skip ;
