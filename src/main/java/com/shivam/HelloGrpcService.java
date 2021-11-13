package com.shivam;

import io.quarkus.grpc.GrpcService;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;

@GrpcService
@Blocking
public class HelloGrpcService implements HelloGrpc {

    @Override
    public Uni<HelloReply> sayHello(HelloRequest request) {
        System.out.println("Request received "+request.getName());
        return Uni.createFrom().item("Hello " + request.getName() + "!")
                .map(msg -> HelloReply.newBuilder().setMessage(msg).build());
    }

    public void greetHllo(){
        System.out.println("hello");
    }

}
