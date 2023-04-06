package br.com.diegocordeiro;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.creating.functionalinterface.ExecutorIterateUsers;
import br.com.diegocordeiro.studies.using.functionalinterface.bifunction.ExecutorBiFunction;
import br.com.diegocordeiro.studies.using.functionalinterface.binaryoperator.ExecutorBinaryOperator;
import br.com.diegocordeiro.studies.using.functionalinterface.consumer.ExecutorConsumer;
import br.com.diegocordeiro.studies.using.functionalinterface.function.ExecutorFunction;
import br.com.diegocordeiro.studies.using.functionalinterface.predicate.ExecutorPredicate;
import br.com.diegocordeiro.studies.using.functionalinterface.supplier.ExecutorSupplier;
import br.com.diegocordeiro.studies.using.functionalinterface.unaryoperator.ExecutorUnaryOperator;

public class Application
{
    public static void main( String[] args )
    {
        Executor firstExecutor = new ExecutorIterateUsers();
        Executor secondExecutor = new ExecutorPredicate();
        Executor thirdExecutor = new ExecutorConsumer();
        Executor fourthExecutor = new ExecutorFunction();
        Executor fifthExecutor = new ExecutorSupplier();
        Executor sixthExecutor = new ExecutorUnaryOperator();
        Executor seventhExecutor = new ExecutorBinaryOperator();
        Executor eighthExecutor = new ExecutorBiFunction();

        firstExecutor.next(secondExecutor);
        secondExecutor.next(thirdExecutor);
        thirdExecutor.next(fourthExecutor);
        fourthExecutor.next(fifthExecutor);
        fifthExecutor.next(sixthExecutor);
        sixthExecutor.next(seventhExecutor);
        seventhExecutor.next(eighthExecutor);

        firstExecutor.execute();
    }
}
