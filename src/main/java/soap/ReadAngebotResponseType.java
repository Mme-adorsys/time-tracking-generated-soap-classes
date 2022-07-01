/**
 * ReadAngebotResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadAngebotResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAngebotResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAngebotResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("angebotListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "angebotListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AngebotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "angebot"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private AngebotType[] angebotListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAngebotResponseType() {
    }


    public ReadAngebotResponseType(
            ResponseHeaderType responseHeader,
            AngebotType[] angebotListe) {
        this.responseHeader = responseHeader;
        this.angebotListe = angebotListe;
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
     * Gets the responseHeader value for this ReadAngebotResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadAngebotResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the angebotListe value for this ReadAngebotResponseType.
     *
     * @return angebotListe
     */
    public AngebotType[] getAngebotListe() {
        return angebotListe;
    }

    /**
     * Sets the angebotListe value for this ReadAngebotResponseType.
     *
     * @param angebotListe
     */
    public void setAngebotListe(AngebotType[] angebotListe) {
        this.angebotListe = angebotListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAngebotResponseType)) return false;
        ReadAngebotResponseType other = (ReadAngebotResponseType) obj;
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
                ((this.angebotListe == null && other.getAngebotListe() == null) ||
                        (this.angebotListe != null &&
                                java.util.Arrays.equals(this.angebotListe, other.getAngebotListe())));
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
        if (getAngebotListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAngebotListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAngebotListe(), i);
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
