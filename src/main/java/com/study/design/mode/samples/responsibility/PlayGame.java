package com.study.design.mode.samples.responsibility;

public class PlayGame {
    public static void main(String[] args) {
        com.study.design.mode.samples.responsibility.ResponsibilityChain chain = new com.study.design.mode.samples.responsibility.ResponsibilityChain();
        chain.register(new com.study.design.mode.samples.responsibility.ResponsibilityA());
        chain.register(new com.study.design.mode.samples.responsibility.ResponsibilityB());

        chain.process(new com.study.design.mode.samples.responsibility.Request() {
        });
    }
}
