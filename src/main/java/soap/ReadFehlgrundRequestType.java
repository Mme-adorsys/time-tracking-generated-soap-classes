/**
 * ReadFehlgrundRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Abfrage von Fehlgründen.
 */
public class ReadFehlgrundRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFehlgrundRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlgrundRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readFehlgrundSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readFehlgrundSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlgrundSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Abfrage von Fehlgründen. */
    private ReadFehlgrundSearchCriteriaType readFehlgrundSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFehlgrundRequestType() {
    }


    public ReadFehlgrundRequestType(
            RequestHeaderType requestHeader,
            ReadFehlgrundSearchCriteriaType readFehlgrundSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readFehlgrundSearchCriteria = readFehlgrundSearchCriteria;
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
     * Gets the requestHeader value for this ReadFehlgrundRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadFehlgrundRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readFehlgrundSearchCriteria value for this ReadFehlgrundRequestType.
     *
     * @return readFehlgrundSearchCriteria   * Die Suchkriterien zur Abfrage von Fehlgründen.
     */
    public ReadFehlgrundSearchCriteriaType getReadFehlgrundSearchCriteria() {
        return readFehlgrundSearchCriteria;
    }

    /**
     * Sets the readFehlgrundSearchCriteria value for this ReadFehlgrundRequestType.
     *
     * @param readFehlgrundSearchCriteria   * Die Suchkriterien zur Abfrage von Fehlgründen.
     */
    public void setReadFehlgrundSearchCriteria(ReadFehlgrundSearchCriteriaType readFehlgrundSearchCriteria) {
        this.readFehlgrundSearchCriteria = readFehlgrundSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFehlgrundRequestType)) return false;
        ReadFehlgrundRequestType other = (ReadFehlgrundRequestType) obj;
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
                ((this.readFehlgrundSearchCriteria == null && other.getReadFehlgrundSearchCriteria() == null) ||
                        (this.readFehlgrundSearchCriteria != null &&
                                this.readFehlgrundSearchCriteria.equals(other.getReadFehlgrundSearchCriteria())));
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
        if (getReadFehlgrundSearchCriteria() != null) {
            _hashCode += getReadFehlgrundSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
