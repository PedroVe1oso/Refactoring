package pt.up.fe.ldts.example3

import spock.lang.Specification

class SimpleOrderSpockTest extends Specification {

    def 'Fixed Discount'() {
        given:
            def order = new SimpleOrder(100, new Discount(10))

        expect:
            90 == order.getTotal()
    }

    def 'Percentage Discount'() {
        given:
            def order = new SimpleOrder(100, new Discount(0.2))

        expect:
            80 == order.getTotal()
    }

    def 'No Discount'() {
        given:
            def order = new SimpleOrder(100)

        expect:
            100 == order.getTotal()
    }
}
