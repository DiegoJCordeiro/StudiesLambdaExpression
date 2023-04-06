package br.com.diegocordeiro.studies.using.functionalinterface.predicate;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.User;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Diego
 * @since JDK 1.8
 *
 * This class execute an functional interface Predicate that was implement in Java 1.8
 *
 * */
public class ExecutorPredicate extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { Predicate } Created by Java. \n\n");

        Predicate<User> predicateUser = (user) -> user.getAge() >= 18;

        List<User> userList = User.mountMockList();

        userList.forEach(user -> {
            boolean isOlder = predicateUser.test(user);

            if(isOlder) {
                System.out.println(user);
            }
        });

        nextExecutor.execute();
    }
}
