/**
 * ReadGeraetRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadGeraetRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadGeraetRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadGeraetRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readGeraetSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readGeraetSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadGeraetSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private ReadGeraetSearchCriteriaType readGeraetSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadGeraetRequestType() {
    }


    public ReadGeraetRequestType(
            RequestHeaderType requestHeader,
            ReadGeraetSearchCriteriaType readGeraetSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readGeraetSearchCriteria = readGeraetSearchCriteria;
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
     * Gets the requestHeader value for this ReadGeraetRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadGeraetRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readGeraetSearchCriteria value for this ReadGeraetRequestType.
     *
     * @return readGeraetSearchCriteria
     */
    public ReadGeraetSearchCriteriaType getReadGeraetSearchCriteria() {
        return readGeraetSearchCriteria;
    }

    /**
     * Sets the readGeraetSearchCriteria value for this ReadGeraetRequestType.
     *
     * @param readGeraetSearchCriteria
     */
    public void setReadGeraetSearchCriteria(ReadGeraetSearchCriteriaType readGeraetSearchCriteria) {
        this.readGeraetSearchCriteria = readGeraetSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadGeraetRequestType)) return false;
        ReadGeraetRequestType other = (ReadGeraetRequestType) obj;
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
                ((this.readGeraetSearchCriteria == null && other.getReadGeraetSearchCriteria() == null) ||
                        (this.readGeraetSearchCriteria != null &&
                                this.readGeraetSearchCriteria.equals(other.getReadGeraetSearchCriteria())));
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
        if (getReadGeraetSearchCriteria() != null) {
            _hashCode += getReadGeraetSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
