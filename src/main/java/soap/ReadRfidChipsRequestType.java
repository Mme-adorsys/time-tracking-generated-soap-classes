/**
 * ReadRfidChipsRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Request-Type zur Abfrage von RFID-Chips.
 */
public class ReadRfidChipsRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRfidChipsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRfidChipsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readRfidChipsSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readRfidChipsSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRfidChipsSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    /* Die Kriterien zur Suche der zu lesenden RFID-Chips. */
    private ReadRfidChipsSearchCriteriaType readRfidChipsSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRfidChipsRequestType() {
    }


    public ReadRfidChipsRequestType(
            RequestHeaderType requestHeader,
            ReadRfidChipsSearchCriteriaType readRfidChipsSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readRfidChipsSearchCriteria = readRfidChipsSearchCriteria;
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
     * Gets the requestHeader value for this ReadRfidChipsRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadRfidChipsRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readRfidChipsSearchCriteria value for this ReadRfidChipsRequestType.
     *
     * @return readRfidChipsSearchCriteria   * Die Kriterien zur Suche der zu lesenden RFID-Chips.
     */
    public ReadRfidChipsSearchCriteriaType getReadRfidChipsSearchCriteria() {
        return readRfidChipsSearchCriteria;
    }

    /**
     * Sets the readRfidChipsSearchCriteria value for this ReadRfidChipsRequestType.
     *
     * @param readRfidChipsSearchCriteria   * Die Kriterien zur Suche der zu lesenden RFID-Chips.
     */
    public void setReadRfidChipsSearchCriteria(ReadRfidChipsSearchCriteriaType readRfidChipsSearchCriteria) {
        this.readRfidChipsSearchCriteria = readRfidChipsSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRfidChipsRequestType)) return false;
        ReadRfidChipsRequestType other = (ReadRfidChipsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.readRfidChipsSearchCriteria == null && other.getReadRfidChipsSearchCriteria() == null) ||
                        (this.readRfidChipsSearchCriteria != null &&
                                this.readRfidChipsSearchCriteria.equals(other.getReadRfidChipsSearchCriteria())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getReadRfidChipsSearchCriteria() != null) {
            _hashCode += getReadRfidChipsSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
