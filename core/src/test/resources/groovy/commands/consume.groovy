import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;
import org.crsh.command.ScriptException;
import org.crsh.command.Description;
import org.crsh.command.CommandContext;

@Description("Collect a set of nodes")
public class addnode extends org.crsh.command.BaseCommand<Node, Node> {
  public void execute(CommandContext<Node, Void> context) throws ScriptException {
    context.consume().each {
      context.produce(it);
    }
  }
}