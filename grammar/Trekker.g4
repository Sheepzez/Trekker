grammar Trekker;

program
	:	var_decl* func_decl+ main_func EOF  # prog
	;
	
var_decl : 'var' EOL;

func_decl: 'function' EOL;

main_func: 'function main' EOL;

SPACE	:	(' ' | '\t')+   -> skip ;
EOL	:	'\r'? '\n'          -> skip ;
COMMENT :	'#' ~('\r' | '\n')* '\r'? '\n'  -> skip ;