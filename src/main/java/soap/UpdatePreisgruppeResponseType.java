/**
 * UpdatePreisgruppeResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class UpdatePreisgruppeResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdatePreisgruppeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdatePreisgruppeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public UpdatePreisgruppeResponseType() {
    }

    public UpdatePreisgruppeResponseType(
            ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
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
     * Gets the responseHeader value for this UpdatePreisgruppeResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this UpdatePreisgruppeResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdatePreisgruppeResponseType)) return false;
        UpdatePreisgruppeResponseType other = (UpdatePreisgruppeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
