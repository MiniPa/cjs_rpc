package com.chengjs.rpc.base.client;

import java.io.Closeable;
import java.io.IOException;

/**
 * Clientjs: 客户端标准接口
 *
 * @author: Chengjs, version:1.0.0, 2017/4/22
 */
public interface Client<P, R> extends Closeable {
  /**
   * 打开连接
   *
   * @throws ClientIOException
   */
  public void open() throws ClientIOException;

  /**
   * 记录时间戳
   *
   * @return
   */
  public long openTimestamp();

  /**
   * 测试可用性
   *
   * @return true 可用, false 不可用
   */
  public boolean ping();

  /**
   * 发送请求到服务端,并获取服务端返回数据
   *
   * @param param
   * @return
   * @throws ClientIOException
   * @throws RemoteException
   */
  public R send(P param) throws ClientIOException, RemoteException;

  /**
   * 调用{@link #send(Object))}发送请求的次数
   *
   * @return 从连接被打开,到当前时间调用send方法次数
   */
  public long sendCount();

  /**
   * 关闭连接
   *
   * @throws IOException
   */
  @Override
  public void close() throws IOException;

  /**
   * 连接是否已经关闭
   */
  public boolean closed();
}
