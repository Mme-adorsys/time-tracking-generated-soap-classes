/**
 * ReadTaetigkeitResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadTaetigkeitResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTaetigkeitResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTaetigkeitResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taetigkeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taetigkeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TaetigkeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "taetigkeit"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gefundenen Tätigkeiten. */
    private TaetigkeitType[] taetigkeitListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTaetigkeitResponseType() {
    }


    public ReadTaetigkeitResponseType(
            ResponseHeaderType responseHeader,
            TaetigkeitType[] taetigkeitListe) {
        this.responseHeader = responseHeader;
        this.taetigkeitListe = taetigkeitListe;
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
     * Gets the responseHeader value for this ReadTaetigkeitResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadTaetigkeitResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the taetigkeitListe value for this ReadTaetigkeitResponseType.
     *
     * @return taetigkeitListe   * Die Liste der gefundenen Tätigkeiten.
     */
    public TaetigkeitType[] getTaetigkeitListe() {
        return taetigkeitListe;
    }

    /**
     * Sets the taetigkeitListe value for this ReadTaetigkeitResponseType.
     *
     * @param taetigkeitListe   * Die Liste der gefundenen Tätigkeiten.
     */
    public void setTaetigkeitListe(TaetigkeitType[] taetigkeitListe) {
        this.taetigkeitListe = taetigkeitListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTaetigkeitResponseType)) return false;
        ReadTaetigkeitResponseType other = (ReadTaetigkeitResponseType) obj;
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
                ((this.taetigkeitListe == null && other.getTaetigkeitListe() == null) ||
                        (this.taetigkeitListe != null &&
                                java.util.Arrays.equals(this.taetigkeitListe, other.getTaetigkeitListe())));
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
        if (getTaetigkeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTaetigkeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTaetigkeitListe(), i);
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
