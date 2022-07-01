/**
 * ReadRechnungspositionFestpreisResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Response-Struktur mit dem Ergebnis der Abfrage von Festpreis-Rechnungspositions.
 */
public class ReadRechnungspositionFestpreisResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungspositionFestpreisResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungspositionFestpreisResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungspositionFestpreisListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungspositionFestpreisListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungspositionFestpreisType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rechnungspositionFestpreis"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Liste von Festpreis-Rechnungspositionen. */
    private RechnungspositionFestpreisType[] rechnungspositionFestpreisListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungspositionFestpreisResponseType() {
    }


    public ReadRechnungspositionFestpreisResponseType(
            ResponseHeaderType responseHeader,
            RechnungspositionFestpreisType[] rechnungspositionFestpreisListe) {
        this.responseHeader = responseHeader;
        this.rechnungspositionFestpreisListe = rechnungspositionFestpreisListe;
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
     * Gets the responseHeader value for this ReadRechnungspositionFestpreisResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRechnungspositionFestpreisResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the rechnungspositionFestpreisListe value for this ReadRechnungspositionFestpreisResponseType.
     *
     * @return rechnungspositionFestpreisListe   * Liste von Festpreis-Rechnungspositionen.
     */
    public RechnungspositionFestpreisType[] getRechnungspositionFestpreisListe() {
        return rechnungspositionFestpreisListe;
    }

    /**
     * Sets the rechnungspositionFestpreisListe value for this ReadRechnungspositionFestpreisResponseType.
     *
     * @param rechnungspositionFestpreisListe   * Liste von Festpreis-Rechnungspositionen.
     */
    public void setRechnungspositionFestpreisListe(RechnungspositionFestpreisType[] rechnungspositionFestpreisListe) {
        this.rechnungspositionFestpreisListe = rechnungspositionFestpreisListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungspositionFestpreisResponseType)) return false;
        ReadRechnungspositionFestpreisResponseType other = (ReadRechnungspositionFestpreisResponseType) obj;
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
                ((this.rechnungspositionFestpreisListe == null && other.getRechnungspositionFestpreisListe() == null) ||
                        (this.rechnungspositionFestpreisListe != null &&
                                java.util.Arrays.equals(this.rechnungspositionFestpreisListe, other.getRechnungspositionFestpreisListe())));
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
        if (getRechnungspositionFestpreisListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRechnungspositionFestpreisListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRechnungspositionFestpreisListe(), i);
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
