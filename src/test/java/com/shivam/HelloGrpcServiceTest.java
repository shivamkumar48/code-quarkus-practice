package com.shivam;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HelloGrpcServiceTest {

    /*@GrpcClient
    HelloGrpc helloGrpc;

    @Test
    public void testHello() {
        HelloReply reply = helloGrpc
                .sayHello(HelloRequest.newBuilder().setName("Neo").build()).await().atMost(Duration.ofSeconds(5));
        assertEquals("Hello Neo!", reply.getMessage());
    }*/

}
