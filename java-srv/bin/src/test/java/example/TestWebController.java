package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@AutoConfigureMockMvc
@EnableAutoConfiguration(exclude= SecurityAutoConfiguration.class)
class TestWebController {

  @Autowired
  private MockMvc mvc;

  @Test
  void testIndexPageStatus() {
    try {
      mvc.perform(MockMvcRequestBuilders.get("/"))
      .andExpect(MockMvcResultMatchers.status().isOk());  
    } catch (Exception e) {
      // TODO: handle exception
      Assertions.fail("Endpoint '/' not reachable");
    }
    
  }

}