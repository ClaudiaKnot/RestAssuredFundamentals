import config.VideoGameConfig;
import config.VideoGamesEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MyFirstTest extends VideoGameConfig {

    @Test
    public void myFirstTest() {
        // given
        given()
                .log().all()
        // when (method+endpoint)
        .when().get("videogames")
        // then
        .then()
                .log().all();
    }

    @Test
    public void myFirstTestWithEndpoint() {
        get(VideoGamesEndpoints.ALL_VIDEO_GAMES)
        .then().log().all();
    }
}
