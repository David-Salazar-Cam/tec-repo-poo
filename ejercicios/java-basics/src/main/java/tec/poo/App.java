package tec.poo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tec.poo.command.CommandManager;

import tec.poo.command.InfoCommand;



import java.util.Optional;

public class App  {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final String DEFAULT_OPTION = "h";

    public static void main( String[] args )
    {
        System.out.println("Java Basics! \n=========== \n");
        CommandManager commandManager = new CommandManager(args);

        try {

            var argOption = Optional.of(args)
                    .map(e -> {
                        try {
                            return e[0];
                        } catch (Exception ex) {
                            logger.trace("No option provided");
                            return DEFAULT_OPTION;
                        }
                    })
                    .orElse(DEFAULT_OPTION);

            if (argOption.equals(DEFAULT_OPTION)) {
                commandManager.printAvailableCommands();
                System.exit(0);
            }

            commandManager.findCommandByOption(argOption)
                    .ifPresentOrElse(
                            cmd -> {
                                // Aqui se ejecuta el comando
                                logger.info("Argument option " + argOption + " found!!");
                                commandManager.executeCommand(argOption);
                                System.exit(0);
                            },
                            () -> {
                                logger.info("Argument option " + argOption + " not found.");
                                commandManager.printAvailableCommands();
                                System.exit(1);
                            });
        } catch (Exception e) {
            System.err.println("Can't process command.");
            logger.error("Can't process command.", e);
            System.exit(2);
        }
    }
}
