// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "edcUsageInfo",
    namespace = ""
)
public class EdcUsageInfo implements java.io.Serializable {

    private java.util.Date _timestamp;
    private java.lang.String _asset;
    private java.lang.String _accountName;
    private long _rxUsage;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "timestamp",
        namespace = ""
    )
    public java.util.Date getTimestamp() {
        return this._timestamp;
    }

    /**
     * (no documentation provided)
     */
    public void setTimestamp(java.util.Date _timestamp) {
        this._timestamp = _timestamp;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "asset",
        namespace = ""
    )
    public java.lang.String getAsset() {
        return this._asset;
    }

    /**
     * (no documentation provided)
     */
    public void setAsset(java.lang.String _asset) {
        this._asset = _asset;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "accountName",
        namespace = ""
    )
    public java.lang.String getAccountName() {
        return this._accountName;
    }

    /**
     * (no documentation provided)
     */
    public void setAccountName(java.lang.String _accountName) {
        this._accountName = _accountName;
    }


    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "rxUsage",
        namespace = ""
    )
    public long getRxUsage() {
        return this._rxUsage;
    }

    /**
     * (no documentation provided)
     */
    public void setRxUsage(long _rxUsage) {
        this._rxUsage = _rxUsage;
    }

}
