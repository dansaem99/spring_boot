package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
	private String username;
	private int age;
	private LocalDate regDate;
}
