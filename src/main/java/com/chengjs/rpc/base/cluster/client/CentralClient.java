package com.chengjs.rpc.base.cluster.client;

import com.chengjs.rpc.base.client.ClientIOException;
import com.chengjs.rpc.base.client.RemoteException;
import com.chengjs.rpc.base.client.ThreadSafetyClient;
import com.chengjs.rpc.base.cluster.pool.CentralPool;

/**
 * 实现了{@link ThreadSafetyClient}，表示线程安全的<br>
 * 
 * @see CentralPool
 * 
 * @author: Chengjs, version:1.0.0, 2017/4/22
 */
public class CentralClient<P, R> extends CentralPool<P, R> implements ThreadSafetyClient<P, R> {
	
	public CentralClient() {}
	
	@Override
	public R send(P param) throws ClientIOException, RemoteException {
		BorrowedClient<P, R> client = null;
		try {
			client = this.borrowClient();
			return client.client.send(param);
		} catch (ClientIOException e) {
			this.invalidateClient(client);
			throw e;
		} finally {
			this.returnClient(client);
		}
	}
	
}
