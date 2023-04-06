package br.com.diegocordeiro.studies.using.functionalinterface.bifunction;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.User;

import java.util.function.BiFunction;

public class ExecutorBiFunction extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { BiFunction } Created by Java. \n\n");

        BiFunction<User, Integer, String> biFunctionUser = (user, minimumAge) -> {

            if(user.getAge() <= minimumAge){

                return user.getNickname() + ", Oh ! Permission to play not conceded";
            }

            return user.getNickname() + ", Yeah ! Permission to play conceded";
        };

        User.mountMockList().forEach(user -> System.out.println(biFunctionUser.apply(user, 20)));
    }
}
