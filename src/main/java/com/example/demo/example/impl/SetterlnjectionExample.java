package com.example.demo.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

//@Component
public class SetterlnjectionExample implements Example {
	/** フィールド */
	private SomeService someService;
	
	/** セッターインジェクション */
	@Autowired
	public void setSomeService(SomeService someService) {
		this.someService = someService;
	}
	
	/** 実行 */
	@Override
	public void run() {
		someService.doservice();
	}

}