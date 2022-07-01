/**
 * ReadMitarbeiterResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort beim Lesen eines Mitarbeiters.
 */
public class ReadMitarbeiterResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadMitarbeiterResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadMitarbeiterResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitarbeiterListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitarbeiterListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MitarbeiterType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "mitarbeiter"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Mitarbeiter. */
    private MitarbeiterType[] mitarbeiterListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadMitarbeiterResponseType() {
    }


    public ReadMitarbeiterResponseType(
            ResponseHeaderType responseHeader,
            MitarbeiterType[] mitarbeiterListe) {
        this.responseHeader = responseHeader;
        this.mitarbeiterListe = mitarbeiterListe;
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
     * Gets the responseHeader value for this ReadMitarbeiterResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadMitarbeiterResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the mitarbeiterListe value for this ReadMitarbeiterResponseType.
     *
     * @return mitarbeiterListe   * Die Liste der gelesenen Mitarbeiter.
     */
    public MitarbeiterType[] getMitarbeiterListe() {
        return mitarbeiterListe;
    }

    /**
     * Sets the mitarbeiterListe value for this ReadMitarbeiterResponseType.
     *
     * @param mitarbeiterListe   * Die Liste der gelesenen Mitarbeiter.
     */
    public void setMitarbeiterListe(MitarbeiterType[] mitarbeiterListe) {
        this.mitarbeiterListe = mitarbeiterListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadMitarbeiterResponseType)) return false;
        ReadMitarbeiterResponseType other = (ReadMitarbeiterResponseType) obj;
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
                ((this.mitarbeiterListe == null && other.getMitarbeiterListe() == null) ||
                        (this.mitarbeiterListe != null &&
                                java.util.Arrays.equals(this.mitarbeiterListe, other.getMitarbeiterListe())));
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
        if (getMitarbeiterListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMitarbeiterListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMitarbeiterListe(), i);
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
