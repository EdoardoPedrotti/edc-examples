// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "user",
    namespace = "http://eurotech.com/edc/2.0"
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "user",
    namespace = "http://eurotech.com/edc/2.0"
)
public class User implements java.io.Serializable {

    private java.util.Date _modifiedOn;
    private java.util.Date _createdOn;
    private long _id;
    private java.lang.String _password;
    private long _modifiedBy;
    private int _optlock;
    private java.lang.String _username;
    private java.lang.String _phoneNumber;
    private java.lang.String _displayName;
    private java.lang.String _email;
    private long _accountId;
    private java.util.Set<com.eurotech.cloud.apis.v2.model.Role> _roles;
    private java.util.Set<java.lang.String> _permissions;
    private long _createdBy;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "modifiedOn",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Date getModifiedOn() {
        return this._modifiedOn;
    }

    /**
     * (no documentation provided)
     */
    public void setModifiedOn(java.util.Date _modifiedOn) {
        this._modifiedOn = _modifiedOn;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "createdOn",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Date getCreatedOn() {
        return this._createdOn;
    }

    /**
     * (no documentation provided)
     */
    public void setCreatedOn(java.util.Date _createdOn) {
        this._createdOn = _createdOn;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "id",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getId() {
        return this._id;
    }

    /**
     * (no documentation provided)
     */
    public void setId(long _id) {
        this._id = _id;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "password",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getPassword() {
        return this._password;
    }

    /**
     * (no documentation provided)
     */
    public void setPassword(java.lang.String _password) {
        this._password = _password;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "modifiedBy",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getModifiedBy() {
        return this._modifiedBy;
    }

    /**
     * (no documentation provided)
     */
    public void setModifiedBy(long _modifiedBy) {
        this._modifiedBy = _modifiedBy;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "optlock",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public int getOptlock() {
        return this._optlock;
    }

    /**
     * (no documentation provided)
     */
    public void setOptlock(int _optlock) {
        this._optlock = _optlock;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "username",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getUsername() {
        return this._username;
    }

    /**
     * (no documentation provided)
     */
    public void setUsername(java.lang.String _username) {
        this._username = _username;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "phoneNumber",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getPhoneNumber() {
        return this._phoneNumber;
    }

    /**
     * (no documentation provided)
     */
    public void setPhoneNumber(java.lang.String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "displayName",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getDisplayName() {
        return this._displayName;
    }

    /**
     * (no documentation provided)
     */
    public void setDisplayName(java.lang.String _displayName) {
        this._displayName = _displayName;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "email",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getEmail() {
        return this._email;
    }

    /**
     * (no documentation provided)
     */
    public void setEmail(java.lang.String _email) {
        this._email = _email;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "accountId",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getAccountId() {
        return this._accountId;
    }

    /**
     * (no documentation provided)
     */
    public void setAccountId(long _accountId) {
        this._accountId = _accountId;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "role",
        namespace = "http://eurotech.com/edc/2.0"
    )
    @javax.xml.bind.annotation.XmlElementWrapper (
        name = "roles",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Set<com.eurotech.cloud.apis.v2.model.Role> getRoles() {
        return this._roles;
    }

    /**
     * (no documentation provided)
     */
    public void setRoles(java.util.Set<com.eurotech.cloud.apis.v2.model.Role> _roles) {
        this._roles = _roles;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "permission",
        namespace = "http://eurotech.com/edc/2.0"
    )
    @javax.xml.bind.annotation.XmlElementWrapper (
        name = "permissions",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Set<java.lang.String> getPermissions() {
        return this._permissions;
    }

    /**
     * (no documentation provided)
     */
    public void setPermissions(java.util.Set<java.lang.String> _permissions) {
        this._permissions = _permissions;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "createdBy",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getCreatedBy() {
        return this._createdBy;
    }

    /**
     * (no documentation provided)
     */
    public void setCreatedBy(long _createdBy) {
        this._createdBy = _createdBy;
    }

}