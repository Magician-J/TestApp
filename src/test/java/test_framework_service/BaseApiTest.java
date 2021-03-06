package test_framework_service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

class BaseApiTest {

    private static BaseApi baseApi;
    @BeforeAll
     static void beforeAll(){
        baseApi = new BaseApi();
        baseApi.load("src/main/resources/test_framework_service/api");
    }


    @Test
    void load() {
//        baseApi.load("src/main/resources/test_framework_service/api");
        assertThat(baseApi.apis.size(),greaterThan(1));
    }

    @Test
    void run() {
        baseApi.run("wework","get_token");
        baseApi.run("tags","tagslist");
    }
}