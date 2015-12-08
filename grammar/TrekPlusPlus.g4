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
var_set: ENTER ID expr MAKEITSO;

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
			
expr	:	KHAN
			| QAPLA;

// Numbers use KHAN notation. (A count is base, N count is mantissa)

// Star Trek quotes
RESISTANCE	:	'Resistance Is'; 										// USED
THENEEDS	:	'The Needs Of The Many Outweigh The Needs Of The Few'; 	// USED
TOBOLDLYGO	:	'To Boldly Go'; 										// USED
BEAMMEUP	:	'Beam Me Up'; 											// USED
DISMISSED	:	'Dismissed'; 											// USED
MAKEITSO	:	'Make It So'; 											// USED
ENGAGE		:	'Engage';												// USED
INITSUBROUTINE: 'Initialize Subroutine';								// USED
SETPHASERS	: 	'Set Phasers To Stun'; 									// final keyword?
WESSELS		:	'Nuclear Wessels';
GIVINGHER	:	'Im Giving Her All Shes Got, Captain!'; 				// stackoverflow exception?
DOCTORNOTA	:	'Im A Doctor, Not A...'; 								// casting types?
LIVELONG	:	'Live Long and Prosper'; 								// static variable (long lived)?
TEA			: 	'Tea. Earl Grey. Hot.';
ATEASE		:	'At ease, Ensign';
GOODDAYTODIE:	'Today is a good day to die';
QAPLA		:	'Qapla';												// USED (True)
SHIELDSUP	:	'Shields up! Red alert!';
FOURLIGHTS	:	'There are four lights!';
SHUTUP		:	'Shut up, Wesley!';
ENTER		:	'Enter';


// Literals

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
