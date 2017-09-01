package com.test.jaxws.stub;

public class HelloWorldClient{

	public static void main(String[] args) {

		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();

		System.out.println(hello.getHelloWorldAsString("Rahamath Java/J2EE"));

    }

}