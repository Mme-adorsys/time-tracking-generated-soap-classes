/**
 * ReadTeilaufgabeResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Antwort-Objekt beim Lesen von Teilaufgaben.
 */
public class ReadTeilaufgabeResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTeilaufgabeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabeListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TeilaufgabeType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "teilaufgabe"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste mit Teilaufgaben. */
    private TeilaufgabeType[] teilaufgabeListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTeilaufgabeResponseType() {
    }


    public ReadTeilaufgabeResponseType(
            ResponseHeaderType responseHeader,
            TeilaufgabeType[] teilaufgabeListe) {
        this.responseHeader = responseHeader;
        this.teilaufgabeListe = teilaufgabeListe;
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
     * Gets the responseHeader value for this ReadTeilaufgabeResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadTeilaufgabeResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the teilaufgabeListe value for this ReadTeilaufgabeResponseType.
     *
     * @return teilaufgabeListe   * Die Liste mit Teilaufgaben.
     */
    public TeilaufgabeType[] getTeilaufgabeListe() {
        return teilaufgabeListe;
    }

    /**
     * Sets the teilaufgabeListe value for this ReadTeilaufgabeResponseType.
     *
     * @param teilaufgabeListe   * Die Liste mit Teilaufgaben.
     */
    public void setTeilaufgabeListe(TeilaufgabeType[] teilaufgabeListe) {
        this.teilaufgabeListe = teilaufgabeListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTeilaufgabeResponseType)) return false;
        ReadTeilaufgabeResponseType other = (ReadTeilaufgabeResponseType) obj;
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
                ((this.teilaufgabeListe == null && other.getTeilaufgabeListe() == null) ||
                        (this.teilaufgabeListe != null &&
                                java.util.Arrays.equals(this.teilaufgabeListe, other.getTeilaufgabeListe())));
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
        if (getTeilaufgabeListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTeilaufgabeListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTeilaufgabeListe(), i);
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
