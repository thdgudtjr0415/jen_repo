package com.ohgiraffers.bootproject.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@RequiredArgsConstructor          // 이건 선택해서 생성자 만들수 있음
public class CalculatorDTO {

    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;
    private int sum;
}
