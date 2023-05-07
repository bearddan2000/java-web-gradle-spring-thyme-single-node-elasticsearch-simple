package example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class TestLoadContext {
  @Autowired
  example.controller.DogController dogController;

  @Test
  void testDogControllerNotNull() {
    Assertions.assertNotNull(dogController);
  }

}