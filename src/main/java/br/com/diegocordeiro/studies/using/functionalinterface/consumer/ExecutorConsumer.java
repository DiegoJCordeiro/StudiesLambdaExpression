package br.com.diegocordeiro.studies.using.functionalinterface.consumer;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.User;

import java.util.List;
import java.util.function.Consumer;

public class ExecutorConsumer extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { Consumer } Created by Java. \n\n");

        Consumer<User> consumerUser = (user) -> System.out.println(user.getFullName() + " has " + user.getAge() + " years old");
        List<User> users = User.mountMockList();
        users.forEach(consumerUser);

        nextExecutor.execute();
    }
}
