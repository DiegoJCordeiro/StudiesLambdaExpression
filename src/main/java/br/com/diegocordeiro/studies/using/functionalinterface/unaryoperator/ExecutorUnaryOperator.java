package br.com.diegocordeiro.studies.using.functionalinterface.unaryoperator;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ExecutorUnaryOperator extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { Unary Operator } Created by Java. \n\n");

        List<User> users = User.mountMockList();
        List<User> newUserList = new ArrayList<>();

        UnaryOperator<User> unaryOperatorUser = (user) -> {

            if(user.isNewer()){
                return new User(user.getFullName().concat(" - Novato"), user.getNickname(), user.getAge(), user.getRole());
            }

            return user;
        };

        users.forEach(user -> newUserList.add(unaryOperatorUser.apply(user)));

        System.out.println(newUserList);

        nextExecutor.execute();
    }
}
