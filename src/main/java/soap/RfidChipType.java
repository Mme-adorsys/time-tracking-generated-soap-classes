/**
 * RfidChipType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class RfidChipType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RfidChipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RfidChipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die RFID-Kennung des Chips. */
    private String rfid;
    /* Der User, dem der Chip zugeordnet ist/wird. */
    private String userId;
    private String created;
    private String modified;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RfidChipType() {
    }


    public RfidChipType(
            String rfid,
            String userId,
            String created,
            String modified) {
        this.rfid = rfid;
        this.userId = userId;
        this.created = created;
        this.modified = modified;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the rfid value for this RfidChipType.
     *
     * @return rfid   * Die RFID-Kennung des Chips.
     */
    public String getRfid() {
        return rfid;
    }

    /**
     * Sets the rfid value for this RfidChipType.
     *
     * @param rfid   * Die RFID-Kennung des Chips.
     */
    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    /**
     * Gets the userId value for this RfidChipType.
     *
     * @return userId   * Der User, dem der Chip zugeordnet ist/wird.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this RfidChipType.
     *
     * @param userId   * Der User, dem der Chip zugeordnet ist/wird.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the created value for this RfidChipType.
     *
     * @return created
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this RfidChipType.
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this RfidChipType.
     *
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this RfidChipType.
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RfidChipType)) return false;
        RfidChipType other = (RfidChipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.rfid == null && other.getRfid() == null) ||
                        (this.rfid != null &&
                                this.rfid.equals(other.getRfid()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRfid() != null) {
            _hashCode += getRfid().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
