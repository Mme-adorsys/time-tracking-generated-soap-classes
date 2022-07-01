/**
 * ReadRechnungspositionFestpreisRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Request zur Abfrage von Festpreis-Rechnungspositionen.
 */
public class ReadRechnungspositionFestpreisRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungspositionFestpreisRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungspositionFestpreisRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readRechnungspositionFestpreisSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readRechnungspositionFestpreisSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungspositionFestpreisSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien für die zu liefernden Festpreis-Rechnungspositionen. */
    private ReadRechnungspositionFestpreisSearchCriteriaType readRechnungspositionFestpreisSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungspositionFestpreisRequestType() {
    }


    public ReadRechnungspositionFestpreisRequestType(
            RequestHeaderType requestHeader,
            ReadRechnungspositionFestpreisSearchCriteriaType readRechnungspositionFestpreisSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readRechnungspositionFestpreisSearchCriteria = readRechnungspositionFestpreisSearchCriteria;
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
     * Gets the requestHeader value for this ReadRechnungspositionFestpreisRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadRechnungspositionFestpreisRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readRechnungspositionFestpreisSearchCriteria value for this ReadRechnungspositionFestpreisRequestType.
     *
     * @return readRechnungspositionFestpreisSearchCriteria   * Die Suchkriterien für die zu liefernden Festpreis-Rechnungspositionen.
     */
    public ReadRechnungspositionFestpreisSearchCriteriaType getReadRechnungspositionFestpreisSearchCriteria() {
        return readRechnungspositionFestpreisSearchCriteria;
    }

    /**
     * Sets the readRechnungspositionFestpreisSearchCriteria value for this ReadRechnungspositionFestpreisRequestType.
     *
     * @param readRechnungspositionFestpreisSearchCriteria   * Die Suchkriterien für die zu liefernden Festpreis-Rechnungspositionen.
     */
    public void setReadRechnungspositionFestpreisSearchCriteria(ReadRechnungspositionFestpreisSearchCriteriaType readRechnungspositionFestpreisSearchCriteria) {
        this.readRechnungspositionFestpreisSearchCriteria = readRechnungspositionFestpreisSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungspositionFestpreisRequestType)) return false;
        ReadRechnungspositionFestpreisRequestType other = (ReadRechnungspositionFestpreisRequestType) obj;
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
                ((this.readRechnungspositionFestpreisSearchCriteria == null && other.getReadRechnungspositionFestpreisSearchCriteria() == null) ||
                        (this.readRechnungspositionFestpreisSearchCriteria != null &&
                                this.readRechnungspositionFestpreisSearchCriteria.equals(other.getReadRechnungspositionFestpreisSearchCriteria())));
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
        if (getReadRechnungspositionFestpreisSearchCriteria() != null) {
            _hashCode += getReadRechnungspositionFestpreisSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
