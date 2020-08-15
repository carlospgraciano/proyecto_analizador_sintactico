
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Aug 15 01:59:52 BOT 2020
//----------------------------------------------------

package analizador;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Aug 15 01:59:52 BOT 2020
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\006\000\002\002" +
    "\007\000\002\002\010\000\002\002\010\000\002\002\007" +
    "\000\002\002\011\000\002\004\003\000\002\004\004\000" +
    "\002\003\003\000\002\003\003\000\002\003\003\000\002" +
    "\003\003\000\002\003\003\000\002\017\003\000\002\017" +
    "\005\000\002\017\005\000\002\017\005\000\002\017\005" +
    "\000\002\017\005\000\002\005\005\000\002\005\007\000" +
    "\002\006\003\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\012\006\000\002\012\006\000\002\014" +
    "\006\000\002\014\006\000\002\013\011\000\002\011\005" +
    "\000\002\011\006\000\002\011\006\000\002\010\006\000" +
    "\002\010\010\000\002\007\006\000\002\007\005\000\002" +
    "\015\010" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\004\004\004\001\002\000\004\031\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\014\010\001\002\000\016\005\021\006\013\007" +
    "\012\010\024\015\025\031\022\001\002\000\016\005\ufff5" +
    "\006\ufff5\007\ufff5\010\ufff5\015\ufff5\031\ufff5\001\002\000" +
    "\004\024\127\001\002\000\004\012\113\001\002\000\016" +
    "\005\ufff8\006\ufff8\007\ufff8\010\ufff8\015\ufff8\031\ufff8\001" +
    "\002\000\016\005\021\006\013\007\012\010\024\015\106" +
    "\031\022\001\002\000\016\005\ufffa\006\ufffa\007\ufffa\010" +
    "\ufffa\015\ufffa\031\ufffa\001\002\000\004\014\102\001\002" +
    "\000\016\005\ufff7\006\ufff7\007\ufff7\010\ufff7\015\ufff7\031" +
    "\ufff7\001\002\000\004\031\070\001\002\000\004\012\063" +
    "\001\002\000\016\005\ufff4\006\ufff4\007\ufff4\010\ufff4\015" +
    "\ufff4\031\ufff4\001\002\000\004\024\034\001\002\000\004" +
    "\002\000\001\002\000\016\005\ufff6\006\ufff6\007\ufff6\010" +
    "\ufff6\015\ufff6\031\ufff6\001\002\000\014\005\021\006\013" +
    "\007\012\010\024\015\031\001\002\000\014\005\021\006" +
    "\013\007\012\010\024\015\033\001\002\000\004\002\uffff" +
    "\001\002\000\016\005\ufff9\006\ufff9\007\ufff9\010\ufff9\015" +
    "\ufff9\031\ufff9\001\002\000\004\002\ufffe\001\002\000\006" +
    "\030\035\031\037\001\002\000\016\016\ufff3\017\ufff3\020" +
    "\ufff3\021\ufff3\022\ufff3\026\ufff3\001\002\000\016\016\051" +
    "\017\052\020\054\021\055\022\050\026\053\001\002\000" +
    "\004\012\042\001\002\000\004\026\041\001\002\000\016" +
    "\005\uffe4\006\uffe4\007\uffe4\010\uffe4\015\uffe4\031\uffe4\001" +
    "\002\000\010\013\045\030\043\031\044\001\002\000\004" +
    "\013\047\001\002\000\004\013\046\001\002\000\004\026" +
    "\uffe2\001\002\000\004\026\uffe0\001\002\000\004\026\uffe1" +
    "\001\002\000\004\030\035\001\002\000\004\030\035\001" +
    "\002\000\004\030\035\001\002\000\016\005\uffe5\006\uffe5" +
    "\007\uffe5\010\uffe5\015\uffe5\031\uffe5\001\002\000\004\030" +
    "\035\001\002\000\004\030\035\001\002\000\016\016\uffef" +
    "\017\uffef\020\uffef\021\uffef\022\050\026\uffef\001\002\000" +
    "\016\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022\050\026\ufff0" +
    "\001\002\000\016\016\ufff1\017\ufff1\020\054\021\055\022" +
    "\050\026\ufff1\001\002\000\016\016\ufff2\017\ufff2\020\054" +
    "\021\055\022\050\026\ufff2\001\002\000\016\016\uffee\017" +
    "\uffee\020\uffee\021\uffee\022\050\026\uffee\001\002\000\004" +
    "\013\064\001\002\000\004\014\065\001\002\000\012\005" +
    "\021\006\013\007\012\010\024\001\002\000\014\005\021" +
    "\006\013\007\012\010\024\015\067\001\002\000\014\005" +
    "\uffdb\006\uffdb\007\uffdb\010\uffdb\015\uffdb\001\002\000\010" +
    "\012\072\025\073\026\071\001\002\000\016\005\uffed\006" +
    "\uffed\007\uffed\010\uffed\015\uffed\031\uffed\001\002\000\006" +
    "\005\077\013\076\001\002\000\004\030\074\001\002\000" +
    "\004\026\075\001\002\000\016\005\uffec\006\uffec\007\uffec" +
    "\010\uffec\015\uffec\031\uffec\001\002\000\004\014\uffdf\001" +
    "\002\000\004\031\100\001\002\000\004\013\101\001\002" +
    "\000\004\014\uffde\001\002\000\014\005\021\006\013\007" +
    "\012\010\024\015\104\001\002\000\014\005\021\006\013" +
    "\007\012\010\024\015\105\001\002\000\016\005\uffdc\006" +
    "\uffdc\007\uffdc\010\uffdc\015\uffdc\031\uffdc\001\002\000\016" +
    "\005\uffdd\006\uffdd\007\uffdd\010\uffdd\015\uffdd\031\uffdd\001" +
    "\002\000\004\002\ufffc\001\002\000\014\005\021\006\013" +
    "\007\012\010\024\015\111\001\002\000\014\005\021\006" +
    "\013\007\012\010\024\015\112\001\002\000\004\002\ufffd" +
    "\001\002\000\004\002\ufffb\001\002\000\006\011\115\031" +
    "\116\001\002\000\004\013\123\001\002\000\004\013\uffeb" +
    "\001\002\000\004\023\117\001\002\000\010\011\121\030" +
    "\120\031\122\001\002\000\004\013\uffe9\001\002\000\004" +
    "\013\uffea\001\002\000\004\013\uffe8\001\002\000\004\014" +
    "\124\001\002\000\012\005\021\006\013\007\012\010\024" +
    "\001\002\000\004\015\126\001\002\000\016\005\uffe3\006" +
    "\uffe3\007\uffe3\010\uffe3\015\uffe3\031\uffe3\001\002\000\006" +
    "\030\035\031\037\001\002\000\016\016\051\017\052\020" +
    "\054\021\055\022\050\026\133\001\002\000\004\026\132" +
    "\001\002\000\016\005\uffe6\006\uffe6\007\uffe6\010\uffe6\015" +
    "\uffe6\031\uffe6\001\002\000\016\005\uffe7\006\uffe7\007\uffe7" +
    "\010\uffe7\015\uffe7\031\uffe7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\024" +
    "\003\015\004\014\005\013\007\022\010\016\012\010\013" +
    "\017\014\025\015\026\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\022\003" +
    "\031\005\013\007\022\010\016\012\010\013\017\014\025" +
    "\015\106\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\022\003\015\004\027\005\013\007\022\010\016" +
    "\012\010\013\017\014\025\001\001\000\020\003\031\005" +
    "\013\007\022\010\016\012\010\013\017\014\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\011\037\017\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\017\061\001\001\000\004\017\060\001\001\000\004" +
    "\017\057\001\001\000\002\001\001\000\004\017\056\001" +
    "\001\000\004\017\055\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\022\003\015" +
    "\004\065\005\013\007\022\010\016\012\010\013\017\014" +
    "\025\001\001\000\020\003\031\005\013\007\022\010\016" +
    "\012\010\013\017\014\025\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\022\003\015\004\102\005\013\007\022\010\016\012" +
    "\010\013\017\014\025\001\001\000\020\003\031\005\013" +
    "\007\022\010\016\012\010\013\017\014\025\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\022" +
    "\003\015\004\107\005\013\007\022\010\016\012\010\013" +
    "\017\014\025\001\001\000\020\003\031\005\013\007\022" +
    "\010\016\012\010\013\017\014\025\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\113\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\020\003\124\005\013\007\022\010" +
    "\016\012\010\013\017\014\025\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\011\130\017\127\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // CONSTRUCTOR ::= Identificador LParen RParen LCurly LISTA_SENTENCIA RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONSTRUCTOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // FUNCTION ::= DECL_FUNCTION LCurly RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCTION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // FUNCTION ::= DECL_FUNCTION LCurly LISTA_SENTENCIA RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCTION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // DECL_FUNCTION ::= Int Identificador LParen Int Identificador RParen 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECL_FUNCTION",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // DECL_FUNCTION ::= Int Identificador LParen RParen 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECL_FUNCTION",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // CALL_FUNCTION ::= Identificador LParen Identificador RParen 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CALL_FUNCTION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // CALL_FUNCTION ::= Identificador LParen Numero RParen 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CALL_FUNCTION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // CALL_FUNCTION ::= Identificador LParen RParen 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CALL_FUNCTION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // IF ::= If LParen SENTENCIA_BOOLEANA RParen LCurly SENTENCIA RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // IMPRIMIR ::= Print Memb_Access CALL_FUNCTION SEMICOLON 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // IMPRIMIR ::= Print Memb_Access EXPRESSION SEMICOLON 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RETORNAR ::= Return Memb_Access CALL_FUNCTION SEMICOLON 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNAR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RETORNAR ::= Return Memb_Access EXPRESSION SEMICOLON 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNAR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Identificador Op_Logical Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENTENCIA_BOOLEANA ::= Identificador Op_Logical Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SENTENCIA_BOOLEANA ::= Identificador Op_Logical Op_Booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENTENCIA_BOOLEANA ::= Op_Booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Int Identificador Assign Numero SEMICOLON 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Int Identificador SEMICOLON 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESSION ::= EXPRESSION Power EXPRESSION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Integer((int) Math.pow((int)e1, (int)e2)); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESSION ::= EXPRESSION Divide EXPRESSION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Integer((int)e1 / (int)e2); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRESSION ::= EXPRESSION Multiply EXPRESSION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Integer((int)e1 * (int)e2); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESSION ::= EXPRESSION Minus EXPRESSION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Integer((int)e1 - (int)e2);  
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPRESSION ::= EXPRESSION Sum EXPRESSION 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Integer((int)e1 + (int)e2);  
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPRESSION ::= Numero 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Integer(e); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= FUNCTION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= RETORNAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= IMPRIMIR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTA_SENTENCIA ::= LISTA_SENTENCIA SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_SENTENCIA",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTA_SENTENCIA ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_SENTENCIA",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INICIO ::= Class Identificador LCurly LISTA_SENTENCIA CONSTRUCTOR LISTA_SENTENCIA RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INICIO ::= Class Identificador LCurly LISTA_SENTENCIA RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= Class Identificador LCurly LISTA_SENTENCIA CONSTRUCTOR RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= Class Identificador LCurly CONSTRUCTOR LISTA_SENTENCIA RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Class Identificador LCurly CONSTRUCTOR RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Class Identificador LCurly RCurly 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
