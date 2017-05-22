package com.chengjs.rpc.thrift.cluster;

import com.chengjs.rpc.thrift.client.ThriftClient;
import com.chengjs.rpc.thrift.support.Request;
import com.chengjs.rpc.thrift.support.Response;
import org.apache.thrift.protocol.TProtocolFactory;

import com.chengjs.rpc.base.cluster.pool.ClientFactory;
import com.chengjs.rpc.thrift.client.ThriftClientConfig;

/**
 * 用于提供 ThriftClient
 * 
 * @author dongjian_9@163.com
 * */
public class ThriftClientFactory extends ClientFactory<Request, Response> {
	
	private ThriftClientConfig config = new ThriftClientConfig();
	
	public ThriftClientFactory() {
		super();
	}

	public ThriftClientFactory(ThriftClientConfig config) {
		this.config = config;
	}
	
	@Override
	public Client<Request, Response> createClient() {
		return new ThriftClient(config);
	}

	public String getHost() {
		return config.getHost();
	}

	public void setHost(String host) {
		config.setHost(host);
	}

	public int getPort() {
		return config.getPort();
	}

	public void setPort(int port) {
		config.setPort(port);
	}

	public int getTimeout() {
		return config.getTimeout();
	}

	public void setTimeout(int timeout) {
		config.setTimeout(timeout);
	}

	public int getConnectionTimeout() {
		return config.getConnectionTimeout();
	}

	public void setConnectionTimeout(int connectionTimeout) {
		config.setConnectionTimeout(connectionTimeout);
	}

	public boolean isFramed() {
		return config.isFramed();
	}

	public void setFramed(boolean framed) {
		config.setFramed(framed);
	}

	public TProtocolFactory getProtocolFactory() {
		return config.getProtocolFactory();
	}

	public void setProtocolFactory(TProtocolFactory protocolFactory) {
		config.setProtocolFactory(protocolFactory);
	}

	public String getFrom() {
		return config.getFrom();
	}

	public void setFrom(String from) {
		config.setFrom(from);
	}

	public String getToken() {
		return config.getToken();
	}

	public void setToken(String token) {
		config.setToken(token);
	}

	public String toString() {
		return config.toString();
	}

	
}
