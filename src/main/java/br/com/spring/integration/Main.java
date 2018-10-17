package br.com.spring.integration;

import br.com.spring.integration.gateway.UserService;
import br.com.spring.integration.types.User;
import br.com.spring.integration.types.UserRequest;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        final AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:int-ws-config.xml");

        context.registerShutdownHook();

        final UserService service = context.getBean(UserService.class);

        System.out.println("@@@@ " + service.invoke(new UserRequest(new User("1", "Testing!"))).toString());

    }
}
