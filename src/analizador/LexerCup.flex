package analizador;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L = [a-zA-Z_]
D = [0-9]
espacio = [ ,\t,\r]+
%{
    private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
    }
    
    private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
    }
%}
%%
clase {return new Symbol(sym.Class, yychar, yyline, yytext());}
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
if {return new Symbol(sym.If, yychar, yyline, yytext());}
retorna {return new Symbol(sym.Return, yychar, yyline, yytext());}
imprimir {return new Symbol(sym.Print, yychar, yyline, yytext());}
{espacio} {/*Ignore*/}
"//" {/*Ignore*/}
"("  {return new Symbol(sym.LParen, yychar, yyline, yytext());}
")"  {return new Symbol(sym.RParen, yychar, yyline, yytext());}
"{"  {return new Symbol(sym.LCurly, yychar, yyline, yytext());}
"}"  {return new Symbol(sym.RCurly, yychar, yyline, yytext());}
"+"  {return new Symbol(sym.Sum, yychar, yyline, yytext());}
"-"  {return new Symbol(sym.Minus, yychar, yyline, yytext());}
"*"  {return new Symbol(sym.Multiply, yychar, yyline, yytext());}
"/"  {return new Symbol(sym.Divide, yychar, yyline, yytext());}
"^"  {return new Symbol(sym.Power, yychar, yyline, yytext());}
(">" | ">=" | "<" | "<=" | "!=" | "==") {return new Symbol(sym.Op_Logical, yychar, yyline, yytext());}
( true | false ) {return new Symbol(sym.Op_Booleano, yychar, yyline, yytext());}
"->" {return new Symbol(sym.Memb_Access, yychar, yyline, yytext());}
"="  {return new Symbol(sym.Assign, yychar, yyline, yytext());}
";"  {return new Symbol(sym.SEMICOLON, yychar, yyline, yytext());}
{L}+ {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, new Integer(yytext()));}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}