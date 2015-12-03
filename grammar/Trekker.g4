grammar Trekker;

@header {package me.isaacjordan.Trekker.Generated;}

program
	:	proc+  # prog
	;

func_end: DISMISSED;

proc	: 	proc_decl seq_com proc_end;
proc_decl: TOBOLDLYGO ID;
proc_end: BEAMMEUP;

var_decl: RESISTANCE ID;
var_set: ID MAKEITSO LITERAL;

array_decl: THENEEDS;

func_call: ENGAGE ID;

seq_com	:	command*;
command	:	'example-command';

// Numbers use KHAN notation. (A count is base, N count is mantissa)
num_decl: ('KH' 'A'+ 'N'+);

// Literals

ID		: 	LETTER (LETTER | DIGIT)*;
LITERAL	:	LETTER+ | DIGIT+;
SPACE	:	(' ' | '\t')+   -> skip ;
EOL		:	'\r'? '\n'          -> skip ;
COMMENT :	'#' ~('\r' | '\n')* '\r'? '\n'  -> skip ;
LETTER	:	'A'..'Z' | 'a'..'z';
DIGIT	:	'0'..'9';
MAIN	:	'main';

// Star Trek quotes
RESISTANCE	:	'Resistance Is'; 										// USED
THENEEDS	:	'The Needs Of The Many Outweigh The Needs Of The Few'; 	// USED
TOBOLDLYGO	:	'To Boldly Go'; 										// USED
BEAMMEUP	:	'Beam Me Up, Scotty'; 									// USED
DISMISSED	:	'Dismissed'; 											// USED
MAKEITSO	:	'Make It So'; 											// USED
ENGAGE		:	'Engage';												// USED
SETPHASERS	: 	'Set Phasers To Stun'; 									// final keyword?
WESSELS		:	'Nuclear Wessels';
GIVINGHER	:	'Im Giving Her All Shes Got, Captain!'; 				// stackoverflow exception?
DOCTORNOTA	:	'Im A Doctor, Not A...'; 								// casting types?
LIVELONG	:	'Live Long and Prosper'; 								// static variable (long lived)?
TEA			: 	'Tea. Earl Grey. Hot.';
GOODDAYTODIE:	'Today is a good day to die';