/**
 * ReadAbteilungRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Request-Struktur zum Lesen einer Abteilung.
 */
public class ReadAbteilungRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAbteilungRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbteilungRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAbteilungSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readAbteilungSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbteilungSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Kriterien zur Suche nach Abteilungen. */
    private ReadAbteilungSearchCriteriaType readAbteilungSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAbteilungRequestType() {
    }


    public ReadAbteilungRequestType(
            RequestHeaderType requestHeader,
            ReadAbteilungSearchCriteriaType readAbteilungSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readAbteilungSearchCriteria = readAbteilungSearchCriteria;
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
     * Gets the requestHeader value for this ReadAbteilungRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadAbteilungRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readAbteilungSearchCriteria value for this ReadAbteilungRequestType.
     *
     * @return readAbteilungSearchCriteria   * Die Kriterien zur Suche nach Abteilungen.
     */
    public ReadAbteilungSearchCriteriaType getReadAbteilungSearchCriteria() {
        return readAbteilungSearchCriteria;
    }

    /**
     * Sets the readAbteilungSearchCriteria value for this ReadAbteilungRequestType.
     *
     * @param readAbteilungSearchCriteria   * Die Kriterien zur Suche nach Abteilungen.
     */
    public void setReadAbteilungSearchCriteria(ReadAbteilungSearchCriteriaType readAbteilungSearchCriteria) {
        this.readAbteilungSearchCriteria = readAbteilungSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAbteilungRequestType)) return false;
        ReadAbteilungRequestType other = (ReadAbteilungRequestType) obj;
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
                ((this.readAbteilungSearchCriteria == null && other.getReadAbteilungSearchCriteria() == null) ||
                        (this.readAbteilungSearchCriteria != null &&
                                this.readAbteilungSearchCriteria.equals(other.getReadAbteilungSearchCriteria())));
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
        if (getReadAbteilungSearchCriteria() != null) {
            _hashCode += getReadAbteilungSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
