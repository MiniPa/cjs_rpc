package com.chengjs.rpc.thrift.remote.base;

import com.chengjs.rpc.remote.ServiceDefinition;
import com.chengjs.rpc.remote.base.ServicePublisher;
import com.chengjs.rpc.thrift.remote.ThriftMessageConvert;
import com.chengjs.rpc.thrift.support.Request;
import com.chengjs.rpc.thrift.support.Response;

/**
 * Thrift实现的服务发布处理器
 * 
 * @author dongjian_9@163.com
 * */
public class ThriftServicePublisher extends ServicePublisher<Request, Response> {
	
	public ThriftServicePublisher() {
		this.messageConvert = new ThriftMessageConvert();
	}

	public ThriftServicePublisher(ServiceDefinition... definitions) {
		super(new ThriftMessageConvert(), definitions);
	}
	
}

