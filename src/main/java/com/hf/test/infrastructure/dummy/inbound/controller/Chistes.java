package com.hf.test.infrastructure.dummy.inbound.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Franklin Choque
 * @version 1.0: Chistes.java; mayo. 11, 2022 @ 19:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chistes {
    private String id;
    private String url;
    private String value;
}
