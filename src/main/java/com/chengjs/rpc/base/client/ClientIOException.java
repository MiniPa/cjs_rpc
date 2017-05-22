package com.chengjs.rpc.base.client;

/**
 * ClientIOException: 网络异常 对{@link IOException}的包装
 *
 * @author: Chengjs, version:1.0.0, 2017/4/22
 */
public class ClientIOException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClientIOException() {
		super();
	}

	public ClientIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClientIOException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClientIOException(String message) {
		super(message);
	}

	public ClientIOException(Throwable cause) {
		super(cause);
	}

	
}
