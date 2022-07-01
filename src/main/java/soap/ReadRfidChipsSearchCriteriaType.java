/**
 * ReadRfidChipsSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Kriterien zur Suche von RFID-Chips.
 */
public class ReadRfidChipsSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRfidChipsSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRfidChipsSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die RFID-Kennung des Chips. */
    private String rfid;
    /* Der User, dessen RFID-Chip gelesen wird. */
    private String userId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRfidChipsSearchCriteriaType() {
    }


    public ReadRfidChipsSearchCriteriaType(
            String rfid,
            String userId) {
        this.rfid = rfid;
        this.userId = userId;
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
     * Gets the rfid value for this ReadRfidChipsSearchCriteriaType.
     *
     * @return rfid   * Die RFID-Kennung des Chips.
     */
    public String getRfid() {
        return rfid;
    }

    /**
     * Sets the rfid value for this ReadRfidChipsSearchCriteriaType.
     *
     * @param rfid   * Die RFID-Kennung des Chips.
     */
    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    /**
     * Gets the userId value for this ReadRfidChipsSearchCriteriaType.
     *
     * @return userId   * Der User, dessen RFID-Chip gelesen wird.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadRfidChipsSearchCriteriaType.
     *
     * @param userId   * Der User, dessen RFID-Chip gelesen wird.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRfidChipsSearchCriteriaType)) return false;
        ReadRfidChipsSearchCriteriaType other = (ReadRfidChipsSearchCriteriaType) obj;
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
                                this.userId.equals(other.getUserId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
