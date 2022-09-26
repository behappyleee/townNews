package com.my.townNews.address

import org.springframework.stereotype.Controller

@Controller
class AddressController {

    // 주소 등록 Index 페이지
    fun addressIndex(): String {
        return "addressRegist/index";
    }




}