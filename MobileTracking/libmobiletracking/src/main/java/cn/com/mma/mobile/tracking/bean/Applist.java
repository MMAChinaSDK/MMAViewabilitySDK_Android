package cn.com.mma.mobile.tracking.bean;

/**
 * Created by MMAChinaSDK on 17/11/17.
 */
public class Applist {

    /**
     * 上报地址
     */
    public String uploadUrl;
    /**
     * 上报时间间隔
     */
    public int uploadTime;

    /**
     * 上报是否使用Gzip,缺省为true
     */
    public boolean useGzip = true;
}
