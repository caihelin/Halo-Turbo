package com.ethanco.halo.turbo.ads;

/**
 * TODO
 *
 * @author EthanCo
 * @since 2017/1/18
 */

public interface ILog extends IHandler {
    void onStarting();

    void onStartSuccess();

    void onStartFailed(Exception e);

    void onStopping();

    void onStopped();

    void onReceiveException(Exception e);
}
