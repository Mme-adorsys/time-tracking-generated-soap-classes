/**
 * ReadTaetigkeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Request zum Lesen von Tätigkeiten.
 */
public class ReadTaetigkeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTaetigkeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTaetigkeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTaetigkeitSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTaetigkeitSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTaetigkeitSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    private ReadTaetigkeitSearchCriteriaType readTaetigkeitSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTaetigkeitRequestType() {
    }


    public ReadTaetigkeitRequestType(
            RequestHeaderType requestHeader,
            ReadTaetigkeitSearchCriteriaType readTaetigkeitSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readTaetigkeitSearchCriteria = readTaetigkeitSearchCriteria;
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
     * Gets the requestHeader value for this ReadTaetigkeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadTaetigkeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readTaetigkeitSearchCriteria value for this ReadTaetigkeitRequestType.
     *
     * @return readTaetigkeitSearchCriteria
     */
    public ReadTaetigkeitSearchCriteriaType getReadTaetigkeitSearchCriteria() {
        return readTaetigkeitSearchCriteria;
    }

    /**
     * Sets the readTaetigkeitSearchCriteria value for this ReadTaetigkeitRequestType.
     *
     * @param readTaetigkeitSearchCriteria
     */
    public void setReadTaetigkeitSearchCriteria(ReadTaetigkeitSearchCriteriaType readTaetigkeitSearchCriteria) {
        this.readTaetigkeitSearchCriteria = readTaetigkeitSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTaetigkeitRequestType)) return false;
        ReadTaetigkeitRequestType other = (ReadTaetigkeitRequestType) obj;
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
                ((this.readTaetigkeitSearchCriteria == null && other.getReadTaetigkeitSearchCriteria() == null) ||
                        (this.readTaetigkeitSearchCriteria != null &&
                                this.readTaetigkeitSearchCriteria.equals(other.getReadTaetigkeitSearchCriteria())));
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
        if (getReadTaetigkeitSearchCriteria() != null) {
            _hashCode += getReadTaetigkeitSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
