/**
 * ReadProjektzeitenRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Lesen von Projektzeiten.
 */
public class ReadProjektzeitenRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadProjektzeitenRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadProjektzeitenRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readProjektzeitenSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readProjektzeitenSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadProjektzeitenSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Suche von Zeitbuchungen. */
    private ReadProjektzeitenSearchCriteriaType readProjektzeitenSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadProjektzeitenRequestType() {
    }


    public ReadProjektzeitenRequestType(
            RequestHeaderType requestHeader,
            ReadProjektzeitenSearchCriteriaType readProjektzeitenSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readProjektzeitenSearchCriteria = readProjektzeitenSearchCriteria;
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
     * Gets the requestHeader value for this ReadProjektzeitenRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadProjektzeitenRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readProjektzeitenSearchCriteria value for this ReadProjektzeitenRequestType.
     *
     * @return readProjektzeitenSearchCriteria   * Die Suchkriterien zur Suche von Zeitbuchungen.
     */
    public ReadProjektzeitenSearchCriteriaType getReadProjektzeitenSearchCriteria() {
        return readProjektzeitenSearchCriteria;
    }

    /**
     * Sets the readProjektzeitenSearchCriteria value for this ReadProjektzeitenRequestType.
     *
     * @param readProjektzeitenSearchCriteria   * Die Suchkriterien zur Suche von Zeitbuchungen.
     */
    public void setReadProjektzeitenSearchCriteria(ReadProjektzeitenSearchCriteriaType readProjektzeitenSearchCriteria) {
        this.readProjektzeitenSearchCriteria = readProjektzeitenSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadProjektzeitenRequestType)) return false;
        ReadProjektzeitenRequestType other = (ReadProjektzeitenRequestType) obj;
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
                ((this.readProjektzeitenSearchCriteria == null && other.getReadProjektzeitenSearchCriteria() == null) ||
                        (this.readProjektzeitenSearchCriteria != null &&
                                this.readProjektzeitenSearchCriteria.equals(other.getReadProjektzeitenSearchCriteria())));
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
        if (getReadProjektzeitenSearchCriteria() != null) {
            _hashCode += getReadProjektzeitenSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
