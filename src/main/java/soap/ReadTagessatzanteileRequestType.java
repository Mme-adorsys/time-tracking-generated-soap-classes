/**
 * ReadTagessatzanteileRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Request-Struktur zum Lesen von Tagessatzanteilen.
 */
public class ReadTagessatzanteileRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTagessatzanteileRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTagessatzanteileRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTagessatzanteileSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTagessatzanteileSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTagessatzanteileSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Kriterien zur Suche nach Tagessatzanteilen. */
    private ReadTagessatzanteileSearchCriteriaType readTagessatzanteileSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTagessatzanteileRequestType() {
    }


    public ReadTagessatzanteileRequestType(
            RequestHeaderType requestHeader,
            ReadTagessatzanteileSearchCriteriaType readTagessatzanteileSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readTagessatzanteileSearchCriteria = readTagessatzanteileSearchCriteria;
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
     * Gets the requestHeader value for this ReadTagessatzanteileRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadTagessatzanteileRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readTagessatzanteileSearchCriteria value for this ReadTagessatzanteileRequestType.
     *
     * @return readTagessatzanteileSearchCriteria   * Die Kriterien zur Suche nach Tagessatzanteilen.
     */
    public ReadTagessatzanteileSearchCriteriaType getReadTagessatzanteileSearchCriteria() {
        return readTagessatzanteileSearchCriteria;
    }

    /**
     * Sets the readTagessatzanteileSearchCriteria value for this ReadTagessatzanteileRequestType.
     *
     * @param readTagessatzanteileSearchCriteria   * Die Kriterien zur Suche nach Tagessatzanteilen.
     */
    public void setReadTagessatzanteileSearchCriteria(ReadTagessatzanteileSearchCriteriaType readTagessatzanteileSearchCriteria) {
        this.readTagessatzanteileSearchCriteria = readTagessatzanteileSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTagessatzanteileRequestType)) return false;
        ReadTagessatzanteileRequestType other = (ReadTagessatzanteileRequestType) obj;
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
                ((this.readTagessatzanteileSearchCriteria == null && other.getReadTagessatzanteileSearchCriteria() == null) ||
                        (this.readTagessatzanteileSearchCriteria != null &&
                                this.readTagessatzanteileSearchCriteria.equals(other.getReadTagessatzanteileSearchCriteria())));
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
        if (getReadTagessatzanteileSearchCriteria() != null) {
            _hashCode += getReadTagessatzanteileSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
