/**
 * ReadAbgeglicheneZeitenRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Request-Struktur zum Lesen von abgeglichenen Zeiten.
 */
public class ReadAbgeglicheneZeitenRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAbgeglicheneZeitenRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbgeglicheneZeitenRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAbgeglicheneZeitenSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readAbgeglicheneZeitenSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbgeglicheneZeitenSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zum Lesen von abgeglichenen Zeiten. */
    private ReadAbgeglicheneZeitenSearchCriteriaType readAbgeglicheneZeitenSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAbgeglicheneZeitenRequestType() {
    }


    public ReadAbgeglicheneZeitenRequestType(
            RequestHeaderType requestHeader,
            ReadAbgeglicheneZeitenSearchCriteriaType readAbgeglicheneZeitenSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readAbgeglicheneZeitenSearchCriteria = readAbgeglicheneZeitenSearchCriteria;
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
     * Gets the requestHeader value for this ReadAbgeglicheneZeitenRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadAbgeglicheneZeitenRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readAbgeglicheneZeitenSearchCriteria value for this ReadAbgeglicheneZeitenRequestType.
     *
     * @return readAbgeglicheneZeitenSearchCriteria   * Die Suchkriterien zum Lesen von abgeglichenen Zeiten.
     */
    public ReadAbgeglicheneZeitenSearchCriteriaType getReadAbgeglicheneZeitenSearchCriteria() {
        return readAbgeglicheneZeitenSearchCriteria;
    }

    /**
     * Sets the readAbgeglicheneZeitenSearchCriteria value for this ReadAbgeglicheneZeitenRequestType.
     *
     * @param readAbgeglicheneZeitenSearchCriteria   * Die Suchkriterien zum Lesen von abgeglichenen Zeiten.
     */
    public void setReadAbgeglicheneZeitenSearchCriteria(ReadAbgeglicheneZeitenSearchCriteriaType readAbgeglicheneZeitenSearchCriteria) {
        this.readAbgeglicheneZeitenSearchCriteria = readAbgeglicheneZeitenSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAbgeglicheneZeitenRequestType)) return false;
        ReadAbgeglicheneZeitenRequestType other = (ReadAbgeglicheneZeitenRequestType) obj;
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
                ((this.readAbgeglicheneZeitenSearchCriteria == null && other.getReadAbgeglicheneZeitenSearchCriteria() == null) ||
                        (this.readAbgeglicheneZeitenSearchCriteria != null &&
                                this.readAbgeglicheneZeitenSearchCriteria.equals(other.getReadAbgeglicheneZeitenSearchCriteria())));
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
        if (getReadAbgeglicheneZeitenSearchCriteria() != null) {
            _hashCode += getReadAbgeglicheneZeitenSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
