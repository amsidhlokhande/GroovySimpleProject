package com.amsidh.mvc

class ServiceGroovyExampleTest extends GroovyTestCase{

    void testAdditionGroovy(){
        new ServiceGroovyExample().addition()
    }

    void testSubtractionGroovy(){
        new ServiceGroovyExample().subtraction()
    }

}
