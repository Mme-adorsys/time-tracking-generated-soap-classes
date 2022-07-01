/**
 * ReadRechnungDatevResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort der Abfrage des Rechnungsexports im DATEV Format.
 */
public class ReadRechnungDatevResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungDatevResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungDatevResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datevListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datevListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "DatevType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "datev"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der Buchungen im DATEV-Format. */
    private DatevType[] datevListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungDatevResponseType() {
    }


    public ReadRechnungDatevResponseType(
            ResponseHeaderType responseHeader,
            DatevType[] datevListe) {
        this.responseHeader = responseHeader;
        this.datevListe = datevListe;
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
     * Gets the responseHeader value for this ReadRechnungDatevResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRechnungDatevResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the datevListe value for this ReadRechnungDatevResponseType.
     *
     * @return datevListe   * Die Liste der Buchungen im DATEV-Format.
     */
    public DatevType[] getDatevListe() {
        return datevListe;
    }

    /**
     * Sets the datevListe value for this ReadRechnungDatevResponseType.
     *
     * @param datevListe   * Die Liste der Buchungen im DATEV-Format.
     */
    public void setDatevListe(DatevType[] datevListe) {
        this.datevListe = datevListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungDatevResponseType)) return false;
        ReadRechnungDatevResponseType other = (ReadRechnungDatevResponseType) obj;
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
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.datevListe == null && other.getDatevListe() == null) ||
                        (this.datevListe != null &&
                                java.util.Arrays.equals(this.datevListe, other.getDatevListe())));
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
        if (getDatevListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDatevListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDatevListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
