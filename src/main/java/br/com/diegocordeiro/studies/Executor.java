package br.com.diegocordeiro.studies;

public abstract class Executor {

    protected Executor nextExecutor = null;

    public abstract void execute();

    public void next(Executor executor){
        this.nextExecutor = executor;
    }
}
