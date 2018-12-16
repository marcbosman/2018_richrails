package antlrDSL;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


@SuppressWarnings("unused")
public class richrailsClient {
    public static void main(String[] args) throws Exception {

        // create a CharStream that reads from standard input
        // CharStream input = CharStreams.fromStream(System.in);
    	
        CharStream is = CharStreams.fromString("remove train jeroen");
        
        richrailsLexer lexer = new richrailsLexer(is);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        richrailsParser parser = new richrailsParser(tokens);
        
        ParserRuleContext commandContext = parser.command();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        richrailsCommand listener = new richrailsCommand();

        walker.walk(listener, commandContext);
    }

}
