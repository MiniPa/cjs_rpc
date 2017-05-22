package com.chengjs.rpc.base.server;

/**
 * 服务端的标准接口
 * 
 * @author: Chengjs, version:1.0.0, 2017/4/22
 * */
public interface Server {
	
	public void start() throws ServerException;

	public void stop();
}
