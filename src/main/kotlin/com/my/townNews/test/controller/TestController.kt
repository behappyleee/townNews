package com.my.townNews.test.controller

import org.apache.coyote.Response
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

// 3c1d2911ae97efc53463d333d7c736f0 자바 스크립트 API KEY
@Controller
class TestController {
    private val logger: Logger =
        LoggerFactory.getLogger(this.javaClass);

    @RequestMapping("/hello")
    fun hello(model : Model) : String {
        // Logger Level (application.properties 에 DEBUG 레벨 이상부터 출력 가능하도록 설정)
        // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
        logger.debug("KOTLIN HELLO TEST : {} ", model);
        logger.info("Hello This is Info Test !!!");

        val list: List<Int> = {3};

        Iterator

        return "test/hello";
    }

    @RequestMapping("/test/mapTest")
    fun mapTest(model : Model) : String {
        logger.debug("mapTest : {} ")
        return "test/mapTest";
    }

    @RequestMapping("/test")
    fun testController() : ResponseEntity<Any> {
        return ResponseEntity.ok().body(true);
    }




}

// main 함수
// val - 불변 변수 선언 값의 읽기만 허용 되는 변수 , var - 가변 변수 선언 값의 읽기와 쓰기 모두 허용
fun main() {
    println("Main Function Test !");
    val a : Int = 5;
}