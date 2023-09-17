package com.example.desafiotodolist;

import com.example.desafiotodolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class DesafioTodolistApplicationTests {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testeCreateTodoSucces() {

    }

    @Test
    void testeCreateTodoFailure() {
    }

}
