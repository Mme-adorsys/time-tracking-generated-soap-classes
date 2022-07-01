/**
 * ReadSteuersatzRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Abfrage von Steuersätzen.
 */
public class ReadSteuersatzRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadSteuersatzRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadSteuersatzRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readSteuersatzSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readSteuersatzSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadSteuersatzSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Suche nach Steuersätzen. */
    private ReadSteuersatzSearchCriteriaType readSteuersatzSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadSteuersatzRequestType() {
    }


    public ReadSteuersatzRequestType(
            RequestHeaderType requestHeader,
            ReadSteuersatzSearchCriteriaType readSteuersatzSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readSteuersatzSearchCriteria = readSteuersatzSearchCriteria;
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
     * Gets the requestHeader value for this ReadSteuersatzRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadSteuersatzRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readSteuersatzSearchCriteria value for this ReadSteuersatzRequestType.
     *
     * @return readSteuersatzSearchCriteria   * Die Suchkriterien zur Suche nach Steuersätzen.
     */
    public ReadSteuersatzSearchCriteriaType getReadSteuersatzSearchCriteria() {
        return readSteuersatzSearchCriteria;
    }

    /**
     * Sets the readSteuersatzSearchCriteria value for this ReadSteuersatzRequestType.
     *
     * @param readSteuersatzSearchCriteria   * Die Suchkriterien zur Suche nach Steuersätzen.
     */
    public void setReadSteuersatzSearchCriteria(ReadSteuersatzSearchCriteriaType readSteuersatzSearchCriteria) {
        this.readSteuersatzSearchCriteria = readSteuersatzSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadSteuersatzRequestType)) return false;
        ReadSteuersatzRequestType other = (ReadSteuersatzRequestType) obj;
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
                ((this.readSteuersatzSearchCriteria == null && other.getReadSteuersatzSearchCriteria() == null) ||
                        (this.readSteuersatzSearchCriteria != null &&
                                this.readSteuersatzSearchCriteria.equals(other.getReadSteuersatzSearchCriteria())));
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
        if (getReadSteuersatzSearchCriteria() != null) {
            _hashCode += getReadSteuersatzSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
