// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "deviceEventsResult",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "deviceEventsResult",
  namespace = ""
)
public class DeviceEventsResult implements java.io.Serializable {

  private java.util.List<com.eurotech.cloud.apis.v2.model.DeviceEvent> _deviceEvents;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "deviceEvent",
    namespace = ""
  )
  public java.util.List<com.eurotech.cloud.apis.v2.model.DeviceEvent> getDeviceEvents() {
    return this._deviceEvents;
  }

  /**
   * (no documentation provided)
   */
  public void setDeviceEvents(java.util.List<com.eurotech.cloud.apis.v2.model.DeviceEvent> _deviceEvents) {
    this._deviceEvents = _deviceEvents;
  }

}
