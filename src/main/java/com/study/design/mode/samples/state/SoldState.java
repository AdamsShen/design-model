package com.study.design.mode.samples.state;

public class SoldState implements State {

    private NewCoffeeMachine machine;

    public SoldState(NewCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pay() {

    }

    @Override
    public void refund() {
        // TODO Auto-generated method stub

    }

    @Override
    public void buy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getCoffee() {
        // TODO Auto-generated method stub

    }

}
