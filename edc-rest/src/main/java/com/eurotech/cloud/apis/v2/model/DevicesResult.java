// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "devicesResult",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "devicesResult",
  namespace = ""
)
public class DevicesResult implements java.io.Serializable {

  private java.util.List<com.eurotech.cloud.apis.v2.model.Device> _devices;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "device",
    namespace = ""
  )
  public java.util.List<com.eurotech.cloud.apis.v2.model.Device> getDevices() {
    return this._devices;
  }

  /**
   * (no documentation provided)
   */
  public void setDevices(java.util.List<com.eurotech.cloud.apis.v2.model.Device> _devices) {
    this._devices = _devices;
  }

}
