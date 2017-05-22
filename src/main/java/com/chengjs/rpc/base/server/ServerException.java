package com.chengjs.rpc.base.server;

/**
 * 调用{@link Server#start()}可能抛出，无法启动server时抛出的异常
 * 
 * @author: Chengjs, version:1.0.0, 2017/4/22
 * */
public class ServerException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServerException() {
		super();
	}

	public ServerException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
	
	public ServerException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ServerException(String arg0) {
		super(arg0);
	}

	public ServerException(Throwable arg0) {
		super(arg0);
	}
	
}
