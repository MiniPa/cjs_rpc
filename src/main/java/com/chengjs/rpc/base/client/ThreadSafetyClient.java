package com.chengjs.rpc.base.client;

/**
 * 线程安全的客户端接口
 * 
 * @author: Chengjs, version:1.0.0, 2017/4/22
 */
public interface ThreadSafetyClient<P, R> {

	/**
	 * 发送请求
	 * 
	 * @throws ClientIOException
	 *             网络异常
	 * @throws RemoteException 服务器抛出了异常
	 */
	public R send(P param) throws ClientIOException, RemoteException;

}
