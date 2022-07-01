/**
 * ReadOrtslisteRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadOrtslisteRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadOrtslisteRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadOrtslisteRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOrtslisteSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readOrtslisteSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadOrtslisteSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    private ReadOrtslisteSearchCriteriaType readOrtslisteSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadOrtslisteRequestType() {
    }


    public ReadOrtslisteRequestType(
            RequestHeaderType requestHeader,
            ReadOrtslisteSearchCriteriaType readOrtslisteSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readOrtslisteSearchCriteria = readOrtslisteSearchCriteria;
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
     * Gets the requestHeader value for this ReadOrtslisteRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadOrtslisteRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readOrtslisteSearchCriteria value for this ReadOrtslisteRequestType.
     *
     * @return readOrtslisteSearchCriteria
     */
    public ReadOrtslisteSearchCriteriaType getReadOrtslisteSearchCriteria() {
        return readOrtslisteSearchCriteria;
    }

    /**
     * Sets the readOrtslisteSearchCriteria value for this ReadOrtslisteRequestType.
     *
     * @param readOrtslisteSearchCriteria
     */
    public void setReadOrtslisteSearchCriteria(ReadOrtslisteSearchCriteriaType readOrtslisteSearchCriteria) {
        this.readOrtslisteSearchCriteria = readOrtslisteSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadOrtslisteRequestType)) return false;
        ReadOrtslisteRequestType other = (ReadOrtslisteRequestType) obj;
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
                ((this.readOrtslisteSearchCriteria == null && other.getReadOrtslisteSearchCriteria() == null) ||
                        (this.readOrtslisteSearchCriteria != null &&
                                this.readOrtslisteSearchCriteria.equals(other.getReadOrtslisteSearchCriteria())));
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
        if (getReadOrtslisteSearchCriteria() != null) {
            _hashCode += getReadOrtslisteSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
