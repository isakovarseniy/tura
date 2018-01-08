package sales.analyzer.process.async.commands;

import org.kie.api.executor.Command;
import org.kie.api.executor.CommandContext;
import org.kie.api.executor.ExecutionResults;

public class LoadFileCommand implements Command{

	@Override
	public ExecutionResults execute(CommandContext arg0) throws Exception {
		System.out.println("HAHAHA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Thread.sleep(500);
		System.out.println("++++++!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return null;
	}

}
