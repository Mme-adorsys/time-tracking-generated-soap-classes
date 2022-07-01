/**
 * ReadMahlzeitResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class ReadMahlzeitResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadMahlzeitResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadMahlzeitResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mahlzeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mahlzeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MahlzeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "mahlzeit"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    private MahlzeitType[] mahlzeitListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadMahlzeitResponseType() {
    }


    public ReadMahlzeitResponseType(
            ResponseHeaderType responseHeader,
            MahlzeitType[] mahlzeitListe) {
        this.responseHeader = responseHeader;
        this.mahlzeitListe = mahlzeitListe;
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
     * Gets the responseHeader value for this ReadMahlzeitResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadMahlzeitResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the mahlzeitListe value for this ReadMahlzeitResponseType.
     *
     * @return mahlzeitListe
     */
    public MahlzeitType[] getMahlzeitListe() {
        return mahlzeitListe;
    }

    /**
     * Sets the mahlzeitListe value for this ReadMahlzeitResponseType.
     *
     * @param mahlzeitListe
     */
    public void setMahlzeitListe(MahlzeitType[] mahlzeitListe) {
        this.mahlzeitListe = mahlzeitListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadMahlzeitResponseType)) return false;
        ReadMahlzeitResponseType other = (ReadMahlzeitResponseType) obj;
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
                ((this.mahlzeitListe == null && other.getMahlzeitListe() == null) ||
                        (this.mahlzeitListe != null &&
                                java.util.Arrays.equals(this.mahlzeitListe, other.getMahlzeitListe())));
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
        if (getMahlzeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMahlzeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMahlzeitListe(), i);
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
