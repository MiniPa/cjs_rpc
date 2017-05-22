package com.chengjs.rpc.base.utils;

/**
 * @author: Chengjs, version:1.0.0, 2017/4/22
 */
public class ExceptionUtils {
	
	public static RuntimeException getRuntimeException(Throwable e) {
		if (e instanceof RuntimeException) {
			return (RuntimeException) e;
		} else {
			return new RuntimeException(e);
		}
	}

}
