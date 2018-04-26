package org.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class SyntaxErrorListener extends BaseErrorListener {
    public static final SyntaxErrorListener INSTANCE = new SyntaxErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) throws ParseCancellationException {

        // check if <EOF> in end of file
        if (offendingSymbol instanceof CommonToken) {
            CommonToken tok = ((CommonToken) offendingSymbol);
            TokenSource tokenSource = tok.getTokenSource();
            if (tokenSource.getInputStream().size() == tok.getStartIndex()) {
                return;
            }
        }
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}
