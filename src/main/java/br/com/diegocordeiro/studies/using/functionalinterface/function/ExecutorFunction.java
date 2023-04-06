package br.com.diegocordeiro.studies.using.functionalinterface.function;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.User;

import java.util.List;
import java.util.function.Function;

public class ExecutorFunction extends Executor {

    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { Function } Created by Java. \n\n");

        Function<User, String> functionUser = (user) -> user.getAge() >= 18 ?
                "User " + user.getFullName() + " is older" : "User" + user.getFullName() + " isn't older";

        List<User> users = User.mountMockList();

        users.forEach(user -> System.out.println(functionUser.apply(user)));

        nextExecutor.execute();
    }
}
