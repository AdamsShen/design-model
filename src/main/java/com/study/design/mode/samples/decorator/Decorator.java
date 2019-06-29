package com.study.design.mode.samples.decorator;

public class Decorator implements com.study.design.mode.samples.decorator.Component {

    protected com.study.design.mode.samples.decorator.Component component;

    public Decorator(com.study.design.mode.samples.decorator.Component component) {
        super();
        this.component = component;
    }

    public String methodA() {
        return this.component.methodA();
    }

    public int methodB() {
        return this.component.methodB();
    }
}
