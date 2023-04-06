package br.com.diegocordeiro.studies.creating.functionalinterface;

import br.com.diegocordeiro.studies.models.User;
import br.com.diegocordeiro.studies.Executor;

import java.util.List;

public class ExecutorIterateUsers extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface Created Manually by Developer. \n\n");

        List<User> userList = User.mountMockList();

        IterateUsers iterateUsers = (users) -> users.forEach(System.out::println);

        iterateUsers.execute(userList);

        nextExecutor.execute();
    }
}
