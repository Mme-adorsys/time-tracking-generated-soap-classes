/**
 * ReadFeiertagskalenderRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadFeiertagskalenderRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFeiertagskalenderRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFeiertagskalenderRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readFeiertagskalenderSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readFeiertagskalenderSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFeiertagskalenderSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private ReadFeiertagskalenderSearchCriteriaType readFeiertagskalenderSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFeiertagskalenderRequestType() {
    }


    public ReadFeiertagskalenderRequestType(
            RequestHeaderType requestHeader,
            ReadFeiertagskalenderSearchCriteriaType readFeiertagskalenderSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readFeiertagskalenderSearchCriteria = readFeiertagskalenderSearchCriteria;
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
     * Gets the requestHeader value for this ReadFeiertagskalenderRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadFeiertagskalenderRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readFeiertagskalenderSearchCriteria value for this ReadFeiertagskalenderRequestType.
     *
     * @return readFeiertagskalenderSearchCriteria
     */
    public ReadFeiertagskalenderSearchCriteriaType getReadFeiertagskalenderSearchCriteria() {
        return readFeiertagskalenderSearchCriteria;
    }

    /**
     * Sets the readFeiertagskalenderSearchCriteria value for this ReadFeiertagskalenderRequestType.
     *
     * @param readFeiertagskalenderSearchCriteria
     */
    public void setReadFeiertagskalenderSearchCriteria(ReadFeiertagskalenderSearchCriteriaType readFeiertagskalenderSearchCriteria) {
        this.readFeiertagskalenderSearchCriteria = readFeiertagskalenderSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFeiertagskalenderRequestType)) return false;
        ReadFeiertagskalenderRequestType other = (ReadFeiertagskalenderRequestType) obj;
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
                ((this.readFeiertagskalenderSearchCriteria == null && other.getReadFeiertagskalenderSearchCriteria() == null) ||
                        (this.readFeiertagskalenderSearchCriteria != null &&
                                this.readFeiertagskalenderSearchCriteria.equals(other.getReadFeiertagskalenderSearchCriteria())));
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
        if (getReadFeiertagskalenderSearchCriteria() != null) {
            _hashCode += getReadFeiertagskalenderSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
