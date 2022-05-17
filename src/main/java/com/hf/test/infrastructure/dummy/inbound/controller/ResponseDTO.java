package com.hf.test.infrastructure.dummy.inbound.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Franklin Choque
 * @version 1.0: ResponseDTO.java; mayo. 11, 2022 @ 19:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private List<Chistes> chistesList;
}
