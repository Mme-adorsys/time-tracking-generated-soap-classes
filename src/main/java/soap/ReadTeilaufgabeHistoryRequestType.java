/**
 * ReadTeilaufgabeHistoryRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadTeilaufgabeHistoryRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTeilaufgabeHistoryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeHistoryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTeilaufgabeHistorySearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTeilaufgabeHistorySearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeHistorySearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien für die Ermittlung der Teilaufgabe. */
    private ReadTeilaufgabeHistorySearchCriteriaType readTeilaufgabeHistorySearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTeilaufgabeHistoryRequestType() {
    }


    public ReadTeilaufgabeHistoryRequestType(
            RequestHeaderType requestHeader,
            ReadTeilaufgabeHistorySearchCriteriaType readTeilaufgabeHistorySearchCriteria) {
        this.requestHeader = requestHeader;
        this.readTeilaufgabeHistorySearchCriteria = readTeilaufgabeHistorySearchCriteria;
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
     * Gets the requestHeader value for this ReadTeilaufgabeHistoryRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadTeilaufgabeHistoryRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readTeilaufgabeHistorySearchCriteria value for this ReadTeilaufgabeHistoryRequestType.
     *
     * @return readTeilaufgabeHistorySearchCriteria   * Die Suchkriterien für die Ermittlung der Teilaufgabe.
     */
    public ReadTeilaufgabeHistorySearchCriteriaType getReadTeilaufgabeHistorySearchCriteria() {
        return readTeilaufgabeHistorySearchCriteria;
    }

    /**
     * Sets the readTeilaufgabeHistorySearchCriteria value for this ReadTeilaufgabeHistoryRequestType.
     *
     * @param readTeilaufgabeHistorySearchCriteria   * Die Suchkriterien für die Ermittlung der Teilaufgabe.
     */
    public void setReadTeilaufgabeHistorySearchCriteria(ReadTeilaufgabeHistorySearchCriteriaType readTeilaufgabeHistorySearchCriteria) {
        this.readTeilaufgabeHistorySearchCriteria = readTeilaufgabeHistorySearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTeilaufgabeHistoryRequestType)) return false;
        ReadTeilaufgabeHistoryRequestType other = (ReadTeilaufgabeHistoryRequestType) obj;
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
                ((this.readTeilaufgabeHistorySearchCriteria == null && other.getReadTeilaufgabeHistorySearchCriteria() == null) ||
                        (this.readTeilaufgabeHistorySearchCriteria != null &&
                                this.readTeilaufgabeHistorySearchCriteria.equals(other.getReadTeilaufgabeHistorySearchCriteria())));
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
        if (getReadTeilaufgabeHistorySearchCriteria() != null) {
            _hashCode += getReadTeilaufgabeHistorySearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
