package com.chengjs.rpc.base.cluster.pool;

import java.util.List;

/**
 * 提供很多工厂
 * 
 * @author: Chengjs, version:1.0.0, 2017/4/22
 * */
public interface ClientFactoryProvider<P, R> {
	
	public List<ClientFactory<P, R>> getFactories();
	
}
