/**
 * ReadKommtGehtRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadKommtGehtRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKommtGehtRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKommtGehtRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readKommtGehtSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readKommtGehtSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKommtGehtSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private RequestHeaderType requestHeader;
    private ReadKommtGehtSearchCriteriaType readKommtGehtSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKommtGehtRequestType() {
    }


    public ReadKommtGehtRequestType(
            RequestHeaderType requestHeader,
            ReadKommtGehtSearchCriteriaType readKommtGehtSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readKommtGehtSearchCriteria = readKommtGehtSearchCriteria;
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
     * Gets the requestHeader value for this ReadKommtGehtRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Response-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadKommtGehtRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readKommtGehtSearchCriteria value for this ReadKommtGehtRequestType.
     *
     * @return readKommtGehtSearchCriteria
     */
    public ReadKommtGehtSearchCriteriaType getReadKommtGehtSearchCriteria() {
        return readKommtGehtSearchCriteria;
    }

    /**
     * Sets the readKommtGehtSearchCriteria value for this ReadKommtGehtRequestType.
     *
     * @param readKommtGehtSearchCriteria
     */
    public void setReadKommtGehtSearchCriteria(ReadKommtGehtSearchCriteriaType readKommtGehtSearchCriteria) {
        this.readKommtGehtSearchCriteria = readKommtGehtSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKommtGehtRequestType)) return false;
        ReadKommtGehtRequestType other = (ReadKommtGehtRequestType) obj;
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
                ((this.readKommtGehtSearchCriteria == null && other.getReadKommtGehtSearchCriteria() == null) ||
                        (this.readKommtGehtSearchCriteria != null &&
                                this.readKommtGehtSearchCriteria.equals(other.getReadKommtGehtSearchCriteria())));
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
        if (getReadKommtGehtSearchCriteria() != null) {
            _hashCode += getReadKommtGehtSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
