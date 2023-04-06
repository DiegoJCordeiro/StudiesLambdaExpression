package br.com.diegocordeiro.studies.creating.functionalinterface;

import br.com.diegocordeiro.studies.models.User;

import java.util.List;

@FunctionalInterface
public interface IterateUsers {

    void execute(List<User> users);
}
