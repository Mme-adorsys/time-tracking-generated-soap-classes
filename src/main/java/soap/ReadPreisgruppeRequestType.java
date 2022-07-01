/**
 * ReadPreisgruppeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadPreisgruppeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadPreisgruppeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadPreisgruppeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readPreisgruppeSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readPreisgruppeSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadPreisgruppeSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private ReadPreisgruppeSearchCriteriaType readPreisgruppeSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadPreisgruppeRequestType() {
    }


    public ReadPreisgruppeRequestType(
            RequestHeaderType requestHeader,
            ReadPreisgruppeSearchCriteriaType readPreisgruppeSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readPreisgruppeSearchCriteria = readPreisgruppeSearchCriteria;
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
     * Gets the requestHeader value for this ReadPreisgruppeRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadPreisgruppeRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readPreisgruppeSearchCriteria value for this ReadPreisgruppeRequestType.
     *
     * @return readPreisgruppeSearchCriteria
     */
    public ReadPreisgruppeSearchCriteriaType getReadPreisgruppeSearchCriteria() {
        return readPreisgruppeSearchCriteria;
    }

    /**
     * Sets the readPreisgruppeSearchCriteria value for this ReadPreisgruppeRequestType.
     *
     * @param readPreisgruppeSearchCriteria
     */
    public void setReadPreisgruppeSearchCriteria(ReadPreisgruppeSearchCriteriaType readPreisgruppeSearchCriteria) {
        this.readPreisgruppeSearchCriteria = readPreisgruppeSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadPreisgruppeRequestType)) return false;
        ReadPreisgruppeRequestType other = (ReadPreisgruppeRequestType) obj;
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
                ((this.readPreisgruppeSearchCriteria == null && other.getReadPreisgruppeSearchCriteria() == null) ||
                        (this.readPreisgruppeSearchCriteria != null &&
                                this.readPreisgruppeSearchCriteria.equals(other.getReadPreisgruppeSearchCriteria())));
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
        if (getReadPreisgruppeSearchCriteria() != null) {
            _hashCode += getReadPreisgruppeSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
