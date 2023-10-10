package t1kons.testHh;

import net.minidev.asm.BeansAccess;
import org.apache.catalina.connector.Response;
import org.assertj.core.api.Assert;
import org.assertj.core.api.BDDAssumptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.bind.annotation.RequestParam;
import io.restassured.RestAssured;

@SpringBootTest
class TestHhApplicationTests {


    @Test
    void contextLoads() {

    }
}
