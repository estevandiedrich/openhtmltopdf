/*
 * {{{ header & license
 * Copyright (c) 2007 Wisconsin Court System
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.css.parser;

public class Token {
    public static final int S = 1;
    public static final int CDO = 2;
    public static final int CDC = 3;
    public static final int INCLUDES = 4;
    public static final int DASHMATCH = 5;
    public static final int LBRACE = 6;
    public static final int PLUS = 7;
    public static final int GREATER = 8;
    public static final int COMMA = 9;
    public static final int STRING = 10;
    public static final int INVALID = 11;
    public static final int IDENT = 12;
    public static final int HASH = 13;
    public static final int IMPORT_SYM = 14;
    public static final int PAGE_SYM = 15;
    public static final int MEDIA_SYM = 16;
    public static final int CHARSET_SYM = 17;
    public static final int IMPORTANT_SYM = 18;
    public static final int EMS = 19;
    public static final int EXS = 20;
    public static final int LENGTH = 21;
    public static final int ANGLE = 22;
    public static final int TIME = 23;
    public static final int FREQ = 24;
    public static final int DIMENSION = 25;
    public static final int PERCENTAGE = 26;
    public static final int NUMBER = 27;
    public static final int URI = 28;
    public static final int FUNCTION = 29;
    public static final int OTHER = 30;
    public static final int RBRACE = 31;
    public static final int SEMICOLON = 32;
    public static final int VIRGULE = 33;
    public static final int COLON = 34;
    public static final int MINUS = 35;
    public static final int RPAREN = 36;
    public static final int LBRACKET = 37;
    public static final int RBRACKET = 38;
    public static final int PERIOD = 39;
    public static final int EQUALS = 40;
    public static final int ASTERISK = 41;
    public static final int EOF = 42;

    public static final Token TK_S = new Token(S, "S", "whitespace");
    public static final Token TK_CDO = new Token(CDO, "CDO", "<!--");
    public static final Token TK_CDC = new Token(CDC, "CDC", "-->");
    public static final Token TK_INCLUDES = new Token(INCLUDES, "INCLUDES", "an attribute word match");
    public static final Token TK_DASHMATCH = new Token(DASHMATCH, "DASHMATCH", "an attribute hyphen match");
    public static final Token TK_LBRACE = new Token(LBRACE, "LBRACE", "a {");
    public static final Token TK_PLUS = new Token(PLUS, "PLUS", "a +");
    public static final Token TK_GREATER = new Token(GREATER, "GREATER", "a >");
    public static final Token TK_COMMA = new Token(COMMA, "COMMA", "a comma");
    public static final Token TK_STRING = new Token(STRING, "STRING", "a string");
    public static final Token TK_INVALID = new Token(INVALID, "INVALID", "an unclosed string");
    public static final Token TK_IDENT = new Token(IDENT, "IDENT", "an identifier");
    public static final Token TK_HASH = new Token(HASH, "HASH", "a hex color");
    public static final Token TK_IMPORT_SYM = new Token(IMPORT_SYM, "IMPORT_SYM", "@import");
    public static final Token TK_PAGE_SYM = new Token(PAGE_SYM, "PAGE_SYM", "@page");
    public static final Token TK_MEDIA_SYM = new Token(MEDIA_SYM, "MEDIA_SYM", "@media");
    public static final Token TK_CHARSET_SYM = new Token(CHARSET_SYM, "CHARSET_SYM", "@charset");
    public static final Token TK_IMPORTANT_SYM = new Token(IMPORTANT_SYM, "IMPORTANT_SYM", "!important");
    public static final Token TK_EMS = new Token(EMS, "EMS", "an em value");
    public static final Token TK_EXS = new Token(EXS, "EXS", "an ex value");
    public static final Token TK_LENGTH = new Token(LENGTH, "LENGTH", "a length value");
    public static final Token TK_ANGLE = new Token(ANGLE, "ANGLE", "an angle value");
    public static final Token TK_TIME = new Token(TIME, "TIME", "a time value");
    public static final Token TK_FREQ = new Token(FREQ, "FREQ", "a freq value");
    public static final Token TK_DIMENSION = new Token(DIMENSION, "DIMENSION", "a dimension");
    public static final Token TK_PERCENTAGE = new Token(PERCENTAGE, "PERCENTAGE", "a percentage");
    public static final Token TK_NUMBER = new Token(NUMBER, "NUMBER", "a number");
    public static final Token TK_URI = new Token(URI, "URI", "a URI");
    public static final Token TK_FUNCTION = new Token(FUNCTION, "FUNCTION", "function");
    public static final Token TK_OTHER = new Token(OTHER, "OTHER", "other");
    public static final Token TK_RBRACE = new Token(RBRACE, "RBRACE", "}");
    public static final Token TK_SEMICOLON = new Token(SEMICOLON, "SEMICOLON", ";");
    public static final Token TK_VIRGULE = new Token(VIRGULE, "VIRGULE", "/");
    public static final Token TK_COLON = new Token(COLON, "COLON", ":");
    public static final Token TK_MINUS = new Token(MINUS, "MINUS", "-");
    public static final Token TK_RPAREN = new Token(RPAREN, "RPAREN", ")");
    public static final Token TK_LBRACKET = new Token(LBRACKET, "LBRACKET", "[");
    public static final Token TK_RBRACKET = new Token(RBRACKET, "RBRACKET", "]");
    public static final Token TK_PERIOD = new Token(PERIOD, "PERIOD", ".");
    public static final Token TK_EQUALS = new Token(EQUALS, "EQUALS", "=");
    public static final Token TK_ASTERISK = new Token(ASTERISK, "ASTERISK", "*");
    public static final Token TK_EOF = new Token(EOF, "EOF", "end of file");
  
    private final int _type;
    private final String _name;
    private final String _externalName;
  
    private Token(int type, String name, String externalName) {
        _type = type;
        _name = name;
        _externalName = externalName;
    }
    
    public int getType() {
        return _type;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getExternalName() {
        return _externalName;
    }
    
    public String toString() {
        return _name;
    }
    
    public static Token createOtherToken(String value) {
        return new Token(OTHER, "OTHER", value);
    }
}
