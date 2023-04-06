package br.com.diegocordeiro.studies.using.functionalinterface.supplier;

import br.com.diegocordeiro.studies.Executor;
import br.com.diegocordeiro.studies.models.Role;
import br.com.diegocordeiro.studies.models.User;

import java.util.List;
import java.util.function.Supplier;

public class ExecutorSupplier extends Executor {
    @Override
    public void execute() {

        System.out.print("\nExecuting Functional Interface { Supplier } Created by Java. \n\n");

        Supplier<List<User>> supplierUser = () ->
                List.of(new User("Novo Usuario", "Novissimo", 1, Role.DEFAULT));

        System.out.println(supplierUser.get());

        nextExecutor.execute();
    }
}
