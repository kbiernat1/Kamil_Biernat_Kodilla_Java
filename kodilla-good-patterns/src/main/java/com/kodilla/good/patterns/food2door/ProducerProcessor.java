package com.kodilla.good.patterns.food2door;

public class ProducerProcessor {
    private ProducerInterface producerInterface;

    public ProducerProcessor(ProducerInterface producerInterface) {
        this.producerInterface = producerInterface;
    }

    public void forApplication(Order order) {
        boolean bought = producerInterface.process(order);

        if(bought) {
            producerInterface.sendOrder(order);
        }
    }
}
