package com.hwj0623.practice.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //모든 필드에 대해 getter 메서드 생성
@RequiredArgsConstructor    //선언된 모든 final 필드가 포함된 생성자를 생성 | final 없는 필드는 포함 x
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
