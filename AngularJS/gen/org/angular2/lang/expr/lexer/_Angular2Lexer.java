/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.angular2.lang.expr.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;

import static org.angular2.lang.expr.lexer.Angular2TokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>angular2.flex</tt>
 */
class _Angular2Lexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYSTRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1296 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\176\2");

  /* The ZZ_CMAP_A table has 384 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\3\1\1\1\0\1\11\22\0\1\1\1\37\1\14\1\56\1\12\1\34\1\42\1\13\1\44"+
    "\1\45\1\33\1\32\1\53\1\7\1\5\1\10\12\4\1\55\1\54\1\40\1\36\1\41\1\52\1\0\4"+
    "\57\1\6\1\57\24\12\1\50\1\2\1\51\1\35\1\12\1\0\1\16\2\57\1\26\1\21\1\27\1"+
    "\12\1\31\1\30\2\12\1\20\1\12\1\24\3\12\1\17\1\23\1\22\1\25\1\15\4\12\1\46"+
    "\1\43\1\47\42\0\1\1\337\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\11\5\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\2\40\1\41\1\42\1\0\2\3\1\43"+
    "\1\5\1\44\7\5\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\0\1\3\1\56\1\57"+
    "\1\60\6\5\1\61\1\62\1\63\1\64\1\65\1\66"+
    "\1\67\1\70\2\5\1\64\1\5\1\71\1\64\3\5"+
    "\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\140\0\u0180\0\140\0\140\0\u01b0\0\u01e0\0\u0210\0\u0240"+
    "\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\140\0\140\0\140"+
    "\0\140\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\u0480\0\140\0\140"+
    "\0\140\0\140\0\u04b0\0\u04e0\0\140\0\140\0\140\0\300"+
    "\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660"+
    "\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0150\0\u0750\0\u0780\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\u07b0\0\u07e0\0\u0150"+
    "\0\140\0\u0150\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900"+
    "\0\140\0\140\0\140\0\u0930\0\u0150\0\u0150\0\u0150\0\u0150"+
    "\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0150\0\u0a20\0\u0a50\0\u0a80"+
    "\0\u0ab0\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
    "\1\12\1\4\1\10\1\13\1\14\1\15\1\16\1\10"+
    "\1\17\1\20\1\21\1\10\1\22\1\23\1\10\1\24"+
    "\1\25\1\10\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\10"+
    "\2\53\1\54\1\55\5\53\1\55\1\53\1\56\1\57"+
    "\43\53\61\0\1\4\1\60\1\4\5\0\1\4\51\0"+
    "\1\4\60\0\1\6\1\61\1\62\12\0\1\62\42\0"+
    "\1\61\57\0\1\10\1\0\1\10\3\0\1\10\2\0"+
    "\15\10\25\0\1\10\10\0\1\63\53\0\1\10\1\0"+
    "\1\10\3\0\1\10\2\0\1\10\1\64\13\10\25\0"+
    "\1\10\4\0\1\10\1\0\1\10\3\0\1\10\2\0"+
    "\6\10\1\65\6\10\25\0\1\10\4\0\1\10\1\0"+
    "\1\10\3\0\1\10\2\0\4\10\1\66\10\10\25\0"+
    "\1\10\4\0\1\10\1\0\1\10\3\0\1\10\2\0"+
    "\3\10\1\67\11\10\25\0\1\10\4\0\1\10\1\0"+
    "\1\10\3\0\1\10\2\0\2\10\1\70\11\10\1\71"+
    "\25\0\1\10\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\10\10\1\72\4\10\25\0\1\10\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\7\10\1\73\5\10"+
    "\25\0\1\10\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\1\10\1\74\13\10\25\0\1\10\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\12\10\1\75\2\10"+
    "\25\0\1\10\36\0\1\76\57\0\1\77\57\0\1\100"+
    "\57\0\1\101\63\0\1\102\60\0\1\103\21\0\1\104"+
    "\52\0\2\53\2\0\5\53\1\0\1\53\2\0\43\53"+
    "\3\105\1\0\5\105\1\0\13\105\1\106\32\105\4\0"+
    "\1\61\1\0\1\62\12\0\1\62\42\0\1\107\2\0"+
    "\1\107\22\0\1\107\25\0\3\63\1\0\5\63\1\0"+
    "\46\63\4\0\1\10\1\0\1\10\3\0\1\10\2\0"+
    "\2\10\1\110\12\10\25\0\1\10\4\0\1\10\1\111"+
    "\1\10\3\0\1\10\2\0\15\10\25\0\1\10\4\0"+
    "\1\10\1\0\1\10\3\0\1\10\2\0\5\10\1\112"+
    "\7\10\25\0\1\10\4\0\1\10\1\0\1\10\3\0"+
    "\1\10\2\0\6\10\1\113\6\10\25\0\1\10\4\0"+
    "\1\10\1\0\1\10\3\0\1\10\2\0\10\10\1\114"+
    "\4\10\25\0\1\10\4\0\1\10\1\0\1\10\3\0"+
    "\1\10\2\0\13\10\1\115\1\10\25\0\1\10\4\0"+
    "\1\10\1\0\1\10\3\0\1\10\2\0\3\10\1\116"+
    "\11\10\25\0\1\10\4\0\1\10\1\0\1\10\3\0"+
    "\1\10\2\0\11\10\1\117\3\10\25\0\1\10\4\0"+
    "\1\10\1\0\1\10\3\0\1\10\2\0\3\10\1\120"+
    "\11\10\25\0\1\10\36\0\1\121\57\0\1\122\21\0"+
    "\4\123\1\124\1\123\1\124\7\123\1\124\2\123\1\124"+
    "\4\123\2\124\27\123\1\124\4\0\1\107\57\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\4\10\1\125\10\10"+
    "\25\0\1\10\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\4\10\1\126\10\10\25\0\1\10\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\6\10\1\127\6\10"+
    "\25\0\1\10\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\3\10\1\130\11\10\25\0\1\10\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\4\10\1\131\10\10"+
    "\25\0\1\10\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\6\10\1\132\6\10\25\0\1\10\4\0\1\133"+
    "\1\0\1\133\7\0\1\133\2\0\1\133\4\0\2\133"+
    "\27\0\1\133\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\12\10\1\134\2\10\25\0\1\10\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\4\10\1\135\10\10"+
    "\25\0\1\10\4\0\1\136\1\0\1\136\7\0\1\136"+
    "\2\0\1\136\4\0\2\136\27\0\1\136\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\13\10\1\137\1\10"+
    "\25\0\1\10\4\0\1\105\1\0\1\105\7\0\1\105"+
    "\2\0\1\105\4\0\2\105\27\0\1\105\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\7\10\1\140\5\10"+
    "\25\0\1\10\4\0\1\10\1\0\1\10\3\0\1\10"+
    "\2\0\4\10\1\141\10\10\25\0\1\10\4\0\1\10"+
    "\1\0\1\10\3\0\1\10\2\0\11\10\1\142\3\10"+
    "\25\0\1\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2784];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\5\1\1\11\1\1\2\11\11\1\4\11"+
    "\6\1\6\11\1\1\4\11\2\1\3\11\1\0\17\1"+
    "\6\11\1\0\2\1\1\11\7\1\3\11\17\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private char quote;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _Angular2Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 59: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 60: break;
          case 3: 
            { return NUMERIC_LITERAL;
            } 
            // fall through
          case 61: break;
          case 4: 
            { return DOT;
            } 
            // fall through
          case 62: break;
          case 5: 
            { return IDENTIFIER;
            } 
            // fall through
          case 63: break;
          case 6: 
            { return MINUS;
            } 
            // fall through
          case 64: break;
          case 7: 
            { return DIV;
            } 
            // fall through
          case 65: break;
          case 8: 
            { yybegin(YYSTRING); quote = '\''; return STRING_LITERAL_PART;
            } 
            // fall through
          case 66: break;
          case 9: 
            { yybegin(YYSTRING); quote = '"'; return STRING_LITERAL_PART;
            } 
            // fall through
          case 67: break;
          case 10: 
            { return PLUS;
            } 
            // fall through
          case 68: break;
          case 11: 
            { return MULT;
            } 
            // fall through
          case 69: break;
          case 12: 
            { return PERC;
            } 
            // fall through
          case 70: break;
          case 13: 
            { return XOR;
            } 
            // fall through
          case 71: break;
          case 14: 
            { return EQ;
            } 
            // fall through
          case 72: break;
          case 15: 
            { return EXCL;
            } 
            // fall through
          case 73: break;
          case 16: 
            { return LT;
            } 
            // fall through
          case 74: break;
          case 17: 
            { return GT;
            } 
            // fall through
          case 75: break;
          case 18: 
            { return AND;
            } 
            // fall through
          case 76: break;
          case 19: 
            { return OR;
            } 
            // fall through
          case 77: break;
          case 20: 
            { return LPAR;
            } 
            // fall through
          case 78: break;
          case 21: 
            { return RPAR;
            } 
            // fall through
          case 79: break;
          case 22: 
            { return LBRACE;
            } 
            // fall through
          case 80: break;
          case 23: 
            { return RBRACE;
            } 
            // fall through
          case 81: break;
          case 24: 
            { return LBRACKET;
            } 
            // fall through
          case 82: break;
          case 25: 
            { return RBRACKET;
            } 
            // fall through
          case 83: break;
          case 26: 
            { return QUEST;
            } 
            // fall through
          case 84: break;
          case 27: 
            { return COMMA;
            } 
            // fall through
          case 85: break;
          case 28: 
            { return SEMICOLON;
            } 
            // fall through
          case 86: break;
          case 29: 
            { return COLON;
            } 
            // fall through
          case 87: break;
          case 30: 
            { return SHARP;
            } 
            // fall through
          case 88: break;
          case 31: 
            { return STRING_LITERAL_PART;
            } 
            // fall through
          case 89: break;
          case 32: 
            { yypushback(yytext().length()); yybegin(YYINITIAL);
            } 
            // fall through
          case 90: break;
          case 33: 
            { if (quote == '\'') yybegin(YYINITIAL); return STRING_LITERAL_PART;
            } 
            // fall through
          case 91: break;
          case 34: 
            { if (quote == '"') yybegin(YYINITIAL); return STRING_LITERAL_PART;
            } 
            // fall through
          case 92: break;
          case 35: 
            { return END_OF_LINE_COMMENT;
            } 
            // fall through
          case 93: break;
          case 36: 
            { return AS_KEYWORD;
            } 
            // fall through
          case 94: break;
          case 37: 
            { return IF_KEYWORD;
            } 
            // fall through
          case 95: break;
          case 38: 
            { return EQEQ;
            } 
            // fall through
          case 96: break;
          case 39: 
            { return NE;
            } 
            // fall through
          case 97: break;
          case 40: 
            { return LE;
            } 
            // fall through
          case 98: break;
          case 41: 
            { return GE;
            } 
            // fall through
          case 99: break;
          case 42: 
            { return ANDAND;
            } 
            // fall through
          case 100: break;
          case 43: 
            { return OROR;
            } 
            // fall through
          case 101: break;
          case 44: 
            { return ELVIS;
            } 
            // fall through
          case 102: break;
          case 45: 
            { return ESCAPE_SEQUENCE;
            } 
            // fall through
          case 103: break;
          case 46: 
            { return VAR_KEYWORD;
            } 
            // fall through
          case 104: break;
          case 47: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 2);
            { return IDENTIFIER;
            } 
            // fall through
          case 105: break;
          case 48: 
            { return LET_KEYWORD;
            } 
            // fall through
          case 106: break;
          case 49: 
            { return EQEQEQ;
            } 
            // fall through
          case 107: break;
          case 50: 
            { return NEQEQ;
            } 
            // fall through
          case 108: break;
          case 51: 
            { yypushback(1); return INVALID_ESCAPE_SEQUENCE;
            } 
            // fall through
          case 109: break;
          case 52: 
            { return INVALID_ESCAPE_SEQUENCE;
            } 
            // fall through
          case 110: break;
          case 53: 
            { return ELSE_KEYWORD;
            } 
            // fall through
          case 111: break;
          case 54: 
            { return TRUE_KEYWORD;
            } 
            // fall through
          case 112: break;
          case 55: 
            { return THIS_KEYWORD;
            } 
            // fall through
          case 113: break;
          case 56: 
            { return NULL_KEYWORD;
            } 
            // fall through
          case 114: break;
          case 57: 
            { return FALSE_KEYWORD;
            } 
            // fall through
          case 115: break;
          case 58: 
            { return UNDEFINED_KEYWORD;
            } 
            // fall through
          case 116: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
