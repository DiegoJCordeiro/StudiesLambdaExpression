package br.com.diegocordeiro.studies.using.functionalinterface.binaryoperator;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.Role;
import br.com.diegocordeiro.studies.models.User;

import java.util.function.BinaryOperator;

public class ExecutorBinaryOperator extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { Binary Operator } Created by Java. \n\n");

        BinaryOperator<User> binaryOperatorUser = (userOne, userTwo) ->
                userOne.getAge() >= userTwo.getAge() ? userOne : userTwo;

        User userOne = new User("Primeiro Usuario", "Usuario 1", 18, Role.DEFAULT);
        User userTwo = new User("Segundo Usuario", "Usuario 2", 28, Role.DEFAULT);

        System.out.println(binaryOperatorUser.apply(userOne, userTwo));

        nextExecutor.execute();
    }
}
