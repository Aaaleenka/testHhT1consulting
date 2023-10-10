package LogicServiceTest;

import LogicService.LogicService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicServiceTest {

    private LogicService logicService = new LogicService();

    @Test
    void LogicServiceTest() {

        String testReq = "Youcandoanythingyousetyourmindtoman";
        String testAnswer = "\"n\":5, \"o\":5, \"a\":3, \"t\":3, \"u\":3, \"y\":3, \"d\":2, \"i\":2, \"m\":2, \"c\":1, \"e\":1, \"g\":1, \"h\":1, \"r\":1, \"s\":1, \"Y\":1";
        Assertions.assertEquals(testAnswer, logicService.getCountCharsToString(testReq));
    }

}

