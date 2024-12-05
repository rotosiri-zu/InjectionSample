package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;


//@Component
public class ConstructorInjectionOmitExamlpe implements Example {

	/** フィールド */
	private final SomeService someService;
	
	/** コンストラクタインジェクション */
	public ConstructorInjectionOmitExamlpe(SomeService someService) {
		this.someService = someService;
	}
	
	/** 実行 */
	public void run() {
		someService.doservice();
	}
}
