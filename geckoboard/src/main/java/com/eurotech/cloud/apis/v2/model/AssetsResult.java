// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "assetsResult",
    namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "assetsResult",
    namespace = ""
)
public class AssetsResult implements java.io.Serializable {

    private java.util.List<com.eurotech.cloud.apis.v2.model.EdcAssetInfo> _assets;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "assetInfo",
        namespace = ""
    )
    public java.util.List<com.eurotech.cloud.apis.v2.model.EdcAssetInfo> getAssets() {
        return this._assets;
    }

    /**
     * (no documentation provided)
     */
    public void setAssets(java.util.List<com.eurotech.cloud.apis.v2.model.EdcAssetInfo> _assets) {
        this._assets = _assets;
    }

}
